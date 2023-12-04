public class Dance
{
   // Constants
   public final int GoldPass = 0;
   public final int SilverPass = 2;
   public final int BronzePass = 4;
   public final int NoPass = 6;
   
   // Instance Variables
   private int attendance;
   private double ticketSales;

   // Constructors
   public Dance()
   {
        attendance = 0;
        ticketSales = 0.0;
   }
   
   // Methods

   /** precondition:  value of code is in the range (1 to 4) inclusive.
    *  postcondition: updates the ticketSales by the price of the ticket 
    *     specified by the parameter code. The attendance variable is 
    *     incremented by one.
    *  @param code a value from (1 - 4) indicating the type of ticket
    */
   public void buyTicket(int code)
   {
    switch(code)
    {
        case 1:
            ticketSales += GoldPass;
            break;
        case 2:
            ticketSales += SilverPass;
            break;
        case 3:
            ticketSales += BronzePass;
            break;
        case 4:
            ticketSales += NoPass;
            break;
            default:
    }
attendance ++;
   }

   /** @return the value of attendance
    */
   public int getAttendance()
   {
      return attendance;
   }
   
   /** @return the amount of ticketSales
    */
   public double getTicketSales()
   {
      return ticketSales;
   } 
}
