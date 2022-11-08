

public class Methods {
    /*
     * printVertical - takes a string s and prints the characters of 
     * the string vertically -- with one character per line.
     */
    public static void printVertical(String s) {
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            System.out.println(c);
        }
    }
    public static void printWithSpaces (String s)
    {
        String newS = "";
        for( int i = 0; i < s.length();i++)
        {
            newS += s.charAt(i)+" ";
        }
        System.out.println(newS);
    }
    public static char middleChar(String str )
    {
        char ans;
        if (str.length()%2 == 0)
        {
            int temp = (str.length())/2-1;
            ans = str.charAt(temp);
        }
        else{
            int temp = (str.length()/2);
            ans = str.charAt(temp);
        }
        return ans;

    }
    public static String moveToEnd(String str, int i)
    {
        if( i > str.length())
            return str;
        else{
            String newStr = "";
            newStr += str.substring(i,str.length());
            newStr += str.substring(0,i);
            return newStr;
        }
    }
    public static void main(String[] args) {
        /* Sample test call */
        printVertical("method");    
        printWithSpaces("method");  
        char middle = middleChar("clock");  
        String str = moveToEnd("Boston",4);
        System.out.println(str);
        System.out.println("the middle of clock is: " + middle);

    }
}
