package org.academiadecodigo.eventapp.dto.converter;

import org.academiadecodigo.eventapp.dto.EventDto;
import org.academiadecodigo.eventapp.model.Event;

public class EventToEventDto extends AbstractConverter<Event, EventDto> {

    @Override
    public EventDto convert(Event event) {

        EventDto eventDto = new EventDto();

        eventDto.setId(event.getId());
        eventDto.setName(event.getName());
        eventDto.setLocation(event.getLocation());
        eventDto.setContact(event.getContact());
        eventDto.setType(event.getType());
        eventDto.setMinAttendance(event.getMinAttendance());
        eventDto.setMaxAttendance(event.getMaxAttendance());
        eventDto.setDescription(event.getDescription());

        return eventDto;
    }
}
