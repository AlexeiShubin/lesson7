package task1.Class;

/**
 * I created a "director" class that stores the job code
 */
public class Director implements IPosition{
    public byte code=1;
    @Override
    public void output_on_display() {
        System.out.println("Director");
    }
}
