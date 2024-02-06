package task1.Runner;

import task1.Class.Accountant;
import task1.Class.Director;
import task1.Class.Worker;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        Director director=new Director();
        Worker worker=new Worker();
        Accountant accountant=new Accountant();

        System.out.print("enter position code: ");
        byte code= scanner.nextByte();

        if (code== director.code){
            director.output_on_display();
        }else if(code== worker.code){
            worker.output_on_display();
        }else if(code== accountant.code){
            accountant.output_on_display();
        }else{
            System.out.println("not correct code");
        }
    }
}
