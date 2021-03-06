package One;

// 2. Implementing the Runnable interface,
// This marks this class as Runnable and 
// assures that this class contains the run()
// method. Because any class implementing the
// interface should define the abstract method
// of the interface, otherwise it becomes abstract.
class MyTask implements Runnable {

    // Thread execution begins here.
    @Override
    public void run() {
        // DO THAT TASK HERE.
        for(int i=0; i <= 1500; i++) {
            System.out.print("-");
        }
    }
}