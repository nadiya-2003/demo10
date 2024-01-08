import java.util.*;
class Demo
{
public int sub(int x,int y)//with arguments with return value
{
int res=x-y;
return res;
}
}
class Test2
{
public static void main(String args[])
{
Demo d=new Demo();
Scanner sc=new Scanner(System.in);
int n1=sc.nextInt();
int n2=sc.nextInt();
int o =d.sub(n1,n2);
System.out.println("x-y="+o);
}
}

