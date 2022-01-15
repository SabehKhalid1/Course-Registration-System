import java.util.HashSet;
import java.util.Vector;

public class Department {


    private String name; // the name of school Dept of Computing and Info Science
    private String id; // short name for courses SOFE, ELEE, STAT, etc
    private Vector<Course> courseList; // all courses offered by the department
    private Vector<Student> registerList; // all students taking courses in the department.


    public Department(String name, String id) {
        this.name = name;
        this.id = id;

        // also initialize the vectors
        this.courseList = new Vector<Course>();
        this.registerList = new Vector<Student>();
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }


    public String toString() {

        // returns a string representation of department name, number
        // of courses offered and number of students registered in the
        // department. Use the format:

        String result = this.id + ": " + " " + this.courseList.size() + " courses, " + this.registerList.size() + " students";
        return result;
        // ECSE: 53 courses, 460 students
    }

    public void offerCourse(Course course) {
        if(!(courseList.contains(course))){
            courseList.add(course);
        }
    }

    public void printCoursesOffered(){
        for (int x = 0; x <courseList.size(); x++){
            System.out.println(courseList.elementAt(x).toString());
        }

    }

    //adds student to the registerList
    public void registerStudentCourseInDepartment(Student student,Course course){

        //only adds student to the register list if they aren't already on it
        if (!(registerList.contains(student))){
            registerList.add(student);
        }
        if (!(courseList.contains(course))){
            courseList.add(course);
        }
    }

    public void printStudentsByName(){
        for (Student student : registerList){
            System.out.println(student.getName() + "this is id: " + student.getId() ) ;

        }


    }

    public void printStudentsByName(int number){
        for( Course courses : courseList){
            courses.checkCourseNum(number);

        }


    }




    public boolean isStudentRegistered(Student student) {
        boolean isRegistered = false;
        if ((registerList.contains(student))){
            isRegistered = true;
        }
        return isRegistered;

    }

    /* public void largestCourse() {

    }

     */



    public Vector<Student> isStudentRegistered(int code) {
        Vector<Student> registeredStudents = new Vector<Student>();
        Course foundCourse = null;
        for (Course course : courseList) {
            if (course.getNumber() == code){
                foundCourse = course;
                break;
            }
        }
        for (Student student : registerList) {
            boolean isRegistered = student.isRegisteredInCourse(foundCourse);
            if (isRegistered) {
                registeredStudents.add(student);

            }

        }

        return registeredStudents;
    }


    public Course largestCourse() {
        int max = 0;
        Course biggestCourse = null;
        for (Course course : courseList){
            int currentSize = course.getClassList().size();
            if (currentSize > max){
                max = currentSize;
                biggestCourse = course;

            }
        }
        return biggestCourse;
    }



}
