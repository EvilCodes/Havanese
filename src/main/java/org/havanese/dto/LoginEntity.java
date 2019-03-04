package org.havanese.dto;

import java.io.Serializable;

/**
 * Created by Administrator on 2019/3/4 0004.
 */
public class LoginEntity implements Serializable{
    private String emainAddress;
    private String password;
    private String verifiedCode;

    public String getEmainAddress() {
        return emainAddress;
    }

    public void setEmainAddress(String emainAddress) {
        this.emainAddress = emainAddress;
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
                "emainAddress='" + emainAddress + '\'' +
                ", password='" + password + '\'' +
                ", verifiedCode='" + verifiedCode + '\'' +
                '}';
    }
}
