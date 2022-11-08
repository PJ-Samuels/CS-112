public class TestRomanNumerals {
    public static void main(String[] args)
    {
        String str1 = "X";
        String str2 = "XXIV";

        RomanNumeralStatic.add(str1,str2);
        double ans1 = RomanNumeralStatic.convert(str1);
        double ans2 = RomanNumeralStatic.convert(str2);
        System.out.println(ans1);
        System.out.println(ans2);

        RomanNumeral num1 = new RomanNumeral(str1);
        RomanNumeral num2 = new RomanNumeral(str2);  

        int sum = num1.add(num2);
        System.out.println(sum);

        String[] numerals = {};
        for(int i = 0; i < numerals.length-1; i++)   
            System.out.println(sum);
        
    }
    
}
