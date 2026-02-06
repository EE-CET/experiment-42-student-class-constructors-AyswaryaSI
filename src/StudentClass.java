import java.util.Scanner;

class StudentClass{
      String name;
      int    rollNo;

      Student(String name,int rollNo){
              this.name = name;
              this.rollNo = rollNo;
     }
     void display(int studentNumber){
          System.out.println("Student "+studentNumber+"details:Name: "+name+"Roll: "+rollNo);
     }
}
          

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name1 = sc.nextLine();
        int rollNo1  = sc.nextInt();
        String name2 = sc.nextLine();
        int rollNo2 =  sc.nextInt();
   
        Student s1 = new Student(name1, rollNo2);
        Student s2 = new Student(name2, rollNo2);

       s1.display(1);
       s2.display(2);
   

      sc.close();
   }
}

