import java.util.Scanner;
class A
{
      int r,l1,w,l2,b,h,parameter,area;
      void get_details()
      {
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter radious for Circle:");
          r=sc.nextInt();
          System.out.println("Enter length for square:");
          l1=sc.nextInt();
          System.out.println("Enter length for Rectangle:");
          l2=sc.nextInt();
          System.out.println("Enter width for Rectangle:");
          w=sc.nextInt();
          System.out.println("Enter base for Triangle:");
          b=sc.nextInt();
          System.out.println("Enter height for Triangle:");
          h=sc.nextInt();
      }
}
class B extends A
{
    void area_cal()
    {

      area=(int)(3.14*r*r);
      System.out.println("area of circle is ="+area);
      area=(int)(l1*l1);
      System.out.println("area of square is="+area);
      area=(int)(l2*w);
      System.out.println("area of rectangleis="+area);
      area=(int)(0.5*b*h);
      System.out.println("area of triangle is="+area);
    }
}
class C extends A
{
      void perimeter_cal()
      {
        parameter=(int)(2*3.14*r);
        System.out.println("parameter of circle is ="+parameter);
        parameter=(int)(4*l1);
        System.out.println("parameter of square is ="+parameter);
        parameter=(int)(2*(l2+w));
        System.out.println("parameter of rectangle is ="+parameter);
      }


}
class inherit_area
{
    public static void main(String args[])
    {
        B ab=new B();
        C bc=new C();
        System.out.println("Enter details for area:");
        ab.get_details();
        ab.area_cal();
        System.out.println("Enter details for peremeter:");
        bc.get_details();
        bc.perimeter_cal();

    }
}
