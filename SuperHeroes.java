public class SuperHeroes {
    String name;
    String color;
    String power;

    SuperHeroes(String name, String color, String power){
        this.name = name;
        this.color = color;
        this.power = power;
    }

    public static void main(String[] args) {
        SuperHeroes s1 = new SuperHeroes
        ("Hulk", "Green", "He is huge and very Strong");
        
        SuperHeroes s2 = new SuperHeroes
        ("Spider-Man", "Red-Blue", "He climbs walls and swing on webs");

        SuperHeroes s3 = new SuperHeroes
        ("Batman","Dark Grey & Black","He uses smart gadgets");

        SuperHeroes s4 = new SuperHeroes
        ("Iron Man", "Red and Gold", "He wears a high-tech suit to flay");

        s1.display();
        s2.display();
        s3.display();
        s4.display();

    }

    void display(){
        System.out.println("Name is: "+name);
        System.out.println("Color is: "+color);
        System.out.println("Power is: "+power);
        System.out.println();
        System.out.println();
    }
}
