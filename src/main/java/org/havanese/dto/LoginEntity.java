package org.havanese.dto;

import java.io.Serializable;

/**
 * Created by Administrator on 2019/3/4 0004.
 */
public class LoginEntity implements Serializable{
    private String emailAddress;
    private String password;
    private String verifiedCode;

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getVerifiedCode() {
        return verifiedCode;
    }

    public void setVerifiedCode(String verifiedCode) {
        this.verifiedCode = verifiedCode;
    }

    @Override
    public String toString() {
        return "LoginEntity{" +
                "emainAddress='" + emailAddress + '\'' +
                ", password='" + password + '\'' +
                ", verifiedCode='" + verifiedCode + '\'' +
                '}';
    }
}
