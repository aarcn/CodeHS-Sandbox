import java.util.*;

public class StudentCouncil
{ 
    // Instance Variables
    private Dance dance;
    private Scanner scan;
    
    // Constructor
    public StudentCouncil()
    {
        dance = new Dance();
        scan = new Scanner(System.in);
    }
    
    // Methods
    public void mainMenu()
    {
        int num = 0;
        
        do
        {
            System.out.println("======================");
            System.out.println("        Main Menu");
            System.out.println("======================");
            System.out.println("1. Buy a Ticket");
            System.out.println("2. Print Summary Report");
            System.out.println("3. Exit");
            System.out.println();
            System.out.print("Selection --> ");
            num = scan.nextInt();
            System.out.println();
            
            if(num == 1)
            {
                buyTicket();
            }
            else if (num == 2)
            {
                printSummary();
            }
        
        }
        while(num != 3);
        
    }
    
    /** precondition:  none
     *  postcondition: prints a menu of ticket options and allows the 
     *     user to select one of the items in the menu. It purchases 
     *     a ticket according to ticket type selected.
     */
    public void buyTicket()
    {       
        System.out.println("======================");
        System.out.println("        Buy Ticket");
        System.out.println("======================");
        System.out.println("1. Gold Pass");
        System.out.println("2. Silver Pass");
        System.out.println("3. Bronze Pass");
        System.out.println("4. No Pass");
        System.out.print("Selection --> ");
        
        int ticketType = scan.nextInt();
        dance.buyTicket(ticketType);        
    }
    
    /** precondition:  none
     *  postcondition: prints a summary report that includes the
     *     current number of students attending the dance and the 
     *     current amount of money made from ticket sales.
     */   
    public void printSummary()
    {
        System.out.println("======================");
        System.out.println("    Summary Report");
        System.out.println("======================");
        System.out.println("Total Attendance = " + dance.getAttendance());
        System.out.println("Total Ticket Sales = $" + dance.getTicketSales());
    }
	
    public static void main(String[] args)
    {
        StudentCouncil app = new StudentCouncil();
        app.mainMenu();
    }
}
