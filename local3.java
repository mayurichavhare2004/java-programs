package chapter1.java;

public class local3 {
	
	   static int count=0;
	   public void increment()
	   {
	       count++;
	   }
	   public static void main(String args[])
	   {
	       local3 obj1=new local3();
	       local3 obj2=new local3();
	       obj1.increment();
	       obj2.increment();
	       System.out.println("Obj1: count is="+obj1.count);
	       System.out.println("Obj2: count is="+obj2.count);
	   }
	

}
