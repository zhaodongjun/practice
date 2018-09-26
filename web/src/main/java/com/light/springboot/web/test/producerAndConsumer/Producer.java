package com.light.springboot.web.test.producerAndConsumer;

/**
 * Created by zhaodongjun on 2018/8/15 0015.
 */
import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {

    private BlockingQueue<Message> queue;

    public Producer(BlockingQueue<Message> q){
        this.queue=q;
    }
    @Override
    public void run() {
        //produce messages
        for(int i=0; i<10; i++){
        Message msg = new Message(""+i);
        try {
            Thread.sleep(i);
            queue.put(msg);
            System.out.println("Produced "+msg.getMsg());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    //adding exit message
    Message msg = new Message("exit");
        try {
            queue.put(msg);
        } catch (InterruptedException e) {
            e.printStackTrace();

        }
    }

}