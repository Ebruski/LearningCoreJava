package assignment;

public class ExceptionDemo {

    public static void main(String[] args) {
        try {
            Thread.sleep(2000);
            throw new InterruptedException();
        } catch (InterruptedException e) {
            throw new MyThreadException("Testing Exceptions");
        }
    }

}

