package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Person person = new Person("Karolina", "Mrówka");
        Person person1 = new Person("Andrzej", "Gawron");
        Person person2 = new Person("Logan", "Waleczny");
        Task task = new Task("naczynia", "mycie naczyn", 2, person);
        Task task1 = new Task("pranie", "nastawic pranie", -2, person1);
        Task task2 = new Task("kurze", "wytarcie blatów", 0, person2);
        System.out.println("Wartość piorytetu low dla mycia naczyń: " + task.lowPriority());
        System.out.println("Wartość piorytetu medium dla mycia naczyń: " + task.mediumPriority());
        System.out.println("Wartość piorytetu high dla mycia naczyń: " + task.highPriority());
        System.out.println("Wartość piorytetu low dla prania: " + task1.lowPriority());
        System.out.println("Wartość piorytetu medium dla prania: " + task1.mediumPriority());
        System.out.println("Wartość piorytetu high dla prania: " + task1.highPriority());
        System.out.println("Wartość piorytetu low dla kurzy: " + task2.lowPriority());
        System.out.println("Wartość piorytetu medium dla kurzy: " + task2.mediumPriority());
        System.out.println("Wartość piorytetu high dla kurzy: " + task2.highPriority());
    }
}
