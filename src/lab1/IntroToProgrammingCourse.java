package lab1;


/**
 * Describe responsibilities here. NOTE: this class has NO PREREQUISITES!
 * Do not change this fact.
 * 
 * This class holds all the information for IntroToProgrammingCourse objects.
 *
 * @author      Tim Dornak
 * @version     1.00
 */
public class IntroToProgrammingCourse extends ItCourse {
    
    private static final String courseName = "Intro To Programming";
    
    public IntroToProgrammingCourse(String courseNumber, double credits) {
        this.setCourseNumber(courseNumber);
        this.setCredits(credits);
    }

    @Override
    public String getCourseName() {
        return courseName;
    }

    
    
}
