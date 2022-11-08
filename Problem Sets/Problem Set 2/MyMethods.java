public class MyMethods {
    public static void printDecreasing(String str)
    {
        for( int i = str.length(); i > 0; i--)
        {
            System.out.println(str.substring(0,i));
        }
    }
    public static String firstAndLast(String str){
        if(str.length() == 1){
            return str;
        }
        else{
            int temp = str.length()-1;
            String newStr = str.charAt(0)+""+str.charAt(temp);
            return newStr;
        }

    }
    public static int lastIndexOf( String str, char ch)
    {
        int index = str.lastIndexOf(ch);
        return index;
    }
    public static String repeat(String str, int n)
    {
        String newStr = "";
        for(int i = 0; i < n; i++)
        {
            newStr += str;
        }
        return newStr;
    }
    public static void main( String[] args)
    {
        printDecreasing("method");
        String ans = firstAndLast("Boston");
        System.out.println(ans);
        int index = lastIndexOf("Boston", 'o');
        System.out.println(index);

        String r = repeat("Java", 3);
        System.out.println(r);
    }
}
