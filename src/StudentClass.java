import java.util.Scanner;

public class StudentClass {

    String name;
    int rollNo;

    StudentClass(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    void display(int studentNumber) {
        System.out.println("Student " + studentNumber + " details:");
        System.out.println("Name: " + name);
        System.out.println("Roll: " + rollNo);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name1 = sc.nextLine();
        int rollNo1 = sc.nextInt();
        sc.nextLine();
        String name2 = sc.nextLine();
        int rollNo2 = sc.nextInt();

        StudentClass s1 = new StudentClass(name1, rollNo1);
        StudentClass s2 = new StudentClass(name2, rollNo2);

        s1.display(1);
        s2.display(2);

        sc.close();
    }
}
