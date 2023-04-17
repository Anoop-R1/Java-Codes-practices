import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class SortStudent {
    public static void main(String[] args) {
        Student s1 = new Student(10, "achu");
        Student s2 = new Student(15, "appu");
        Student s3 = new Student(6, "sre");

        SortStudentByAge age = new SortStudentByAge();
        SortStudentByName name=new SortStudentByName();
       //TreeSet<Student> t = new TreeSet<Student>(age);
       List<Student> t=new ArrayList<Student>();

       Collections.sort(t,new SortStudentByAge());
       
        t.add(s1);
        t.add(s2);
        t.add(s3);
        for (Student std: t) {
            System.out.println(std);
        }
    }
}
