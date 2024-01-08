import java.util.ArrayList;

class Language
{
public static void main(String args[])
{
ArrayList<String> languages=new ArrayList<>();
languages.add("Java");
languages.add("Kotlin");
languages.add("C++");
languages.add("Python");
System.out.println("ArrayList:"+languages);
languages.set(2,"Javascript");
System.out.println("ArrayList:"+languages);

ArrayList<Integer> numbers=new ArrayList<>();
numbers.add(1);
numbers.add(2);
numbers.add(3);
numbers.add(10);
numbers.add(32);
System.out.println("ArrayList:"+numbers);
numbers.set(1,10);
System.out.println("ArrayList:"+numbers);

ArrayList<Double> fl=new ArrayList<>();
fl.add(2.3);
fl.add(7.8);
fl.add(9.2);
fl.add(0.4);
fl.add(5.4);
System.out.println("ArrayList:"+fl);
fl.set(4,9.0);
System.out.println("ArrayList:"+fl);


}
}