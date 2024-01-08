import java.util.ArrayList;

class Maiiin
{
public static void main(String args[])
{
ArrayList<String> animals=new ArrayList<>();
ArrayList<Integer> numbers=new ArrayList<>();
ArrayList<Double> fl=new ArrayList<>();
animals.add("Dog");
animals.add("cat");
animals.add("Horse");
animals.add("Giraffe");
animals.add("Rhinosirous");
System.out.println("ArrayList:"+animals);
String word=animals.get(2);
System.out.println("Accessed Element:"+word);
String removedword=animals.remove(1);
System.out.println("Removed Element:"+removedword);
System.out.println("ArrayList:"+animals+"\n");
numbers.add(1);
numbers.add(2);
numbers.add(3);
numbers.add(10);
numbers.add(32);
System.out.println("ArrayList:"+numbers);
int number=numbers.get(2);
System.out.println("Accessed Element:"+number);
int removednumber=numbers.remove(1);
System.out.println("Removed Element:"+removednumber);
System.out.println("ArrayList:"+numbers+"\n");
fl.add(2.3);
fl.add(7.8);
fl.add(9.2);
fl.add(0.4);
fl.add(5.4);
System.out.println("ArrayList:"+fl);
double num =fl.get(3);
System.out.println("Accessed Element:"+num);
double removednum=fl.remove(4);
System.out.println("Removed Element:"+removednum);
System.out.println("ArrayList:"+fl);
}
}