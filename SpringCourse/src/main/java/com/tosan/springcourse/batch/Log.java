package com.tosan.springcourse.batch;

import java.util.Date;

/**
 * @author Sahar Rahmatian
 */
public class Log {
    private Date date;
    private String operation;
    private String user;
    private String ip;

    public Log(Date date, String operation, String user, String ip) {
        this.date = date;
        this.operation = operation;
        this.user = user;
        this.ip = ip;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
}
