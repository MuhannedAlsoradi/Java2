
public class MainMethod {
    public static void main(String[] args) throws Exception,Error,ArithmeticException {
        Shape p;
        p = new Circle("Yellow", 15);
        System.out.println(p.getArea());
        System.out.println(p.getPerimeter());
        p = new Square("Teal", 20);
        System.out.println("===========================================================");
        System.out.println(p.getArea());
        System.out.println(p.getPerimeter());
   try {
    int a[]={1,2,3};
    System.out.println("1");
    System.out.println(a[1]/0);
    System.out.println("2");
   } catch (ArithmeticException e) {
  System.out.println("3");
   }
   catch(ArrayIndexOutOfBoundsException e){
    System.out.println("4");
   }
   finally{
System.out.println("5");
   }
   System.out.println("6");
   try{
    String s = "";
  float f =  Float. parseFloat(s);
  System.out.println(f);
   }
catch(Exception e){
e.getMessage();
System.out.println(e);
}
    }

}

