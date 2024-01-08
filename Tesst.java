//calling a function with in a function definition is called recursive function

import java.util.Scanner;
class Demo
{
public int calculateFactorial(int n)
{
if(n==0)
return 1;
else
{
return n*calculateFactorial(n-1);
}
}
}
class Tesst
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int p=sc.nextInt();
Demo ob=new Demo();
System.out.println(ob.calculateFactorial(p));
}
}