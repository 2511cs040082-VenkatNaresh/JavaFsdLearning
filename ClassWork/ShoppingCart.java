import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Product {
    String name;

    Product(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}

public class ShoppingCart {

    private List<Product> itemsList = new ArrayList<>();

    public void addProduct(Product product) {
        itemsList.add(product);
    }

    public static void main(String[] args) {

        List<String> students = new ArrayList<>();

        students.add("alice");
        students.add("bob");
        students.add("charlie");
        students.add("dave");

        System.out.println("Students: " + students);

        students.add(2, "eve");
        System.out.println("After inserting at index 2: " + students);

        List<String> moreStudents = new ArrayList<>();
        moreStudents.add("john");
        moreStudents.add("emma");

        students.addAll(moreStudents);
        System.out.println("After adding all: " + students);

        String first = students.get(0);
        String second = students.get(1);
        String third = students.get(2);

        System.out.println("First student: " + first);

        students.remove(1);
        students.remove("bob");
        System.out.println("After removal: " + students);

        students.removeIf(student -> student.startsWith("a"));
        System.out.println("After removing names starting with 'a': " + students);

        boolean hasAlice = students.contains("alice");
        boolean hasBob = students.contains("bob");

        System.out.println("Contains alice? " + hasAlice);
        System.out.println("Contains bob? " + hasBob);

        int index = students.indexOf("charlie");
        System.out.println("Index of charlie: " + index);

        System.out.println("\n--- Iterator ---");
        Iterator<String> iterator = students.iterator();

        while (iterator.hasNext()) {
            String student = iterator.next();
            System.out.println(student);
        }
    }
}