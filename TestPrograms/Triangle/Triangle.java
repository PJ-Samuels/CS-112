package Triangle;

public class Triangle {
    private double height;
    private double base;
    public Triangle(double b, double h) {
        base = b;
        height = h;
    }
    public Triangle(){
        height = 1;
        base = 1;
    }
    public double getHeight()
    {
        return this.height;
    }
    public double getBase(){
       return this.base; 
    }
    public double area()
    {
        return (this.height+this.base)/2;
    }
    public String toString( Triangle t)
    {
        String s = "traingle with base"+this.base+"and height"+this.height;
        return s;
    }

}