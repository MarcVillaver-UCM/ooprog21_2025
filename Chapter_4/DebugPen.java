public class DebugPen{
   private String color;
   private String point;

   public DebugPen(){
      color = "black";
      point = "fine";
   }
   
   public DebugPen(String color, String point){
      this.color = color; // use "this" to assign the parameter to the object variable
      this.point = point; // use "this" to assign the parameter to the object variable
   }
   
   public String getColor(){
      return color;
   }
   
   public String getPoint(){
      return point;
   }
}

