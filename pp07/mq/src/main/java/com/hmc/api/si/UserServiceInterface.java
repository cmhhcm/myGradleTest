package com.hmc.api.si;

import com.hmc.api.command.CreateUserCommand;
import com.hmc.api.dto.UserDTO;

public interface UserServiceInterface {

    UserDTO createUser(CreateUserCommand cmd);
}
