import java.util.Vector;

public class Student extends Person {

    private String id;
    private String name;
    private Vector courses; // contains all courses the student is registered in


    public Student(String stdName, String stdId) {
        this.name = stdName;
        this.id = stdId;

        this.courses = new Vector<Course>();


    }

    @Override
    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }



    public String toString() {
        // return a string representation of a student using the following format:
        // 100234546 John McDonald
        // Registered courses: ELEE 2110, ELEE 2790, SOFE 2710, SOFE 2800, SOFE 2850

        /* String res = "";

        for (int i = 0; i < courses.size(); i++){
             res += courses.elementAt(i).

        }
        */


        String result = this.id + " " + this.name + "\n" + "Registered Courses: " + this.courses;
        return result;
    }

    public void registerFor(Course course){
        if (!(courses.contains(course))){

            courses.add(course);//adds the course to the student's list
            course.addStudentToCourse(this);//adds student to the class list
            course.AddStudentToDepartment(this,course); //adds student to the course's department's registerList



        }
    }
    public boolean isRegisteredInCourse(Course course) {
        boolean isRegistered = false;
        if ((courses.contains(course))){
            isRegistered = true;
        }
        return isRegistered;

    }


}


