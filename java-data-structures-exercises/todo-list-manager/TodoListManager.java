import java.util.LinkedList;
import java.util.Scanner;

public class TodoListManager {
    public static void main(String[] args) {
        LinkedList<String> tasks = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        tasks.add("Study LinkedList");
        tasks.add("Do Java lab");
        tasks.add("Read Chapter 4");
        tasks.add("Complete assignment");
        tasks.add("Practice coding");

        int choice = 0;

        while (choice != 4) {
            System.out.println("\n===== TO-DO LIST MENU =====");
            System.out.println("1. Add Task");
            System.out.println("2. Remove Task");
            System.out.println("3. Show All Tasks");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter new task: ");
                    String newTask = scanner.nextLine();
                    tasks.addLast(newTask);
                    System.out.println("Task added successfully!");
                    break;

                case 2:
                    System.out.print("Enter task name to remove: ");
                    String taskToRemove = scanner.nextLine();

                    if (tasks.remove(taskToRemove)) {
                        System.out.println("Task removed successfully!");
                    } else {
                        System.out.println("Task not found.");
                    }
                    break;

                case 3:
                    System.out.println("\nYour Tasks:");
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks available.");
                    } else {
                        int index = 1;
                        for (String task : tasks) {
                            System.out.println(index + ". " + task);
                            index++;
                        }
                    }
                    break;

                case 4:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }

        scanner.close();
    }
}
