import java.util.Scanner;

public class RadioButtonDemoConsole {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Choose a pet:");
        System.out.println("1. Bird");
        System.out.println("2. Cat");
        System.out.println("3. Dog");
        System.out.println("4. Rabbit");
        System.out.println("5. Pig");
        
        int choice = scanner.nextInt();
        String selectedPet = null;
        
        switch (choice) {
            case 1:
                selectedPet = "Bird";
                break;
            case 2:
                selectedPet = "Cat";
                break;
            case 3:
                selectedPet = "Dog";
                break;
            case 4:
                selectedPet = "Rabbit";
                break;
            case 5:
                selectedPet = "Pig";
                break;
            default:
                System.out.println("Invalid choice. Please choose a number between 1 and 5.");
                break;
        }
        
        if (selectedPet != null) {
            System.out.println("You selected: " + selectedPet);
        }

        scanner.close();
    }
}
