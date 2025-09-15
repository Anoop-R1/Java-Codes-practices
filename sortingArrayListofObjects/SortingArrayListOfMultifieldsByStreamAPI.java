package sortingArrayListofObjects;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;
class Person{
private int id;
private String fName;
private String lName;
Person(int id, String fName, String lName){
this.id=id;
this.fName=fName;
this.lName=lName;
}
    public int getId() {
    return id;
}
public void setId(int id) {
    this.id = id;
}
public String getFName() {
    return fName;
}
public void setFName(String fName) {
    this.fName = fName;
}
public String getLName() {
    return lName;
}
public void setLName(String lName) {
    this.lName = lName;
  }
}
public class SortingArrayListOfMultifieldsByStreamAPI{
public static void main(String[] args) {
//creating ArrayList
ArrayList<Person> al = new ArrayList<>();
al.add(new Person(1,"Peter","Parker"));
al.add(new Person(2,"Robert","John"));
al.add(new Person(3,"Bill","Smith"));
System.out.println("----Before Sorting----");
for(Person p:al){
    System.out.println("Person:"+p.getId()+","+p.getFName()+","+p.getLName());
}
//comaparing first name and then last name
Comparator<Person> compareByName = Comparator
                        .comparing(Person::getFName)
                        .thenComparing(Person::getLName);
     
ArrayList<Person> sortedPerson = al.stream()
                    .sorted(compareByName)
                    .collect(Collectors.toCollection(ArrayList::new));
System.out.println("----After Sorting----");
for(Person p:sortedPerson){
    System.out.println("Person:"+p.getId()+","+p.getFName()+","+p.getLName());
     }
   }
}