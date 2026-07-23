class Traners {
    // attributes
    String name;
    String course;
    int sal;
     
    Traners (String name, String course, int sal){
        this.name = name;
        this.course = course;
        this.sal = sal;

    }
    public static void main(String[] args) {
        Traners t1 = new Traners("Shrikant sir", "Java", 12);
        Traners t2 = new Traners("Rahul sir", "Java", 10);
        Traners t3 = new Traners("Shankar sir", "SQL", 10);
        Traners t4 =new Traners("Pavan sir ", "Java", 12);

        t1.display();
        t2.display();
        t3.display(); 
        t4.display();

    }

    void display () {
        System.out.println("Name is: "+name);
        System.out.println("Course is: "+course);
        System.out.println("Salary is: "+sal);
        System.out.println(" ");
    }
}