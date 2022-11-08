import java.util.*;
public class WordPalindromeTest {
    public static void main(String[] args){
        boolean ans = isWordPalindrome("Life-imitates nature,always moving, traveling continuously.Continuously traveling, moving always,nature imitates life.");
        //boolean ans = isWordPalindrome("Spoken Breath\nCreating flesh and spirit\nSpirit and flesh creating\nBreath spoken.");
        System.out.println(ans);
    }
    public static boolean isWordPalindrome( String str )
    {
        //String str2 = "";
    
        String str1 = "";
        str = str.toLowerCase();
        for(int i = 0; i < str.length()-1;i++)
        {
            if(Character.isLetter(str.charAt(i))|| Character.isDigit(str.charAt(i)) || str.charAt(i) == ' ')
                str1 += str.charAt(i);
            else if(str.charAt(i)== '-' ||str.charAt(i)== '/'||str.charAt(i)== ','||str.charAt(i)== '.' || str.charAt(i)== '\n')
                str1 += " ";
            else
                str1 += "";
        }


        String[] sp1 = str1.split(" ");
        System.out.println(Arrays.toString(sp1));
        int temp = 0;
        for( int i  = 0; i < sp1.length; i++){
            if((sp1[i].equals("")))
                temp = temp + 1-1;
            else
                temp += 1;
        }
        String[] sp2 = new String[temp];
        System.out.println(temp);
        int sp2counter = 0;
        for( int i  = 0; i < sp1.length; i++)
        {
            if(sp1[i].equals(""))
                sp2counter = sp2counter+1-1;
            else
            {
                sp2[sp2counter] = sp1[i];
                sp2counter+=1;
            }
        }
        System.out.println(Arrays.toString(sp2));
        int mid = sp2.length/2;
        boolean ans = true;
        for (int i = 0; i < mid; i++) {
            int n = (sp2.length - 1) - i;

            if(sp2[i].equals(sp2[n]))
                ans = true;
            else
            {
                ans = false;
                break;
            }       
        }
        return ans;  
    }
}
