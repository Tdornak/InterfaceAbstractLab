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
    
    private static final String prerequisites = "Intro To Java";
    private static final String courseName = "Advanced Java";

    public AdvancedJavaCourse(String courseNumber, double credits) {
        this.setCourseNumber(courseNumber);
        this.setCredits(credits);
    }

    public String getCapitalizedCourseName() {
        return this.getCourseName().toUpperCase();
    }

    public String getPrerequisites() {
        return prerequisites;
    }

    @Override
    public String getCourseName() {
        return courseName;
    }

}
