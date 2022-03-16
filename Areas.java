public class Areas{
    void area(float x)
    {
        System.out.println("Area of the square is "+ Math.pow(x,2)+"sq units");
    }
    void area(float x, float y)
    {
        System.out.println("The area of the rectangle is "+x*y+"sq units");
    }
    void area(double x)
    {
        double z =3.14*x*x;
        System.out.println("The area of the circle is "+z+"sq units");
    }
    void area(float a, float b, float c)
    {
        double temp = (a + b + c);
        double s= temp/2;
        double triarea = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println( "Area of triangle with length of sides  "+a+"," +b+ " and " +c+" is : "+ triarea);
    }
}
class Area{
    public static void main(String args[])
    {
        Areas sh = new Areas();
        sh.area(7);
        sh.area(12,10);
        sh.area(5,7,9);
        sh.area(5.5);
    }
}