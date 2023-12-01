public class Box
{
   // Instance Variables
   private int side;

   // Constructors
   public Box(int num){
       side = num;
   }
   
   // Methods
    
   /** precondition: none
    *  postcondition: calculates and returns the area of
    *     the box (A = 6 * side * side)
    *  @return the area of the box
    */
   public int calculateArea()
   {
        return side* side *6;
   }
    
   /** precondition: none
    *  postcondition: calculates and returns the volume of 
    *     the box (V = side * side * side)
    *  @return the volume of the box
    */
   public int calculateVolume()
   {
       return side* side* side;
   }
}