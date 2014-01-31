package lab2;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here.
 * holds info for intro to programming objects
 * has 1 copy of courseName
 *
 * @author      Tim Dornak
 * @version     1.00
 */
public class IntroToProgrammingCourse implements ItCourse {
    
    public static final String courseName = "Intro To Programming";
    private String courseNumber;
    private double credits;

    public IntroToProgrammingCourse(String courseNumber, double credits) {
        this.credits = credits;
        this.setCourseNumber(courseNumber);
    }

    public final void setCourseNumber(String courseNumber) {
        if(courseNumber == null || courseNumber.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseNumber cannot be null of empty string");
            System.exit(0);
        }
        this.courseNumber = courseNumber;
    }
    
    public void setCredits(double credits) {
        if(credits < 0.5 || credits > 4.0) {
            JOptionPane.showMessageDialog(null,
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        this.credits = credits;
    }

    public String getCourseName() {
        return courseName;
    }
    
    public String getCourseNumber() {
        return courseNumber;
    }

    public double getCredits() {
        return credits;
    }
}
