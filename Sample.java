import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Sample {
    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(new Person("anu", 41), new Person("achui", 42), new Person("achu", 99), new Person("appu", 11),new Person("appu",11));  
           
        /*persons.stream().max(Comparator.comparing(Person::getName))
        .ifPresent(p -> System.out.println("sort by alphabet order person max" + p));
        List<Person> l1 = persons.stream().filter(s -> s.getName().startsWith("a")).collect(Collectors.toList());
//l1.stream().forEach(System.out::println);
System.out.println(l1);
long n = persons.stream().filter(e -> e.getName().endsWith("i")).count(); System.out.println(n); // foreach and distinct
    // foreach and distinct 
     System.out.println("distinct"); 
     List<String> d = persons.stream().map(Person::getName).distinct().collect(Collectors.toList()); 
     d.forEach(System.out::println);
     persons.stream().skip(2).forEach(System.out::println); 
     //limit 
     System.out.println("limit"); 
     persons.stream().limit(3).forEach(System.out::println);
     boolean b1 = persons.stream().allMatch(p1 -> p1.getAge() > 20 && p1.getName().startsWith("v"));
      System.out.println(b1);*/
    // String[] myArray = { "this", "is", "a", "sentence" };
     //  String result = Arrays.stream(myArray).reduce("", (a, b) -> a+ " "+ b); 
       //System.out.println(result);

    //   String[] y={"java", "program", "ing"};
    //    String result1= Arrays.stream(y).reduce("java", (a,b)-> a+b);
    //    System.out.println(result1);
    //    int[] myArray1 = { 1, 2, 3, 4,5}; 
    //    int result1 = Arrays.stream(myArray1).reduce(6, (a, b) -> a + b);
    //    System.out.println(result1);
    //    // find any 
    //    Optional<Person> anyEmpAbove40 = persons.stream().filter(emp -> emp.getAge() > 0).findAny();
    //     if (anyEmpAbove40.isPresent()) {
    //     System.out.println("Any Employee above age 40: " + anyEmpAbove40.get()); 
    //     // find first 
    //     Optional<Person> o1 = persons.stream().filter(emp -> emp.getAge() > 20).findFirst();
    //      if (o1.isPresent()) 
    //      { 
    //         System.out.println("Any Employee above age 20: " + o1.get()); 
    //     }
    //     sort 
    List<Person> slist = persons.stream().sorted(Comparator.comparing(Person::getName)).collect(Collectors.toList()); 
    slist.forEach(System.out::println);
}
}
