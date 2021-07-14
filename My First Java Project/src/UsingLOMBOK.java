import java.util.Objects;
import java.lang.String;

class Alien3{ // Boilerplate Code (With Using Getters, Setters, Equals, and HashCodes) (Without using Lombok)
    private int age;
    private String name;
    private String tech;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTech() {
        return tech;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Alien3)) return false;
        Alien3 alien3 = (Alien3) o;
        return getAge() == alien3.getAge() && getName().equals(alien3.getName()) && getTech().equals(alien3.getTech());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAge(), getName(), getTech());
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

    public void setAge(int age){
        this.age = age;
    }

}

class Alien4{
    private int age;
    private String name;
    private String tech;
}
public class UsingLOMBOK {
    public static void main(String[] args) {
        Alien3 a1 = new Alien3();
    }
}
