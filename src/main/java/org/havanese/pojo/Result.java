package org.havanese.pojo;

import java.io.Serializable;

/**
 * Created by blackfox on 2019/3/2 0002.
 * @desc 用于传输数据的dto
 */
public class Result implements Serializable{
    private int code_status;
    private String result_desc;
    private Object data;


    public int getCode_status() {
        return code_status;
    }

    public void setCode_status(int code_status) {
        this.code_status = code_status;
    }

    public String getResult_desc() {
        return result_desc;
    }

    public void setResult_desc(String result_desc) {
        this.result_desc = result_desc;
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
                "code_status=" + code_status +
                ", result_desc='" + result_desc + '\'' +
                ", data=" + data +
                '}';
    }
}
