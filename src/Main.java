import java.util.LinkedList;
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


        LinkedList<Student> list = new LinkedList<>();
        list.add(new Student("vlad",22234,2,8.6));
        list.add(new Student("pavel",44534,3,5.4));
        list.add(new Student("daniil",25543,2,2.5));
        list.add(new Student("leonid",44532,3,4));
        Task3.deleteStudent(list);

        Task3.printStudent(list,3);



        ArrList<Integer> arrList = new ArrList<>();
        arrList.add(54);
        arrList.add(4);
        arrList.add(87);
        arrList.add(1);
        arrList.add(87);
        arrList.show();
        arrList.add(43,3);
        arrList.show();
        arrList.show(4);
        arrList.delete();
        arrList.show();
        arrList.delete(3);
        arrList.show();
        arrList.clear();
        arrList.show();
    }
}