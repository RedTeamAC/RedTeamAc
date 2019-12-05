package org.academiadecodigo.eventapp.controllers;

import org.academiadecodigo.eventapp.dto.EventDto;
import org.academiadecodigo.eventapp.dto.UserDto;
import org.academiadecodigo.eventapp.dto.converter.EventDtoToEvent;
import org.academiadecodigo.eventapp.dto.converter.EventToEventDto;
import org.academiadecodigo.eventapp.model.Event;
import org.academiadecodigo.eventapp.model.User;
import org.academiadecodigo.eventapp.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/event")
public class RestEventController {

    private EventService eventService;
    private EventDtoToEvent eventDtoToEventConverter;
    private EventToEventDto eventToEventDtoConverter;

    @Autowired
    public void setEventService(EventService eventService) {
        this.eventService = eventService;
    }

    @Autowired
    public void setEventDtoToEventConverter(EventDtoToEvent eventDtoToEventConverter) {
        this.eventDtoToEventConverter = eventDtoToEventConverter;
    }

    @Autowired
    public void setEventToEventDtoConverter(EventToEventDto eventToEventDtoConverter) {
        this.eventToEventDtoConverter = eventToEventDtoConverter;
    }


    @RequestMapping(method = RequestMethod.POST , path = {"/", "", "add"})
    public ResponseEntity<?> addEvent(@Valid @RequestBody EventDto eventDto, BindingResult bindingResult, UriComponentsBuilder uriComponentsBuilder){



        if(bindingResult.hasErrors() || eventDto.getId()!= null){

            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        Event savedEvent = eventService.save(eventDtoToEventConverter.convert(eventDto));

        return new ResponseEntity<>(eventToEventDtoConverter.convert(savedEvent), HttpStatus.CREATED);
    }

    @RequestMapping(method = RequestMethod.GET , path = {"/{id}"})
    public ResponseEntity<EventDto> getUser(@PathVariable Integer id){

        Event event = eventService.get(id);

        if (event == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(eventToEventDtoConverter.convert(event), HttpStatus.OK);

    }

    @RequestMapping(method = RequestMethod.GET, path = {"/", "", "list"})
        public ResponseEntity<List<EventDto>> listEvents(){

            return  new ResponseEntity<>(eventToEventDtoConverter.convert(eventService.findAll()), HttpStatus.OK);

        }


    }


