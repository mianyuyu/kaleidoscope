package com.bruce.puerile.common.model;

import com.bruce.puerile.login.model.OnlineUserModel;

/**
 * Created by bruce on 2016/8/11.
 */
public class SessionModel {

    public OnlineUserModel getOnlineUserModel() {
        return onlineUserModel;
    }

    public void setOnlineUserModel(OnlineUserModel onlineUserModel) {
        this.onlineUserModel = onlineUserModel;
    }

    private OnlineUserModel onlineUserModel;

    public boolean validateOnlineUser() {
        boolean result = false;
        if (this.getOnlineUserModel() == null) {
            return result;
        } else {
            return true;
        }
    }


}
