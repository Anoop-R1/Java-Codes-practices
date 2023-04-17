public class Overloading {
    public int age=19;
    public String name="achu";
    public int p(int age ) {
       return age;
    }

    public String p(String name) {
        return name;
    }
    public static void main(String[] args) {
        Overloading r = new Overloading();
        System.out.println(r.age);
        System.out.println(r.name);

    }
    
    
}
