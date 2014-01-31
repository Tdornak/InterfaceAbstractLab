package lab1;

/**
 * Describe responsibilities here.
 * Holds information about IntroJavaCourse objects.
 * Has 1 copy of prerequisites.
 *
 * @author      Tim Dornak
 * @version     1.00
 */
public class IntroJavaCourse extends ItCourse {
    
    public static final String prerequisites = "IntroToProgrammingCourse";

    public IntroJavaCourse(String courseName, String courseNumber) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
    }

    public String getPrerequisites() {
        return prerequisites;
    }

}
