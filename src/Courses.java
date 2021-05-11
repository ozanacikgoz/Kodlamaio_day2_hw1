public class Courses {
    private int CourseID;
    private String CourseName;
    private String Instructor;
    private String CourseInfo;

    public Courses(int courseID, String courseName, String instructor, String courseInfo) {
        CourseID = courseID;
        CourseName = courseName;
        Instructor = instructor;
        CourseInfo = courseInfo;
    }

    public int getCourseID() {
        return CourseID;
    }

    public String getCourseName() {
        return CourseName;
    }

    public String getInstructor() {
        return Instructor;
    }

    public String getCourseInfo() {
        return CourseInfo;
    }

    @Override
    public String toString() {
        return "Courses{" +
                "CourseID=" + CourseID +
                ", CourseName='" + CourseName + '\'' +
                ", Instructor='" + Instructor + '\'' +
                ", CourseInfo='" + CourseInfo + '\'' +
                '}';
    }
}