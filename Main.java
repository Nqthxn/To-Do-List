import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Tasks> taskList = new ArrayList<>();
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("========== TO-DO LIST ==========");
        displayTasks();

        Scanner input = new Scanner(System.in);

        
    }
    public static void displayTasks(){
        taskList.add(new Tasks("Buy groceries", "04/08/24", "High"));
        taskList.add(new Tasks("Finish project", "09/08/24", "Medium"));
        taskList.add(new Tasks("Doctor's appointment", "16/08/24", "Low"));
        taskList.add(new Tasks("Call the bank", "13/08/24", "Low"));
        for(int i = 0; i < taskList.size(); i++){
            System.out.println((i + 1) + ". " + taskList.get(i));
        }
        System.out.println();
        displayOptions();
    }
    public static void displayOptions(){
        String[] options = {"Add a new task", "Mark task as complete", "Delete a task", "View task details", "Exit"};
        System.out.println("Options : ");
        for(int i = 0; i < options.length; i++){
            System.out.println((i + 1) + ". " + options[i]);
        }
        System.out.println();
        System.out.print("Enter your choice : ");
        int choice = input.nextInt();
        input.nextLine();
        System.out.println();

        switch(choice){
            case 1:
                addTask(input);
                break;
            case 2:
                markComplete(input);
                break;
            case 3:
                deleteTask(input);
                break;
            case 4:
                viewTasks();
                break;
            case 5:
                System.out.println("Exiting.....");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid Choice. Please Try Again.\n\n");
                displayOptions();
        }
    }
    public static void addTask(Scanner input){
        System.out.print("Enter task description : ");
        String description = input.nextLine();

        System.out.print("Enter due date (DD/MM/YY) : ");
        String date = input.nextLine();

        System.out.print("Enter priority (High / Medium / Low) : ");
        String prior = input.nextLine();

        taskList.add(new Tasks(description, date, prior));
        System.out.println("Task added successfully!\n");
        displayOptions();

    }
    
    public static void markComplete(Scanner input){

    }
    public static void deleteTask(Scanner input){

    }
    public static void viewTasks(){
        System.out.println("========== TASKS ==========");
        for(int j = 0; j < taskList.size(); j++){
            System.out.println(taskList.get(j));
        }
    }
}
