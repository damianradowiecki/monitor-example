package pl.damianradowiecki;

import java.util.Date;

public class OneSynchronizedMethodClass {

    public synchronized void waitFor(int milliseconds){
        System.out.println("OneSynchronizedMethodClass.waitFor -> start (" + new Date() + ")");
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("OneSynchronizedMethodClass.waitFor -> end   (" + new Date() + ")");
    }
}
