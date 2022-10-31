import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo extends Thread {

    static ConcurrentHashMap<String, String> courseRatings = new ConcurrentHashMap<String, String>();

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        courseRatings.put("Kubernetes", "3.4");
    }

    public static void main(String[] args) throws InterruptedException {

        ConcurrentHashMapDemo arrayListProblem = new ConcurrentHashMapDemo();
        arrayListProblem.start();

        courseRatings.put("Java", "5.0");
        courseRatings.put("Python", "4.8");
        courseRatings.put("AWS", "4.7");
        courseRatings.put("Docker", "4.9");

        Iterator<String> iterator = courseRatings.keySet().iterator();

        while (iterator.hasNext()){
            Thread.sleep(2000);
            String course = iterator.next();
            System.out.println(courseRatings.get(course));

        }

        System.out.println(courseRatings);

    }
}
