package task1.Class;

/**
 * I created a "worker" class that stores the job code
 */
public class Worker implements IPosition{
    public byte code=2;
    @Override
    public void output_on_display() {
        System.out.println("Worker");
    }
}
