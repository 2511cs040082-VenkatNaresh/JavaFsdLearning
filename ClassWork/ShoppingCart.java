import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ShoppingCart {
    private Product[] items = new Product[10];
    private List<Product> itemsList = new ArrayList<>();

    public void addProduct(Product product) {
        itemsList.add(product);
    }
    // students.add("alice");
    // students.add("bob");
    // students.add("charlie");
    // students.add("dave");
    // students.add("eve");
    //System.out.println("Students: " + students);

    //at a specific position
    //students.add(2, "eve");
    //System.out.println("Students: " + students);

    //Add all elements from another collection
    //List<String> newStudents = new ArrayList<>();
    //students.add(moreStudents);
    //System.out.println("Students: " + students);


    //Accessing elements
    String first = students.get(0);
    String second = students.get(1);
    String third = students.get(2);
    System.out.println("First student: " + first);


    //Removing elements
    students.remove(1);
    students.remove("bob");
    System.out.println("Students after removal: " + students);

    //Remove all elements matching a condition
    students.removeIf(student -> student.startsWith("a"));
    System.out.println("Students after removing those starting with 'a': " + students);

    //Checking contents
    boolean hasAlice = students.contains("Alice");
    boolean hasbob = students.contains("bob");
    System.out.println("Contains Alice? "+ hasAlice);
    System.out.println("Contains Bob? "+ hasbob);

    int index = students.Indexof

    //iterator
    System.out.println("\n ---Iterator(Professional)---");
    Iterator<String> iterator = students.iterator();
    while(iterator.hasNext()){
        String student= iterator.next();
        System.out.println("")
    }
}