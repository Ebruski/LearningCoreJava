public class MyTest {
    public static void main(String[] args) {
        MyTest st = new MyTest();
        st.run();

        Thread currentThread = Thread.currentThread();
        System.out.println("Thread Name is " + currentThread.getName());
    }

    void run(){
        Thread currentThread = Thread.currentThread();
        System.out.println("Thread Name2 is " + currentThread.getName());
    }
}
