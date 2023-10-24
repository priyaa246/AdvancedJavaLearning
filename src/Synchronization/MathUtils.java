package Synchronization;
//This class is for -> supply a number and prints it multiples
//Whatever number you give, you will get till 5 multiples of that num
public class MathUtils {

    /**
     * So this is the method that has been randomly accessed by the threads
     * Now what to do is: put SYNCHRONIZED KEYWORD INFRONT OF THE METHOD
     * Now the whole method gets synchronized now, one thread will get execute this method once.
     * There never will be scenario where 2 threads simultaneously execute this method
     * @param num
     *
     * Instead of making whole method because there will be case we have some other block of code which doesn't cause a problem
     * So find the piece of code which is causing the issue and put thar inside an SYNCHRONIZED BLOCK.
     */
    /*synchronized*/ void getMultiples(int num){

        synchronized (this) { //Thread sensitive piece of code, this piece will be accessible to one thread at a time
            for (int i = 1; i <= 5; i++) {
                System.out.println(num * i);
                try {
                    Thread.sleep(400); //First it will do one multiplication and then it will sleep for 400 ms
                    //Means pause it's execution for 400 milliseconds and it's going to leave the CPU ideal for 400 ms
                    //If another thread running in the system and that thread will get the share of the CPU for that 400 ms.
                    //After 400 ms,that thread will wake up and goes hunt for the ideal CPU
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }
    }
}
