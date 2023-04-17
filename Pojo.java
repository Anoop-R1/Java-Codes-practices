public class Pojo {
    private int age;
    private String name;
    public Pojo(int age, String name) {
        this.age = age;
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Pojo [age=" + age + ", name=" + name + "]";
    }
    
}
