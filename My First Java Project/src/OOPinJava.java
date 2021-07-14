class Alien
{
    // Defining Class Variables
   private String Name;
   private String Tech;
   private int Experience;


    // Encapsulation
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = Name;
    }

    public String getTech() {
        return Tech;
    }

    public void setTech(String tech) {
        this.Tech = tech;
    }

    public int getExperience() {
        return Experience;
    }

    public void setExperience(int experience) {
        this.Experience = experience;
    }

    public String getLaptopBrand() {
        return LaptopBrand;
    }

    public void setLaptopBrand(String laptopBrand) {
        LaptopBrand = laptopBrand;
    }

    private String LaptopBrand;

   // Defining a Constructor for getting the private variables
    public void Getname()
    {
        System.out.println(Name);
    }

    // Defining Class Method
    public void makeProject()
    {
        System.out.println("Working on IntelliJ");
    }
    // Creating a Constructor
    public Alien()
    {
        System.out.println("Basic Constructor defined");
    }
    // We cannot create multiple constructors with the same name. In this case, we have to use constructor Overloading.
    // It simply means creating another constructor but giving different arguments or parameters.
    public Alien(String n, String t, int e, String l)
    {
        Name = n;
        Tech = t;
        Experience = e;
        LaptopBrand = l;
        System.out.println("Second Constructor defined");
    }
}

public class OOPinJava {
    public static void main(String args[]) {
        int num = 9;
        Alien Alien1 = new Alien(); //Constructor
        Alien1.setName("Darshan");
        Alien1.setTech("Java");
        Alien1.setExperience(1);
        Alien1.setLaptopBrand("HP");
        System.out.println(Alien1.getLaptopBrand());
        Alien1.makeProject();
        Alien Alien2 = new Alien("Navin","Python", 15, "i5");
        System.out.println(Alien2.getLaptopBrand());
        Alien2.makeProject();
    }
}
