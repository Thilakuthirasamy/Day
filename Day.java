import java.io.*;
import java.util.*;
public class Day
{
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      String str=s.nextLine();
      if(str.equalsIgnoreCase("Sun"))
      System.out.println("false");
      else if(str.equalsIgnoreCase("Mon") || str.equalsIgnoreCase("tue") || str.equalsIgnoreCase("wed") || str.equalsIgnoreCase("Thur") || str.equalsIgnoreCase("Fri") || str.equalsIgnoreCase("Sat"))
      System.out.println("true");
    }
}
