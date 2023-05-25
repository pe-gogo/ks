package com.seig.dbservice.bean;

import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="stu")
public class User implements Serializable {
    private static final long serialVersionUID = 1L;
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

    @Id
    @GenericGenerator(name = "session_info_uuid_gen",strategy = "assigned")
    @GeneratedValue(generator = "session_info_uuid_gen")
    @Column(name = "uid")
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
