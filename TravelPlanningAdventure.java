
// 24)Travel Planning Adventure
import java.util.Scanner;

class TravelPlanningAdventure {
    public static void main(String[] Atul) {
        Scanner obj = new Scanner(System.in);
        System.out.println("===== TRAVEL PLANNING GAME =====");
        System.out.println("You are planning your trip...");
        System.out.println("1. Travel by Train");
        System.out.println("2. Travel by Flight");
        System.out.print("Choose: ");

        int choice1 = obj.nextInt();

        switch (choice1) {
            // TRAIN PATH
            case 1:
                System.out.println("\nYou chose Train...");
                System.out.println("1. Book Ticket");
                System.out.println("2. Travel without Booking");
                System.out.print("Choose: ");

                int choice2 = obj.nextInt();

                switch (choice2) {
                    case 1:
                        System.out.println("\nTicket booked!");
                        System.out.println("1. Reach Station On Time");
                        System.out.println("2. Reach Late");
                        System.out.print("Choose: ");

                        int choice3 = obj.nextInt();

                        switch (choice3) {
                            case 1:
                                System.out.println("\nYou boarded the train comfortably!");
                                System.out.println(" SUCCESS: Enjoy your journey!");
                                break;
                            case 2:
                                System.out.println("\nYou reached late...");
                                System.out.println(" RESULT: Missed the train!");
                                break;
                            default:
                                System.out.println("Invalid choice");
                        }
                        break;

                    case 2:
                        System.out.println("\nNo booking...");
                        System.out.println(" RESULT: Crowded journey in general compartment!");
                        break;
                    default:
                        System.out.println("Invalid choice");
                }
                break;

            // FLIGHT PATH
            case 2:
                System.out.println("\nYou chose Flight...");
                System.out.println("1. Do Online Check-in");
                System.out.println("2. Skip Check-in");
                System.out.print("Choose: ");

                int choice4 = obj.nextInt();

                switch (choice4) {
                    case 1:
                        System.out.println("\nCheck-in completed!");
                        System.out.println("1. Reach Airport Early");
                        System.out.println("2. Reach Late");
                        System.out.print("Choose: ");

                        int choice5 = obj.nextInt();

                        switch (choice5) {
                            case 1:
                                System.out.println("\nSmooth boarding process!");
                                System.out.println(" SUCCESS: Happy Journey!");
                                break;
                            case 2:
                                System.out.println("\nYou reached late...");
                                System.out.println(" RESULT: Missed the flight!");
                                break;
                            default:
                                System.out.println("Invalid choice");
                        }
                        break;
                    case 2:
                        System.out.println("\nNo check-in...");
                        System.out.println(" RESULT: Long queues and stress at airport!");
                        break;
                    default:
                        System.out.println("Invalid choice");
                }
                break;
            default:
                System.out.println("Invalid starting choice");
        }

        obj.close();

    }
}