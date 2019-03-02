package org.havanese.pojo;

import java.io.Serializable;

/**
 * Created by blackfox on 2019/3/2 0002.
 * @desc 用于传输数据的dto
 */
public class Result implements Serializable{
    private int codeStatus;
    private String resultDesc;
    private Object data;


    public int getCodeStatus() {
        return codeStatus;
    }

    public void setCodeStatus(int codeStatus) {
        this.codeStatus = codeStatus;
    }

    public String getResultDesc() {
        return resultDesc;
    }

    public void setResultDesc(String resultDesc) {
        this.resultDesc = resultDesc;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Result{" +
                "codeStatus=" + codeStatus +
                ", resultDesc='" + resultDesc + '\'' +
                ", data=" + data +
                '}';
    }
}
