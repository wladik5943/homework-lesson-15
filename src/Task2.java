import java.util.LinkedList;

public class Task2 {
    private LinkedList<String> list = new LinkedList<String>();
    public void addAnimal(String animal){
        list.addFirst(animal);
    }
    public void deleteAnimal(){
        list.removeLast();
    }
    public void showAnimal(){
        System.out.println(list);
    }
}
