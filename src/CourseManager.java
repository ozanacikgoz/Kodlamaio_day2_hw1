public class CourseManager {
    public void addCourse(Courses course){
        System.out.println(course.getCourseName() + " is added to your account.");
    }
    public void deleteCourse(Courses course){
        System.out.println(course.getCourseName() + " is deleted from your account.");
    }
}
