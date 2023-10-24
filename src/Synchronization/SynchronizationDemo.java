package Synchronization;
/**
 * EXAMPLE SCENARIO:
 *
 * 2 threads (Thread1, Thread2) accessing the same object MathUtils oda mu -> obj,
 * supplying different values and expecting the correct output
 */
public class SynchronizationDemo {
    public static void main(String[] args) {
        MathUtils muObj = new MathUtils();

        Thread1 t1 = new Thread1(muObj);
        t1.start();

        Thread t2 = new Thread(new Thread2(muObj));
        t2.start();

        //Even after starting the t1 first we will strange output in random manner.
        //It would be nice if it will be like 2,4,6,8,10 at once
        //And 3,6,9,12,15 at once

        //But note that just the order is random but it never exceeds/koranjufied than the limit
        //Where for 2 which is 10, for 3 it is 15
        //So each thread has its space but, they are connected.

        //Changing the state of the object randomly here.

        //So t1 got lock on that method and starts executing, occupied that method.

        //You need to be aware of the THREAD SENSITIVE CODE, which creates problem if multiple threads ran means

        /**
         * So instead of locking the whole method, you should find out which piece of code is causing the problem
         * and use synchronized block in that.
         */
    }
}
