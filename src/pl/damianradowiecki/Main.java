package pl.damianradowiecki;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        testOneSynchronizedMethodsClass();
        testTwoSynchronizedMethodsClass();
        testSynchronizedBlock();
    }

    private static void testOneSynchronizedMethodsClass() throws InterruptedException {
        OneSynchronizedMethodClass oneSynchronizedMethodClass = new OneSynchronizedMethodClass();
        Thread thread1 = new Thread(() -> oneSynchronizedMethodClass.waitFor(5000));

        Thread thread2 = new Thread(() -> oneSynchronizedMethodClass.waitFor(5000));

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
    }

    private static void testTwoSynchronizedMethodsClass() throws InterruptedException {
        TwoSynchronizedMethodsClass twoSynchronizedMethodsClass = new TwoSynchronizedMethodsClass();

        Thread thread1 = new Thread(() -> twoSynchronizedMethodsClass.waitFor1(5000));

        Thread thread2 = new Thread(() -> twoSynchronizedMethodsClass.waitFor2(5000));

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
    }

    private static void testSynchronizedBlock() throws InterruptedException {
        OneSynchronizedBlockInMethod oneSynchronizedBlockInMethod = new OneSynchronizedBlockInMethod();
        Thread thread1 = new Thread(() -> oneSynchronizedBlockInMethod.waitForInSynchronizedBlock(5000));

        Thread thread2 = new Thread(() -> oneSynchronizedBlockInMethod.waitForInSynchronizedBlock(5000));

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
    }
}
