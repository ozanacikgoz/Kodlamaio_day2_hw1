public class Main {
    public static void main(String[] args) {
        Courses course1 = new Courses(1, "Java Spring & React", "Engin","Java ve React");
        Courses course2 = new Courses(2, "C# & Angular","Engin","C# ve Angular");

        Courses courses[] = {course1,course2};

        Instructor instructor1 = new Instructor(1, "Engin");
        Instructor instructor2 = new Instructor(2, "Salih");

        Instructor instructors[] = {instructor1,instructor2};

        CourseManager courseManager = new CourseManager();
        courseManager.addCourse(course1);
        courseManager.deleteCourse(course2);
    }
}