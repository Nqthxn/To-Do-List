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

        switch(choice){
            case 1:
                addTask(input);
                break;
            case 2:
                markComplete(input);
                break;
        }
    }
    public static void addTask(Scanner input){

    }
    public static void markComplete(Scanner input){

    }
    public static void deleteTask(){

    }
    public static void viewTasks(){

    }
}
