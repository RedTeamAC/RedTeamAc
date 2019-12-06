package org.academiadecodigo.eventapp.controllers;

import org.academiadecodigo.eventapp.dto.UserDto;
import org.academiadecodigo.eventapp.dto.converter.EventToEventDto;
import org.academiadecodigo.eventapp.dto.converter.UserDtoToUser;
import org.academiadecodigo.eventapp.model.Event;
import org.academiadecodigo.eventapp.model.User;
import org.academiadecodigo.eventapp.service.EventService;
import org.academiadecodigo.eventapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/reserve")
public class RestReservationController {

    private EventService eventService;
    private EventToEventDto eventToEventDtoConverter;
    private UserDtoToUser userDtoToUserConverter;
    private UserService userService;

    @Autowired
    public void setEventService(EventService eventService) {
        this.eventService = eventService;
    }

    @Autowired
    public void setEventToEventDto(EventToEventDto eventoToEventDto) {
        this.eventToEventDtoConverter = eventoToEventDto;
    }


    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @Autowired
    public void setUserDtoToUserConverter(UserDtoToUser userDtoToUserConverter) {
        this.userDtoToUserConverter = userDtoToUserConverter;
    }

    @RequestMapping(method = RequestMethod.PUT, path = {"/{id}"})
    public ResponseEntity<?> makeReservation(@PathVariable Integer id,
                                             @Valid @RequestBody UserDto userDto,
                                             BindingResult bindingResult){

        Event event = eventService.get(id);

        if (event == null || bindingResult.hasErrors()){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        User user = userService.findByEmail(userDto.getEmail());

        if (user == null) {
            user = userService.save(userDtoToUserConverter.convert(userDto));
        }

        user.getUserEvents().add(event);
        event.getUserList().add(user);
        eventService.save(event);
        userService.save(user);

        //eventService.test(user, id);

        return new ResponseEntity<>(HttpStatus.OK);

    }

}
