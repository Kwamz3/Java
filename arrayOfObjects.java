class Student {
    int rollno;
    String name;
    int marks;

}

public class arrayOfObjects {


    public static void main(String args [])
    {

        Student objStudent1 = new Student();
        objStudent1.rollno = 4;
        objStudent1.name = "Nathalie";
        objStudent1.marks = 89;

        // System.out.println(objStudent1.name + ": " + objStudent1.rollno);

        Student objStudent2 = new Student();
        objStudent2.rollno = 4;
        objStudent2.name = "Sandra";
        objStudent2.marks = 97;

        // System.out.println(objStudent2.name + ": " + objStudent2.rollno);

        Student objStudent3 = new Student();
        objStudent3.rollno = 4;
        objStudent3.name = "Fred";
        objStudent3.marks = 78;

        // System.out.println(objStudent3.name + ": " + objStudent3.rollno);

        Student students[] = new Student[3];
        students[0] = objStudent1;
        students[1] = objStudent2;
        students[2] = objStudent3;

        // System.out.println();

        // for (int i = 0; i < students.length; i++) {
        // System.out.println(students[i].name + ": " + students[i].rollno);
        // }

        // Student[] student = { objStudent1, objStudent2, objStudent3 };
        
        for (Student s : students) {
            System.out.println(s.name + " : " + s.rollno);
        }
        
    }
}
