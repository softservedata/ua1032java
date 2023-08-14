package homeWork_15_Thread;

public class MyRunnable extends Thread{
    private  int name;

    public MyRunnable(int name){
        this.name=name;

    }

    @Override
    public void run() {
        for (int i =0; i<5; i++){
            System.out.println(name);
        }
    }
}
