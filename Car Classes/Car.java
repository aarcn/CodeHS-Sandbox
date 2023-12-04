public class Car
{
    // Constants
    public final double capacity = 22;   // number of gallons the gas
                                         // tank can hold when full
    // Instance Variables
    private double initialMiles;
    private double finalMiles;
    private double gallons;
    
    // Constructors
    public Car(double num, double num1, double num2)
    {
        initialMiles = num;
        finalMiles = num1;
        gallons = num2;
    }
    
    // Methods
    
    /** precondition:  gallons > 0
     *  postcondition: calculates and returns the cars MPG (miles per gallon)
     *     for the current odometer readings.
     *  @return the car's MPG
     */
    public double calculateMPG()
    {
        return (finalMiles - initialMiles)/gallons;
    }
    
    /** precondition:  none
     *  postcondition: calculates and returns the number of miles the car
     *     can travel before its gas tank is empty.
     *  @return number of miles car can travel before tank is empty
     */
    public double milesToEmpty()
    {
        return (capacity-gallons)*calculateMPG();
    }
}