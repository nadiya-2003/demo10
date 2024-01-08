


import java.util.Scanner;
class  Fibonacci
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
System.out.println(a+","+b);
for(int i=2;i<20;i++)
{
int c=a+b;
System.out.println(c+",");
a=b;
b=c;
}
}
}