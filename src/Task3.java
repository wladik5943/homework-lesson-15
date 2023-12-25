import java.util.LinkedList;

public class Task3 {
    public static void deleteStudent(LinkedList<Student> list){
        System.out.println("изначальный список");
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getGrade() <= 3){
                list.remove(i);
            }
        }
        System.out.println("отредактированный список");
        System.out.println(list);
    }

    public static void printStudent(LinkedList<Student> list,int course){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getCourse() == course){
                System.out.println(list.get(i).toString());
            }
        }
    }
}
