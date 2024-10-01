package chapter1.java;

public class static1
{
 static int x = 20;//static variable
 public static void main(String[] args) {
static1 t=new static1();                 
static1 s=new static1();
static1 y=new static1();
s.x=t.x+5;
t.x=s.x+5;
System.out.println(t.x);
	
}
}

