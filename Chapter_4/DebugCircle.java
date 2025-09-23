public class DebugCircle {
   private int radius;
   private int diameter;
   private final double PI = 3.14159;
   private double area;
   
   
   
   public DebugCircle(int r) {
      radius = r;
      diameter = 2 * r;
      area = PI * r * r;
   }

   public int getRadius(){ //error: semicolon after method header
   
      return radius; //typo error "radiuss". It should be "radius"
   }

   public int getDiameter(){ //return type should be int not void
   
      return diameter;
   }

   public double getArea(){
      return area;   }
}
