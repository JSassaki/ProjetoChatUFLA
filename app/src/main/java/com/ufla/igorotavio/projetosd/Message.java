package com.ufla.igorotavio.projetosd;

import java.util.Date;

/**
 * Created by IgorOtávioCaetanoDin on 10/01/2018.
 */

public class Message {
    private String content,username;
    private String data;

    public Message(String content,String username) {
        this.content = content;
        this.username = username;

    }
    public Message(){}

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
