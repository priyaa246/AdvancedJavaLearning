package Synchronization;

public class Thread2 implements Runnable {
    MathUtils mu;

    public Thread2(MathUtils mu) {
        this.mu = mu;
    }

    @Override
    public void run() {
        try{
            mu.getMultiples(3); //To print the multiples of 3
            //This thread also using that class and access the method
        }catch (Exception e){
            System.out.println("Exception raised in Thread 2: "+e);
        }

    }
}
