package examples;

/**
 * Created by 609072804 on 01/05/2017.
 */
public interface QueueSamplerMXBean {
    public QueueSample getQueueSample();
    public void clearQueue();
    public void deleteOneFromQueue();
    public void addToQueue();
}

