package task1.Class;

/**
 * I created an "accountant" class that stores the job code
 */

public class Accountant implements IPosition{
    public byte code=3;
    @Override
    public void output_on_display() {
        System.out.println("Accountant");
    }
}
