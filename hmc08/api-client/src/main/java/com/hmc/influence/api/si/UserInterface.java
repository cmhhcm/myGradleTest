package com.hmc.influence.api.si;

import com.hmc.influence.api.command.CreateUserCommand;
import com.hmc.influence.api.dto.UserDTO;

/**
 * Author:meice Huang
 * Time: 2019-08-02 10:02
 */
public interface UserInterface {
    UserDTO createUser(CreateUserCommand cmd);

    UserDTO getUserById(String userId);
}
