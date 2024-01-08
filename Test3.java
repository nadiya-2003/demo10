import java.util.*;
class Demo
{
public int input()//no arguments with return value
{
Scanner sc=new Scanner(System.in);
int temp=sc.nextInt();
return temp;
}
}
class Test3
{
public static void main(String args[])
{
Demo d=new Demo();
int n1=d.input();
System.out.println(n1);
}
}

