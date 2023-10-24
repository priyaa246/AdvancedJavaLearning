package MultiThreading;

/**
 *
 * While creating a thread Rather than extending Thread class I am implementing Runnable interface
 * (Which is functional Interface which has only one method run())
 * WHY?  Because there might be a use case that I need to extend my ThreadNumber2 class from any of my custom java class
 * Remember Java doesn't support multiple inheritance?
 * So at a time you can only extend this class from one class
 *
 * For example: you need to extend Student class from Thread2 and also extend Thread class
 * it will give us error
 *
 * WHEN TO USE? Also create it as a Thread but also extend it from some of our parent class.
 * That's why java provides implements runnable
 * So that you can treat this class as thread
 */


//public class ThreadNumber2 extends Main extends Thread -> Doesn't support
//public class ThreadNumber2 extends Main implements Runnable -> Support

public class ThreadNumber2 implements Runnable

{

    @Override
    public void run() {
        try{
            System.out.println("Thread 2 is running");
        }catch (Exception e){
            System.out.println("Exception raised in Thread 2: "+e);
        }

    }
}
