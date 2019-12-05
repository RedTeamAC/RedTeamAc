package org.academiadecodigo.eventapp.controllers;

import org.academiadecodigo.eventapp.dto.UserDto;
import org.academiadecodigo.eventapp.dto.converter.UserDtoToUser;
import org.academiadecodigo.eventapp.dto.converter.UserToUserDto;
import org.academiadecodigo.eventapp.model.User;
import org.academiadecodigo.eventapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/user")
public class RestUserController {

    private UserService userService;
    private UserDtoToUser dtoToUserConverter;
    private UserToUserDto userToDtoConverter;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @Autowired
    public void setDtoToUserConverter(UserDtoToUser dtoToUserConverter) {
        this.dtoToUserConverter = dtoToUserConverter;
    }

    @Autowired
    public void setUserToDtoConverter(UserToUserDto userToDtoConverter) {
        this.userToDtoConverter = userToDtoConverter;
    }

    @RequestMapping(method = RequestMethod.POST, path = {"/","","/add"})
    public ResponseEntity<?> addUser(@Valid @RequestBody UserDto userDto, BindingResult bindingResult, UriComponentsBuilder uriComponentsBuilder){

        if(bindingResult.hasErrors() || userDto.getId()!= null){

            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        User savedUser = userService.save(dtoToUserConverter.convert(userDto));

        UriComponents uriComponents = uriComponentsBuilder.path("/api/user/" + savedUser.getId()).build();

        // set headers with the created path
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(uriComponents.toUri());

        return new ResponseEntity<>(userToDtoConverter.convert(savedUser), HttpStatus.CREATED);

    }

    @RequestMapping(method = RequestMethod.GET , path = {"/{id}"})
    public ResponseEntity<UserDto> getUser(@PathVariable Integer id){

        User user = userService.get(id);

        if (user == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(userToDtoConverter.convert(user), HttpStatus.OK);

    }



    /*

    public void getUser();
    public void getEvent();

    public void registerUser();
    public void registerEvent();




    */
}
