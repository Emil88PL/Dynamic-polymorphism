import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
      
        
        Scanner scanner = new Scanner(System.in);
        Animal animal;

        System.out.println("What animal do you want?");
        System.out.print("1=Dog or 2=Cat: ");

        int choice = scanner.nextInt();

        if (choice == 1) {
            animal = new Dog();
            animal.speak();
        } else if (choice == 2) {
            animal = new Cat();
            animal.speak();
        } else {
            animal = new Animal();
            animal.speak();
        }

        scanner.close();
    }
}
