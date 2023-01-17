package pl.damianradowiecki;

import java.util.Date;

public class TwoSynchronizedMethodsClass {

    public synchronized void waitFor1(int milliseconds){
        System.out.println("TwoSynchronizedMethodsClass.waitFor1 -> start (" + new Date() + ")");
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("TwoSynchronizedMethodsClass.waitFor1 -> end   (" + new Date() + ")");
    }

    public synchronized void waitFor2(int milliseconds){
        System.out.println("TwoSynchronizedMethodsClass.waitFor2 -> start (" + new Date() + ")");
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("TwoSynchronizedMethodsClass.waitFor2 -> end   (" + new Date() + ")");
    }
}
