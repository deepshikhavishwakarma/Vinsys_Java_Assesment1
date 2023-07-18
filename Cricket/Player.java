package Cricket;

public class Player {
    private String name;
    private String city;
    private float age;
   

    public Player(String name, String city, float age) {
        this.name = name;
        this.city = city;
        this.age = age;
        
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("city: " + city);
        System.out.println("Age: " + age);
       
        System.out.println();
    }
}
