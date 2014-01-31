package lab1;



/**
 * Describe responsibilities here.
 * Holds information for AdvancedJavaCourse
 * Has 1 copy of prerequisites
 *
 * @author      Tim Dornak
 * @version     1.00
 */
public class AdvancedJavaCourse extends ItCourse {
    
    public static final String prerequisites = "IntroJavaCourse";

    public AdvancedJavaCourse(String courseName, String courseNumber) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
    }

    public String getCapitalizedCourseName() {
        return this.getCourseName().toUpperCase();
    }

    public String getPrerequisites() {
        return prerequisites;
    }

}
