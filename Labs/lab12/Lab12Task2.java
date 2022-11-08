/*
 * Lab 12, Task 2
 * CS 112
 */

public class Lab12Task2 {
    /*
     * numDigits - takes an integer and returns the number of digits
     * that it has
     */ 
    public static int numDigits(int val) {
        String valString = Integer.toString(Math.abs(val));
        return valString.length();
    }
    
    /* 
     * divideByLength - takes an array of integers and returns a List 
     * (either an ArrayList or LLList) in which all of the one-digit numbers 
     * come first, followed by all of the two-digit numbers, followed by 
     * all of the three-digit numbers. In the returned List, the numbers in 
     * a given subgroup (e.g., the one-digit numbers), are in the same order 
     * with respect to each other as they were in the original array.
     */
    public static List divideByLength(int[] values) {
        Queue<Integer> one  = new LLQueue<Integer>();
        Queue<Integer> two  = new LLQueue<Integer>();
        Queue<Integer> three  = new LLQueue<Integer>();

        List list = new LLList(values.length);
        for(int i = 0; i < values.length; i++)
        {
            if(numDigits(values[i]) == 1)
            {
                one.insert(values[i]);
            }
            else if(numDigits(values[i]) == 2)
            {
                two.insert(values[i]);
            }
            else
            {
                three.insert(values[i]);
            }
        }
        int index = 0;

        while(!one.isEmpty()){
            list.addItem(one.remove(), index);
            index++;
        }
        while(!two.isEmpty()){
            list.addItem(two.remove(), index);
            index++;
        }
        while(!three.isEmpty()){
            list.addItem(three.remove(), index);
            index++;
        }
    }

    public static void main(String[] args){
        int[] vals = {7, 300, 55, 3, 213, 24, 78, 8, 411};
        List results = Lab12Task2.divideByLength(vals);
        System.out.println( results );
    }
}
