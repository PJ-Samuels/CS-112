//import java.util.*;

public class ArrayPractice{
    public static void main( String[] args){
        
    }
    public static boolean equals(int[] arr1, int[] arr2)
    {
        if(arr1.equals(arr2))
            return true;
        else 
            return false;
    } 
    public static void square(int[] arr){
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = arr[i]*arr[i];
        }
        System.out.println(arr);
    }
    public static int shiftLeft(int[] arr)
    {
        int first = arr[0];
        for(int i = 0; i < arr.length-1; i++)
            arr[i] = arr[i+1];
        arr[arr.length-1] = 0;
        return first;
    }   
    public static int replace( int[] arr, int val1, int val2){
        int count = 0;
        for(int i = 0; i < arr.length-1; i++){
            if (arr[i] == val1)
            arr[i] = val2 ; 
            count += 1;

        }
        return count;
    }
    
}