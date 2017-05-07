package examples;

import java.util.Date;
import java.util.Queue;

/**
 * Created by 609072804 on 01/05/2017.
 */
public class QueueSampler
        implements QueueSamplerMXBean {

    private Queue<String> queue;
    private int count = 0;

    public QueueSampler (Queue<String> queue) {
        this.queue = queue;
    }

    public QueueSample getQueueSample() {
        synchronized (queue) {
            return new QueueSample(new Date(),
                    queue.size(), queue.peek());
        }
    }

    public void clearQueue() {
        synchronized (queue) {
            queue.clear();
        }
    }

    public void deleteOneFromQueue() {
        count++;
        if(queue.contains("Request-"+count))
            queue.remove("Request-"+count);

    }

    public void addToQueue() {
        count++;
        if(!queue.contains("Request-"+count))
            queue.add("Request-"+count);

    }
}

