import java.util.List;
import java.util.LinkedList;
class Demooo
{
public static void main(String args[])
{
List<Integer> numbers=new LinkedList<>();
List<String> flowers=new LinkedList<>();
List<Double>  num =new LinkedList<>();

numbers.add(10);
numbers.add(20);
numbers.add(30);
numbers.add(40);
numbers.add(50);
numbers.add(60);
numbers.add(70);
numbers.add(80);
numbers.add(90);
numbers.add(150);
numbers.add(530);
numbers.add(450);

System.out.println("List is"+numbers);
int number=numbers.get(6);
System.out.println("Accessed number is:"+number);
int removednumber=numbers.remove(8);
System.out.println("Removed number is:"+removednumber);
int index=numbers.indexOf(40);
System.out.println("Index  of the number  is"+" "+index);
System.out.println("List is"+numbers+"\n");


flowers.add("Lilly");
flowers.add("Lotus");
flowers.add("Jasmine");
flowers.add("hibiscus");
flowers.add("Jasmine");
flowers.add("Sunflowe");
flowers.add("Tulip");
flowers.add("Dathura");
flowers.add("Marigold");
flowers.add("Dera");

System.out.println("List is"+flowers);
String f=flowers.get(3);
System.out.println("Accessed number is:"+f);
String rf=flowers.remove(7);
System.out.println("Removed number is:"+rf);
int index2=flowers.indexOf("Jasmine");
System.out.println("Index  of the flower  is"+" "+index);
System.out.println("List is"+flowers+"\n");


num.add(1.0);
num.add(2.0);
num.add(3.0);
num.add(4.0);
num.add(5.0);
num.add(6.0);
num.add(7.0);
num.add(8.0);
num.add(9.0);
num.add(1.50);
num.add(53.0);
num.add(450.0);

System.out.println("List is"+num);
double num1=num.get(8);
System.out.println("Accessed number is:"+num1);
double removednumber1=num.remove(1);
System.out.println("Removed number is:"+removednumber1);
int index1=num.indexOf(40);
System.out.println("Index  of the number  is"+" "+index1);
System.out.println("List is"+num+"\n");


}
}