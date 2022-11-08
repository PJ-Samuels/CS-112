import java.util.Scanner;
public class StudentInfo{
    public static void main(final String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter you name:");
        String name = input.next();
        System.out.println("Hello " + name + ", Welcome to CS112");
        System.out.print(name + " how old are you?");
        final int age = input.nextInt();
        System.out.print(age);
        input.close();
    }
}