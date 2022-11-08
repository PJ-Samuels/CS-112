public class RomanNumeral {
    private String roman;
    private int value;
    public RomanNumeral(String r)
    {
        this.roman = r;
        this.value = RomanNumeralStatic.convert(r);
    }
    public RomanNumeral()
    {
        this.roman = "I";
        this.value = 1;
    }
    public int getValue(){
        return this.value;
    }
    public String toString(){
        return this.roman;
    }
    public boolean equals(RomanNumeral other)
    {
        return this.value == other.value;
    }
    public int add(RomanNumeral other)
    {
        return this.getValue() + other.getValue();
    }
    public static void main(String[] args) {
        RomanNumeral r1 = new RomanNumeral("X");
        RomanNumeral r2 = new RomanNumeral("IX");
        
        System.out.println( r1 );
        System.out.println( r2 );
    }    
}

