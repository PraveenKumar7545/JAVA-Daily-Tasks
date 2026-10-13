import java.util.ArrayList;
import java.util.Scanner;

public class Q05_To_Do_List {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();

        while (true) {
            System.out.println("\n--- To-Do List ---");
            System.out.println("1. Add Task");
            System.out.println("2. Display Tasks");
            System.out.println("3. Remove Task");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");

            int choice = scan.nextInt();
            scan.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter task: ");
                    String task = scan.nextLine();

                    if (task.trim().isEmpty()) {
                        System.out.println("Task cannot be empty.");
                    } else {
                        tasks.add(task);
                        System.out.println("Task added.");
                    }
                    break;

                case 2:
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks available.");
                    } else {
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println((i + 1) + ". " + tasks.get(i));
                        }
                    }
                    break;

                case 3:
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks to remove.");
                        break;
                    }

                    System.out.print("Enter task number to remove: ");
                    int number = scan.nextInt();

                    if (number >= 1 && number <= tasks.size()) {
                        tasks.remove(number - 1);
                        System.out.println("Task removed.");
                    } else {
                        System.out.println("Invalid task number.");
                    }
                    break;

                case 4:
                    System.out.println("Exiting To-Do List.");
                    scan.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}