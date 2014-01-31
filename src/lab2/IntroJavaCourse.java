package lab2;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here.
 * holds info for intro to java course objects
 * has 1 copy of courseName and prerequisites
 *
 * @author      Tim Dornak
 * @version     1.00
 */
public class IntroJavaCourse implements ItCourse {
    
    public static final String courseName = "Intro To Java";
    public static final String prerequisites = "Intro To Programming";
    private String courseNumber;
    private double credits;
    

    public IntroJavaCourse(String courseNumber, double credits) {
        this.credits = credits;
        this.courseNumber = courseNumber;
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

    public String getPrerequisites() {
        return prerequisites;
    }

    public String getCourseName() {
        return courseName;
    }

    public double getCredits() {
        return credits;
    }
    
    public String getCourseNumber() {
        return courseNumber;
    }


}
