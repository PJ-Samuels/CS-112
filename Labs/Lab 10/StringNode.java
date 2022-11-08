public class StringNode
{
    private char ch;
    private StringNode next;
    public static int numOccur(StringNode str, char ch) {
        if (str == null) {  // explicit base case
            return 0;
        }
    
        int numInRest = numOccur(str.next, ch);
        if (str.ch == ch) {
            return 1 + numInRest;
        } else {
            return numInRest;
        }
    }
}