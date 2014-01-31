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
    
    public static final String prerequisites = "Intro To Programming";
    public static final String courseName = "Intro To Java";

    public IntroJavaCourse(String courseNumber, double credits) {
        this.setCourseNumber(courseNumber);
        this.setCredits(credits);
    }

    public String getPrerequisites() {
        return prerequisites;
    }

    @Override
    public String getCourseName() {
        return courseName;
    }

}
