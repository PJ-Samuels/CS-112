
import java.util.*;
public class Price{
    int dollars;
    int cents;
    public Price (int d , int c){
        dollars = d;
        cents = c;
    }
    public int getCents()
    {
        return cents;
    }
    public void increaseBy(int c){
        if( c < 0)
            throw new IllegalArgumentException("false");
        cents += c%100;
        dollars += c/100;
    }
    public static void main(String[] args){
        // int d, c;
        // c= 4;
        // d=16;
        // Price p3 = new Price(d,c);
        // int temp = 30;
        // p3.increaseBy(temp);
        
        ArrayList<Integer> val1 = new ArrayList<Integer>(5);
        ArrayList<Integer> val2 = val1;
        val1.add(0, 2);
        val2.add(0, 1);
        System.out.println(val1.get(0));
        System.out.println(val2.get(0));
        
    }
}
