import java.util.List;
import java.util.LinkedList;
class Demoo
{
public static void main(String args[])
{
List<Integer> numbers=new LinkedList<>();
numbers.add(10);
numbers.add(20);
numbers.add(30);
numbers.add(40);
numbers.add(50);
System.out.println("List is"+numbers);
int number=numbers.get(2);
System.out.println("Accessed number is:"+number);
int removednumber=numbers.remove(1);
System.out.println("Removed number is:"+removednumber);
int index=numbers.indexOf(40);
System.out.println("	Index  of the number  is"+" "+index);
}
}