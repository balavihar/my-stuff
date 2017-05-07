package examples;

/**
 * Created by 609072804 on 30/04/2017.
 */
public interface HelloMBean {

    public void sayHello();
    public int add(int x, int y);

    public String getName();

    public int getCacheSize();
    public void setCacheSize(int size);
}
