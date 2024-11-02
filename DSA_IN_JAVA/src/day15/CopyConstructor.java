package day15;

class Students {
    String name;
    int rollNo;
    String password;
    int[] marks;

    Students() {
        marks = new int[3];
        System.out.println("hi");
    }

    // Shallow copy const
//    Students(Students s1){
//        marks = new int[3];
//        this.name = s1.name;
//        this.rollNo = s1.rollNo;
//        this.marks = s1.marks;
//    }

    // deep copy constructor
    Students(Students s1) {
        marks = new int[3];
        this.name = s1.name;
        this.rollNo = s1.rollNo;
        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = s1.marks[i];
        }
    }
}
    public class CopyConstructor {
        public static void main(String[] args) {
            Students s1 = new Students();
            s1.name = "Prateek";
            s1.rollNo = 108;
            s1.password = "acbd";
            s1.marks[0] = 100;
            s1.marks[1] = 90;
            s1.marks[2] = 80;

            Students s2 = new Students(s1);
            s2.password = "mnop";
            s1.marks[2] = 100;
            for (int i = 0; i < 3; i++) {
                System.out.println(s2.marks[i]);
            }
        }
    }

