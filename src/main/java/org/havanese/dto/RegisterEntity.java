package org.havanese.dto;

import java.io.Serializable;

/**
 * Created by Administrator on 2019/3/2 0002.
 */
public class RegisterEntity implements Serializable{
    private String email;
    private String nick;
    private String password;
    private String repassword;
    private String vercode;


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

    public String getRepassword() {
        return repassword;
    }

    public void setRepassword(String repassword) {
        this.repassword = repassword;
    }

    public String getVercode() {
        return vercode;
    }

    public void setVercode(String vercode) {
        this.vercode = vercode;
    }

    @Override
    public String toString() {
        return "RegisterEntity{" +
                "email='" + email + '\'' +
                ", nick='" + nick + '\'' +
                ", password='" + password + '\'' +
                ", repassword='" + repassword + '\'' +
                ", vercode='" + vercode + '\'' +
                '}';
    }
}
