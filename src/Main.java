import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        Task1.task(str);


        Task2 Animal = new Task2();
        Animal.addAnimal("zebra");
        Animal.addAnimal("tiger");
        Animal.addAnimal("cat");
        Animal.showAnimal();
        Animal.deleteAnimal();
        Animal.showAnimal();



    }
}