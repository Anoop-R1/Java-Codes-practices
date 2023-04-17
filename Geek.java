
 import java.io.*;
  
public class Geek 
{
      
    public String name;
    public String sweet;
   
          
    Geek(String name, String sweet) 
    {
              
        this.name = name;
        this.sweet = sweet;
        
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((sweet == null) ? 0 : sweet.hashCode());
        return result;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Geek other = (Geek) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (sweet == null) {
            if (other.sweet != null)
                return false;
        } else if (!sweet.equals(other.sweet))
            return false;
        return true;
    }
} 

    

// import java.util.Objects;

// public class Geek {
    
//     private final String name;
//     private final String sweet;
    
//     public Geek(String name, String sweet) {
//         this.name = name;
//         this.sweet = sweet;
//     }
    
//     public String getName() {
//         return name;
//     }
    
//     public String getSweet() {
//         return sweet;
//     }
    
//     @Override
//     public boolean equals(Object obj) {
//         if (this == obj) return true;
//         if (obj == null || getClass() != obj.getClass()) return false;
//         Geek geek = (Geek) obj;
//         return Objects.equals(name, geek.name) && Objects.equals(sweet, geek.sweet);
//     }
    
//     @Override
//     public int hashCode() {
//         return Objects.hash(name, sweet);
//     }
    
// }