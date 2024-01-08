import java.util.ArrayList;

class Mainnn
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

numbers.add(1);
numbers.add(2);
numbers.add(3);
numbers.add(10);

numbers.add(32);

fl.add(2.3);
fl.add(7.8);
fl.add(9.2);
fl.add(0.4);
fl.add(5.4);

System.out.println("ArrayList:"+animals);
System.out.println("ArrayList:"+numbers);
System.out.println("ArrayList:"+fl);
}
}