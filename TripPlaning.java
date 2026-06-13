import java.util.Scanner;
import java.util.ArrayList;

public class TripPlaning {

    static String[] contactList = {
        "Suresh", "Mahesh", "Sunita", "Sakshi",
        "Pratiksha", "Mukesh", "Rakesh"
    };

    public static void main(String[] args) {

        String leader = "Ramesh";

        ArrayList<Object> tripData = tripPlaning();

        System.out.println("Trip Details:");
        System.out.println(tripData + "\n");

        ArrayList<String> members = new ArrayList<>();
        members.add(leader);

        for (String name : contactList) {

            boolean resp = isComing(name, tripData);

            if (resp) {
                members.add(name);
            }
        }

        System.out.println("\nFinal Members List:");
        System.out.println(members);
    }

    public static boolean isComing(String name, ArrayList<Object> tripData) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ramesh is calling: " + name);
        System.out.println("Trip Details: " + tripData);

        System.out.print("Aa Raha Hai Kya? (HA/NA): ");
        String resp = sc.next();

        if (resp.equalsIgnoreCase("HA")) {
            return true;
        } else {
            return false;
        }
    }

    public static ArrayList<Object> tripPlaning() {

        String location = "Goa";
        String date = "15.06.2026";
        int days = 3;
        String vehicle = "Car";
        double budget = 10000;

        ArrayList<Object> tripPlaning = new ArrayList<>();

        tripPlaning.add(location);
        tripPlaning.add(date);
        tripPlaning.add(days);
        tripPlaning.add(vehicle);
        tripPlaning.add(budget);

        return tripPlaning;
    }
}