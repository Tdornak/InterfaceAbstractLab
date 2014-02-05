package lab1;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here.
 * Holds information about IntroJavaCourse objects.
 * Has 1 copy of prerequisites.
 *
 * @author      Tim Dornak
 * @version     1.00
 */
public class IntroJavaCourse extends ItCourse {

    public IntroJavaCourse(String courseNumber, double credits) {
        this.setCourseNumber(courseNumber);
        this.setCredits(credits);
    }

    @Override
    public final String getPrerequisites() {
        return "Intro To Programming";
    }

    @Override
    public final String getCourseName() {
        return "Intro To Java";
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

    @Override
    public final void setCredits(double credits) {
        if(credits < 0.5 || credits > 4.0) {
            JOptionPane.showMessageDialog(null,
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        super.setCredits(credits);
    }

}
