package spittr.web;

import java.util.List;

public class Table {
    private int code;
    private String msg="";
    private int count ;
    private List<People> data;
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<People> getData() {
        return data;
    }

    public void setData(List<People> data) {
        this.data = data;
    }
}
