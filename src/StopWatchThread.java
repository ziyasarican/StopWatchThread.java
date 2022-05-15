public class StopWatchThread implements Runnable{

    private Thread thread;
    private String threadName;

    public StopWatchThread(String threadName) {
        this.threadName = threadName;
        System.out.println("Occuring : " + threadName);
    }
    @Override
    public void run() {
        System.out.println("Running : "+ threadName);
            try {
                for (int i = 1; i <= 10 ; i++){
                    System.out.println(threadName + " : " + i);
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        System.out.println("Thread over : " + threadName);

    }

    public void start(){
        System.out.println("Thread object occur");
        if(thread == null){
            thread = new Thread(this,threadName);
            thread.start();
        }
    }
}
