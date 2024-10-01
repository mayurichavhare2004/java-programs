package chapter1.java;

public class nestedifelse4 
{
	    public static void main(String[] args)
	    {
	        String category = "Clothing"; 
	        double purchaseAmount = 6000.0; 

	        if ("Electronics".equals(category))
	        {
	          System.out.println("Discount: 10%");
	        }
	        else if ("Clothing".equals(category))
	        {
	            if (purchaseAmount  >  5000) 
	            {
	               System.out.println("Discount: 20%");
	            } 
	            else
	            {
	               System.out.println("Discount: 15%");
	            }
	        }
	        else if ("Food".equals(category))
	        {
	            if (purchaseAmount  >  1000)
	            {
	                System.out.println("Discount: 5%");
	            }
	            else
	            {
	                System.out.println("No Discount");
	            }
	        }
	        else 
	        {
	            System.out.println("No Discount");
	        }
	    }
	}


