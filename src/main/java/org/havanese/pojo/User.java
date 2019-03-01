package org.havanese.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by blackfox on 2018/12/8 0008.
 */
public class User implements Serializable{
    private int id;
    private String email;
    private String nick;
    private String password;
    private Date register_date;
    private String user_avatar;
    private String signature;
    private int email_status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getRegister_date() {
        return register_date;
    }

    public void setRegister_date(Date register_date) {
        this.register_date = register_date;
    }

    public String getUser_avatar() {
        return user_avatar;
    }

    public void setUser_avatar(String user_avatar) {
        this.user_avatar = user_avatar;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public int getEmail_status() {
        return email_status;
    }

    public void setEmail_status(int email_status) {
        this.email_status = email_status;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", nick='" + nick + '\'' +
                ", password='" + password + '\'' +
                ", register_date=" + register_date +
                ", user_avatar='" + user_avatar + '\'' +
                ", signature='" + signature + '\'' +
                ", email_status=" + email_status +
                '}';
    }
}
