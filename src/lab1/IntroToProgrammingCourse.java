package lab1;

import javax.swing.JOptionPane;


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
    
    public IntroToProgrammingCourse(String courseNumber, double credits) {
        this.setCourseNumber(courseNumber);
        this.setCredits(credits);
    }

    @Override
    public final String getCourseName() {
        return "Intro to Programming";
    }

    @Override
    public final void setCredits(double credits) {
        if(credits < 0.5 || credits > 4.0) {
            JOptionPane.showMessageDialog(null,
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        super.setCredits(credits);
    }

    @Override
    public final String getPrerequisites() {
        return "none";
    }

    @Override
    public final void setCourseNumber(String courseNumber) {
        if(courseNumber == null || courseNumber.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseNumber cannot be null of empty string");
            System.exit(0);
        }
       super.setCourseNumber(courseNumber);
    }

    
    
}
