package com.hmc.influence.api.command;

import com.hmc.influence.api.value.Gender;

/**
 * Author:meice Huang
 * Time: 2019-08-02 10:03
 */
public class CreateUserCommand {
    private String name;
    private Gender gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
