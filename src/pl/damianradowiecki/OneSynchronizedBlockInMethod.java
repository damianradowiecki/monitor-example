package pl.damianradowiecki;

import java.util.Date;

public class OneSynchronizedBlockInMethod {

    public void waitForInSynchronizedBlock(int milliseconds){
        synchronized (this) {
            System.out.println("OneSynchronizedBlockInMethod.waitFor -> in synchronized block -> start (" + new Date() + ")");
            try {
                Thread.sleep(milliseconds);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("OneSynchronizedBlockInMethod.waitFor -> in synchronized block -> end (" + new Date() + ")");
        }
    }
}
