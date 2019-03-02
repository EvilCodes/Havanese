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
    private Date registerDate;
    private String userAvatar;
    private String signature;
    private int emailStatus;

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


    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public String getUserAvatar() {
        return userAvatar;
    }

    public void setUserAvatar(String userAvatar) {
        this.userAvatar = userAvatar;
    }

    public int getEmailStatus() {
        return emailStatus;
    }

    public void setEmailStatus(int emailStatus) {
        this.emailStatus = emailStatus;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", nick='" + nick + '\'' +
                ", password='" + password + '\'' +
                ", registerDate=" + registerDate +
                ", userAvatar='" + userAvatar + '\'' +
                ", signature='" + signature + '\'' +
                ", emailStatus=" + emailStatus +
                '}';
    }
}
