package chapter1.java;

public class instance1 {
	    
	    public String name; 
	    String division;    
	    private int age;      
	    public instance1(String sname)
	    {  
	        name = sname;  
	    }  
	    public void setDiv(String sdiv)  
	    {  
	        division = sdiv;  
	    }  
	    public void setAge(int sage)  
	    {  
	        age = sage;  
	    } 
	    public void printstud()  
	    {  
	        System.out.println("Student Name: " + name );  
	        System.out.println("Student Division: " + division);   
	        System.out.println("Student Age: " + age);  
	    }  
	    public static void main(String args[])  
	    {  
	        instance1 s = new instance1("Monica");  
	        s.setAge(14);  
	        s.setDiv("B");  
	        s.printstud();  
	    }
}

