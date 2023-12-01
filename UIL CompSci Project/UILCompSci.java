import java.util.*;

public class UILCompSci
{
    private static Scanner keyboard = new Scanner(System.in);
    
    public static String readString(String prompt)
    {
        System.out.println("Enter contestant's name");
        String x = keyboard.nextLine();
        return x;
    }
    
    public static int readCor(String prompt)
    {
        System.out.println("Number correct");
        int y = keyboard.nextInt();
        keyboard.nextLine();
        return y;
    }
    
    public static int readIncor(String prompt)
    {
        System.out.println("Number incorrect");
        int z = keyboard.nextInt();
        keyboard.nextLine();
        return z;
    }
    
    public static int readSkip(String prompt)
    {
        System.out.println("Number skipped");
        int s = keyboard.nextInt();
        keyboard.nextLine();
        return s;
    }
    
    public static int readAns(int y, int z, int s)
    {
        return (6*y)-(2*z);
    }
    
    public static void blankLines(int num)
    {
        for (int i = 0; i < num; i++)
            System.out.println();
    }
}