package com.hmc.api.dto;

import com.hmc.api.value.Gender;

/**
 * Author:meice Huang
 * Time: 2019-08-01 17:29
 */
public class UserDTO {

    private String userId;

    private String name;

    private Gender gender;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

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
