package org.academiadecodigo.eventapp.dto.converter;

import org.academiadecodigo.eventapp.dto.EventDto;
import org.academiadecodigo.eventapp.model.Event;
import org.academiadecodigo.eventapp.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EventDtoToEvent extends AbstractConverter<EventDto, Event>{

    private EventService eventService;

    @Autowired
    public void setEventService(EventService eventService) {
        this.eventService = eventService;
    }

    @Override
    public Event convert(EventDto eventDto) {

        Event event = (eventDto.getId() != null ? eventService.get(eventDto.getId()) : new Event());

        event.setName(eventDto.getName());
        event.setLocation(eventDto.getLocation());
        event.setContact(eventDto.getContact());
        event.setType(eventDto.getType());
        event.setMinAttendance(eventDto.getMinAttendance());
        event.setMaxAttendance(eventDto.getMaxAttendance());
        event.setDescription(eventDto.getDescription());

        return event;
    }
}
