package com.bruce.puerile.login.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by qiaoqiao on 2016/8/30.
 */
public class PageMessageModel {

    private List<String> messageList;
    public String ss;

    public List<String> getMessageList () {
        return messageList;
    }

    public void addMessage (String message) {
        if (messageList == null || messageList.isEmpty()) {
            messageList = new ArrayList<String>();
        } else {
            messageList.add(message);
        }
    }

    public String getMessage (int index) {
        if (messageList == null || messageList.isEmpty() || index < 0) {
            return "";
        } else {
            if (messageList.size() <= index) {
                return "";
            } else {
                return messageList.get(index);
            }
        }
    }

    public String getFirstMessage () {
        return getMessage (0);
    }
}
