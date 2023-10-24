package Synchronization;

public class Thread1 extends Thread {
    MathUtils mu;

    public Thread1(MathUtils mu) {
        this.mu = mu;
    }
    @Override
    public void run() {
        try{
            mu.getMultiples(2); //To print the multiples of 2
        }catch (Exception e){
            System.out.println("Exception raised in Thread 1: "+e);
        }

    }

}
