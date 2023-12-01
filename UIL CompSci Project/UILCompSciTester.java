import java.util.*;

public class UILCompSciTester
{
    public static void main(String[] args)
    {
        String Name = UILCompSci.readString("Enter contestant's name --> ");
        
        UILCompSci.blankLines(2);

        int Cor = UILCompSci.readCor("Number correct --> ");
        
        UILCompSci.blankLines(2);

        int Incor = UILCompSci.readIncor("Number incorrect --> ");
        
        UILCompSci.blankLines(2);
        
        int Skip = UILCompSci.readSkip("Number skipped --> ");
        
        UILCompSci.blankLines(2);
        
        int Ans = UILCompSci.readAns(Cor, Incor, Skip);
        System.out.println(Ans);
        
        UILCompSci.blankLines(2);
    }
}