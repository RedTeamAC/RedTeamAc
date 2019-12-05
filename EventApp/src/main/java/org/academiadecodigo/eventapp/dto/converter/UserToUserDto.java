package org.academiadecodigo.eventapp.dto.converter;

import org.academiadecodigo.eventapp.dto.UserDto;
import org.academiadecodigo.eventapp.model.User;
import org.springframework.core.convert.converter.Converter;

public class UserToUserDto extends AbstractConverter<User, UserDto> {

    @Override
    public UserDto convert(User user) {

        UserDto userDto = new UserDto();
        userDto.setId(user.getId());
        userDto.setName(user.getName());
        userDto.setLocation(user.getLocation());
        userDto.setContact(user.getContact());
        userDto.setEmail(user.getEmail());

        return userDto;
    }
}
