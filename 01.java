import java.util.*;
class Student {
    String id;
    String name;
}
class Student1 {
    public static void main(String[] args) {
        Student s1 = new Student();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name :");
        s1.name = sc.nextLine();

        System.out.print("Enter ID :");
        s1.id = sc.next();

        System.out.println("Name :" + s1.name);
        System.out.println("ID :" + s1.id);
    }
}
