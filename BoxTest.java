package boxTest;


class Box
{
   private double height;
   private double width;
   private double depth;
   private boolean full;
     
   //Constructor
   public Box(double height, double width, double depth) {
      this.height = height;
      this.width = width;
      this.depth = depth;
      this.full = false;
   }
     
   //getters and setters 
   public double getHeight() {
       return height;
   }
   
   public void setHeight(double height) {
      this.height = height;
   }
   
   public double getWidth() {
      return width;
   }
   
   public void setWidth(double width) {
      this.width = width;
   }
   
   public double getDepth() {
      return depth;
   }
   
   public void setDepth(double depth) {
      this.depth = depth;
   }
   
   public boolean isFull() {
      return full;
   }
   
   public void setFull(boolean full) {
      this.full = full;
   }
     
   //toString method
   public String toString() {
      return "Box{" + "height=" + height + ", width=" + width + ", depth=" + depth + ", full=" + full + '}';
   }
}
   
public class BoxTest {
   
   public static void main(String[] args) {
      //Testing Box class
      Box b1 = new Box(2.8, 4.9, 6.4);
      Box b2 = new Box(3.9, 5.8, 7.9);
        
      //Setting status of Box b2 to true
      b2.setFull(true);
        
      //Printing Box objects
      System.out.println("Box 1: " + b1);
      System.out.println("Box 2: " + b2);
   }

}