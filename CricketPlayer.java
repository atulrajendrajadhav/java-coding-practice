public class CricketPlayer {
    String Fname;
    int age ;
    String team;
    String wifeName;


    CricketPlayer(String Fname, int age, String team, String wifeName){
    this.Fname = Fname;
    this.age = age;
    this.team = team;
    this.wifeName = wifeName;
    }
    public static void main(String[] args) {
        CricketPlayer c1 = new CricketPlayer
        ("Rohit Gurunath Sharma", 39, "Mumbai Indians", "Ritika Sharma");

        CricketPlayer c2 = new CricketPlayer
        ("Virat Kolhi", 37, "RCB", "Anushka Sharma");

        CricketPlayer c3 = new CricketPlayer
        ("Sachin Tendulkar", 53, "Mumbai Indian", "Anjali Tendulkar");

        c1.display();
        c2.display();
        c3.display();
    }

   void display(){
    System.out.println("Full name is: "+Fname);
    System.out.println("Age is: "+age);
    System.out.println("Team is: "+team);
    System.out.println("Wife name is: "+wifeName);
    System.out.println();
   }

}
