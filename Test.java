class Demo
{
public void displayMenu()//no argument no return value
{
System.out.println("+:Addition");
System.out.println("-:Subtractio");
System.out.println("*:Multiplication");

System.out.println("/:Division");
}
}
class Test
{
public static void main(String args[])
{
Demo d=new Demo();
d.displayMenu();
}
}

