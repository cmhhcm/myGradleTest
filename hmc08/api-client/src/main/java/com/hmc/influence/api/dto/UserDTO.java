package com.hmc.influence.api.dto;

import com.hmc.influence.api.value.Gender;

/**
 * Author:meice Huang
 * Time: 2019-08-02 10:05
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

    public static void main(String[] args) {
        UserDTO userDTO = new UserDTO();
        userDTO.setGender(null);
        System.out.println(userDTO.toString());
    }
}
