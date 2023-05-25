package com.seig.consumer1;

import java.io.Serializable;

public class User implements Serializable {
    String uid;
    String username;
    String password;
    public User(){
        super();
    }

    public User(String uid, String name, String pwd) {
        super();
        this.uid = uid;
        username = name;
        password = pwd;
    }

    public void setUid(String s) {
        uid = s;
    }
    public String getUid() {
        return uid;
    }

    public void setUsername(String s) {
        username = s;
    }

    public void setPassword(String p) {
        password = p;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

}
