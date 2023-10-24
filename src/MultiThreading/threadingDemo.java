package MultiThreading;

public class threadingDemo {
    public static void main(String[] args) {
        int n=10;
        for(int i=0;i<n;i++){

            //2 DIFF WAYS  OF CREATING THREAD - Extends thread class(thread1), implementing runnable interface(thread2)
            //Initialization is SIMPLE, when extending from Thread class itself

            ThreadNumber1 thread1 = new ThreadNumber1(); //To run a thread - 1st thing - Initialize a class which has run() method
            thread1.start(); //This method we haven't written anywhere still works how? //Internal method of the thread class which in turn going to call run method/
            /**
             * Note: V V important: We are not invoking the run method directly, we just going to start the thread
             * which is going to change the state of the thread from READY TO RUNNING
             *
             * start() method -> Has  the responsibility of change the state from ready to running,
             * It calls the run() method internally
             * And whatever present in that run method starts executing
             */


            //Note: It's Java Thread class not ThreadNumber2
            Thread thread2 = new Thread(new ThreadNumber2()); //Inside new thread we provide our own thread class type
            thread2.start();

            /**
             * Observe the o/p: 1st thread running in sequence and then no sequence/order is being maintained.
             * Power of concurrency: Threads never run in sequence,they run in parallel
             * and which thread is going to execute first we can’t predict that.
             * [Refer the code with its o/p]
             *
             *
             *
             */

            /** MULTITHREADING REAL LIFE EXAMPLE:
             * A real world example:
             *
             * MS word
             *
             * You are typing a paragraph on MS word. But in background one more thread running
             * and checking your spelling mistakes.
             * As soon as you do a typo the other thread notifies you about the typo.
             * And makes your life easy.
             */



        }
    }
}
