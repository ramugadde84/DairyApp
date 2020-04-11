package com.sample.test.TestDemo;

import java.util.concurrent.ThreadPoolExecutor;

public class MyMonitorThread implements Runnable {
    private ThreadPoolExecutor executor;

    private int seconds;

    private boolean run = true;

    public MyMonitorThread(ThreadPoolExecutor executor, int delay) {
        this.executor = executor;
        this.seconds = delay;
    }

    public void shutdown() {
        this.run = false;
    }

    @Override
    public void run() {
        while (run) {

                /*this.executor.getPoolSize(),
                this.executor.getCorePoolSize(),
                this.executor.getActiveCount(),
                this.executor.getCompletedTaskCount(),
                this.executor.getTaskCount(),
                this.executor.isShutdown(),
                this.executor.isTerminated()));*/
            try {
                Thread.sleep(seconds * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
