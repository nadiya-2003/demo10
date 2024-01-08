import java.util.*;
class Demo
{
public void displayMenu()//no argument no return value
{
System.out.println("+:Addition");
System.out.println("-:Subtractio");
System.out.println("*:Multiplication");
System.out.println("/:Division");
}
public void add(int x,int y)
{
int res=x+y;
System.out.println(x+"+"+y+"="+res);
}
}
class Test1
{
public static void main(String args[])
{
Demo d=new Demo();
d.displayMenu();
Scanner sc=new Scanner(System.in);
int n1=sc.nextInt();
int n2=sc.nextInt();
d.add(n1,n2);
}
}

