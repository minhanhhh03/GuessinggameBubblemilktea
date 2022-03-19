import java.util.*;
public class FinalPrj_1022_Sample {
    public static void main(String[] args) {
        String play = "";
        int points = 0;
        boolean game = true;

        List<Integer> listofPoints = new ArrayList<>();
        HashMap<Integer, String> users_points = new HashMap<>();
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        while (game == true) {
            int randNum = rand.nextInt(2);
            int guessNum = -1;
            System.out.print("Enter username: ");
            String user_name = scan.nextLine();
            points = 0;
            while (guessNum != randNum) {
                System.out.print("Enter your guess: ");
                guessNum = scan.nextInt();
                if (guessNum < randNum) {
                    System.out.println("Enter a higher guess :)");
                    continue;
                } else if (guessNum > randNum) {
                    System.out.println("Enter a lower guess :)");
                    continue;
                } else if (guessNum == randNum) {
                    System.out.println("Congratulations, you got the correct number !");
                    points += 10;
                } else {
                    System.out.println("Invalid input. Enter again.");
                    continue;
                }
                System.out.println();
                System.out.print("Do you wish to continue (Y/N) or quit (Q) ?: ");
                do {
                    play = scan.nextLine();
                } while (!play.equals("Y") && !play.equals("N") && !play.equals("Q"));
                guessNum = -1;
                if (play.equals("N")) {
                    break;
                }
                if (play.equals("Q")) {
                    game = false;
                    break;
                }
            }
            users_points.put(points, user_name);

        }

//        for (String i : users_points.keySet()) {
//            System.out.println("Username: " + i + " Score: " + users_points.get(i));
//        }

        for (int i: users_points.keySet()) {
            listofPoints.add(i);
        }
        Collections.sort(listofPoints, Collections.reverseOrder());

        System.out.println();
        System.out.println("Leaderboard:");
        for (int i: listofPoints) {
            System.out.println("Username: " + users_points.get(i) + "   Score: " + i);
        }

    }
}

