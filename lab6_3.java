import java.util.Scanner;

public class Lab6_3 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in );
        int enrollmentno;
        String name;
        int sem;
        float spi;

        System.out.print("enter enrollmentno : ");
        enrollmentno = sc.nextInt();
        System.out.print("enter name : ");
        name = sc.next();
        System.out.print("enter sem : ");
        sem = sc.nextInt();
        System.out.print("enter spi : ");
        spi = sc.nextFloat();

        student_details d = new student_details(enrollmentno,name,sem,spi);
        d.printDetails();
        sc.close();
    }
}

class student_details {
    int enrllmentno;
    String name;
    int sem;
    double spi;

    student_details(int enrllmentno, String name, int sem, double spi) {
        this.enrllmentno = enrllmentno;
        this.name = name;
        this.sem = sem;
        this.spi = spi;
    }

    public void printDetails() {
        System.out.println("enrllmentno : "+enrllmentno);
        System.out.println("name:"+name);
        System.out.println("sem:"+sem);
        System.out.println("spi:"+spi);
    }
}