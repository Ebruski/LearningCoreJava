import java.util.concurrent.BlockingQueue;

public class OrderProducer implements Runnable{

    private BlockingQueue<String> queue;

    public OrderProducer(BlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            queue.put("Mac Book Pro");
            queue.put("Dell Laptop");
            queue.put("Hp Laptop");
            queue.put("Iphone");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
