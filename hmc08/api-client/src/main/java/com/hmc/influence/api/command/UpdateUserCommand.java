package com.hmc.influence.api.command;

import java.util.Date;

/**
 * Author:meice Huang
 * Time: 2019-08-02 11:12
 */
public class UpdateUserCommand extends CreateUserCommand {

    private String operatorId;
    
    private Date updateTime;

    public String getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
