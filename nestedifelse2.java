package chapter1.java;
public class nestedifelse2
{
    public static void main(String[] args)
    {
        int age = 30; 
        boolean isWeekend = false; 

        if (age  <  13)
        {
            if (isWeekend)
            {
                System.out.println("Ticket Price: Rs. 120");
            }
            else
            {
                System.out.println("Ticket Price: Rs. 100");
            }
        }
        else if (age  <  64)
        {
            if (isWeekend) 
            {
                System.out.println("Ticket Price: Rs. 180");
            } else {
                System.out.println("Ticket Price: Rs. 150");
            }
        }
        else
        {
            if (isWeekend) {
                System.out.println("Ticket Price: Rs. 150");
            } else {
                System.out.println("Ticket Price: Rs. 130");
            }
        }
    }
}

