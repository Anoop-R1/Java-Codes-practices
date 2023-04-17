public class Hashcode1 {
    public static void main(String[] args) {
        
        String a="aaa";
        String b="aaa";

        String c=new String("bbb");
        String d=new String("bbb");

        System.out.println(a.hashCode());
        System.out.println(b.hashCode());

        System.out.println(c.hashCode());
        System.out.println(d.hashCode());
    }

    
}
