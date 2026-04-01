import java.util.LinkedList;
import java.util.Scanner;

public class StudentScores {
    public static void main(String[] args) {
        LinkedList<Integer> scores = new LinkedList<>();

        scores.add(75);
        scores.add(88);
        scores.add(92);
        scores.add(60);
        scores.add(79);

        scores.addFirst(95);
        scores.addLast(50);

        System.out.println("Scores: " + scores);
        System.out.println("Size: " + scores.size());
        System.out.println("First element: " + scores.getFirst());
        System.out.println("Last element: " + scores.getLast());

        scores.removeFirst();
        scores.remove(Integer.valueOf(60));

        System.out.println("Updated Scores: " + scores);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a score to search: ");
        int searchScore = scanner.nextInt();

        if (scores.contains(searchScore)) {
            System.out.println("Score found at index: " + scores.indexOf(searchScore));
        } else {
            System.out.println("Score not found.");
        }

        System.out.println("\nUsing for loop:");
        for (int i = 0; i < scores.size(); i++) {
            System.out.println("Index " + i + ": " + scores.get(i));
        }

        System.out.println("\nUsing for-each loop:");
        for (Integer score : scores) {
            System.out.println(score);
        }

        scanner.close();
    }
}





