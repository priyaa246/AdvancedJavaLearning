package MultiThreading;

/**
 * 1) Make sure you extended the prebuilt THREAD CLASS //it comes from the JDK[java]
 * 2) Override the run method - NEED TO DO -> to specify what happens when you start a thread
 */
public class ThreadNumber1 extends Thread {
    @Override
    public void run() { //Whenever you call this method the THREAD STATE IS GOING TO CHANGE INTO RUNNING [Refer diff states of thread]
        try{  //code inside run() method is a logic that a thread is going to execute example: FUEL INDICATOR CODE, THE LEADERBOARD, THE SPEED
            System.out.println("Thread 1 is running");
        }catch (Exception e){
            System.out.println("Exception raised in Thread 1: "+e);
        }

    }
}
