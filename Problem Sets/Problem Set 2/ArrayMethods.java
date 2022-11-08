import java.util.*;
public class ArrayMethods {
    public static final String[] DAYS = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    public static void main(String[] args){
        int[] b1 = {-1, 5, 4, 2, 7, -1, 2};
        int[] b2 = ArrayMethods.copyReplace(b1, -1, 22);
        System.out.println( Arrays.toString(b2) );

        int[] a = {0, 2, 4, 6, 8, 10};
        System.out.println(Arrays.toString(a));
        ArrayMethods.swapAdjacent(a);
        System.out.println( Arrays.toString(a) );

        int[] a1 = {1,2,3,4,5,6};
        int[] a2 = {10,11,12,13};
        System.out.println( Arrays.toString( ArrayMethods.reverseInterchange(a1, a2) ) );

        int[] c1 = {3, 8, 6, 14, -3, 0, 14, 207, 98, 12};
        System.out.println(Arrays.toString(c1));
        System.out.println( ArrayMethods.maxSorted(c1));

        Scanner scan = new Scanner(System.in);
        System.out.println("enter day:");
        String input = scan.nextLine();
        System.out.println( ArrayMethods.getIndexOfDay(input) );
        scan.close();
    }
    public static void swapAdjacent(int[] values){
        if(values == null)
            throw new IllegalArgumentException("Invalid input");
        for (int i = 0; i < values.length - 1; i += 2) {
            int c = values[i] + values[i + 1];
            values[i] = c - values[i];
            values[i + 1] = c - values[i + 1];
        }
       }
       public static int[] copyReplace(int[] values, int oldVal, int newVal)
       {
            for(int i =0; i < values.length-1; i++)
            {
                if(values[i] == oldVal)
                    values[i] = newVal;
            }
            return values;
       }
       public static int maxSorted(int[] values)
       {
            if(values == null)
                throw new IllegalArgumentException("Invalid input");
            if(values.length == 0)
                return 0;

            int count = 0;
            int highest = 1;
            for(int i = 0; i < values.length-1; i++)
            {
                count+=1;
                if( values[i] <= values[i+1])
                {
                    
                    if(count >= highest)
                        highest = count;
                }   
                else
                    count = 0;
            }
           return highest+1;   
        }
        public static int getIndexOfDay(String day)
        {

            if(day == null)
                return -1;

            int index = -1;
            for(int i = 0; i < DAYS.length-1; i++)
            {
                String temp = DAYS[i].toLowerCase();
                String temp2 = day.toLowerCase();
                if(temp.equals(temp2))
                    index = i;
            }
            return index;

        }
        public static int[] reverseInterchange( int[] arr1, int [] arr2 )
        {
            if(arr1 == null || arr2 == null)
                throw new IllegalArgumentException("Invalid input");

            int temp;
            int[] arr3 = new int[arr2.length];
            if( arr1.length >= arr2.length)
                temp = arr2.length;
            else
                temp = arr1.length;

            int counter = 0;

            for(int i = arr2.length-1; i >= 0 ;i--)
            {
                arr3[counter] = arr2[i];
                counter++; 
            }

            int[] ans = new int[temp*2];
            counter = 0;
            for(int i =0; i < ans.length; i+=2)
            {
                ans[i] = arr1[counter];
                ans[i+1] = arr3[counter];
                counter++;
            }

            return ans;
        }
    
}
