import java.util.Vector;

public class Course {

    private Department dept;
    private String title; // title of the course (e.g. Intro to programming);
    private String code; // course code, e.g. SOFE, ELEE, MANE, etc.
    private int number; // course number, e.g. 1200, 2710, 2800, etc.
    private Vector<Student> classList; // contains all students registered in this course

    public Course(String code, int number, Department dept, String title) {
        // also initialize the classList;
        this.code = code;
        this.number = number;
        this.dept = dept;
        this.title = title;
        this.classList = new Vector<Student>();
    }


    public Course() {
        // TODO Auto-generated constructor stub
    }

    public String toString() {
        // return a string representation of the course with the course code,
        // name, and number of people registered in the course in the following
        // format:
        // SOFE 2710 Object Oriented Programming and Design, Enrollment = 260
        String result = this.code + " " + this.number + " " + this.title + ", Enrollment = " + this.classList.size();
        return result;
    }


    public void addStudentToCourse(Student student) {
        classList.add(student);

    }


    public void AddStudentToDepartment(Student student, Course course) {
        dept.registerStudentCourseInDepartment(student,course);

    }

    public Department getDept() {
        return dept;
    }

    public Vector<Student> getClassList() {
        return classList;
    }


    //this method checks if
    public void checkCourseNum(int number){

        if (number == this.number){
            for(Student student : classList)

                System.out.println(student);
        }
    }

    public String getCode() {
        return code;
    }

    public int getNumber() {
        return number;
    }


}
