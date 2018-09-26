package com.light.springboot.web.test.producerAndConsumer;

/**
 * Created by zhaodongjun on 2018/8/15 0015.
 */
public class Message {
    private String msg;

    public Message(String str){
        this.msg=str;
    }

    public String getMsg() {
        return msg;
    }
}
