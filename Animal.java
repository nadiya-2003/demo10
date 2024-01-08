import java.util.ArrayList;
class Animal
{
public static void main(String args[])
{
ArrayList<String> animals=new ArrayList<>();
animals.add("Dog");
animals.add("cat");
animals.add("Horse");
animals.add("Giraffe");
animals.add("Rhinosirous");
System.out.println("ArrayList:"+animals);
System.out.println("Accessing individual elements:");
for(String temp:animals)
{
System.out.print(temp);
System.out.print(",");
}
}
}
