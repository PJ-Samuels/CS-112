/*
 * CS112
 *
 * Lab 2, Methods
 *
 * name: 
 * email:
 *
 *
 * Note: Because this class is simply a collection of static methods 
 * and it does not have a main method, you cannot run it.
 * 
 * You will need to write a main method that makes calls to each of the
 * methods to test them. Follow the instructions in the lab.
 */

public class Methods {
    /*
     * print3Times - takes a string s and prints it 3 times
     */
    public static void print3Times(String s) {
        for (int i = 0; i < 3; i++) {
            System.out.println(s);
        }
    }
    public static void printNTimes(int n,String s) {
        for (int i = 0; i < n; i++) {
            System.out.println(s);
        }
    public static void greetMe()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter you name:");
        String name = input.next();
        System.out.println("Hello " + name + ", Welcome to CS112");
        System.out.print(name + " how old are you?");
        final int age = input.nextInt();
        insult()
    }
    public static void insult(int age)
    {
        String ans;
        if(age >= 1 && age <= 10)
        {
            ans = "1 <= 10 everyone is sweet"
        }
        else if(age >= 11 && age <= 17)
        {
            ans = "they are dweebs"
        }
        else if(age >= 18 && age <= 20)
        {
            ans = "they are counting down to legal age"
        }
        else if(age == 21)
        {
            ans = "exactly they just made legal age"
        }
        else if(age >= 22 && age <= 29)
        {
            ans = "they are counting down to 30"
        }
        else if(age >= 30 && age <= 40)
        {
            ans = "they are suffering adults"
        }
        else if(age >= 41 && age < 50)
        {
            ans = "they are miserable adults"

        }
        else if(age >= 50)
        {
            ans = "you a speechless!!"
        }
        return ans;
    }
}