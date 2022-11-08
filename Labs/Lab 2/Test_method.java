
import java.util.Scanner;

public class Test_method {
    /*
     * This method should take an integer x and return:
     *    2x when x is odd
     *    the unchanged value of x when x is even
     */
    public static int double_if_odd(int x) {
        if(x%2 == 1){
            x = x*2;
        }
        return x;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer x:" );
        int x = input.nextInt();

        System.out.println("double_if_odd(x) = "+ double_if_odd(x));
        System.out.println(15/2.0);
        input.close();
        int i = 0;
        while (i > 30) {
            i = 5;
            System.out.println(i);
            i++;
        }      
    }


}