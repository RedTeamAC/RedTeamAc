package org.academiadecodigo.eventapp.dto.converter;

import org.academiadecodigo.eventapp.dto.UserDto;
import org.academiadecodigo.eventapp.model.User;
import org.academiadecodigo.eventapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserDtoToUser extends AbstractConverter<UserDto, User> {

    @Autowired
    private UserService userService;

    @Override
    public User convert(UserDto userDto) {

        User user = (userDto.getId() != null ? userService.get(userDto.getId()) : new User());

        user.setName(userDto.getName());
        user.setLocation(userDto.getLocation());
        user.setContact(userDto.getContact());
        user.setEmail(userDto.getEmail());

        return user;
    }
}
