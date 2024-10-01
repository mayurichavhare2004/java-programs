package chapter1.java;

public class nestedifelse5
{
    public static void main(String[] args)  
{
        String lightColor = "Green"; 
        boolean isPedestrianWaiting = true; 

        if ("Green".equals(lightColor))
        {
            if (isPedestrianWaiting)
            {
                System.out.println("Slow down");
            }
            else
            {
                System.out.println("Drive");
            }
        }
        else if ("Yellow".equals(lightColor))
        {
            System.out.println("Prepare to stop");
        }
        else if ("Red".equals(lightColor))
        {
            System.out.println("Stop");
        }
    }
}
