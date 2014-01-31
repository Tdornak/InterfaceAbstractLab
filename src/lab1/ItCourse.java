/*
 * ItCourse would inherit from a class named "Course".
 * variable "Prerequisites" is now public static final to save memory.
 * getCourseName is now abstract
 * each sub class now has a "public static final String courseName = "name here";
 * sub class constructors now take credits for an arguement instead of courseName.
 *
 * Removed JOptionPane import from IntroToProgrammingCourse and AdvancedJava
 *
 * IntroJavaCourse "courseName" variable not marked private.
 * IntroJavaCourse "setCredits" method contained incorrect ranges.
 * ^^ Constructor would not work with inheritance.
 *
 * AdvancedJavaCourse "courseName" not marked private.
 * 
 */

package lab1;

import javax.swing.JOptionPane;

/**
 * The credits could probably be a final as well.
 * 
 * @author Tim
 */
public abstract class ItCourse {
    
    private String courseNumber;
    private double credits;
 
    public abstract String getCourseName();

    public String getCourseNumber() {
        return courseNumber;
    }

    public final void setCourseNumber(String courseNumber) {
        if(courseNumber == null || courseNumber.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseNumber cannot be null of empty string");
            System.exit(0);
        }
        this.courseNumber = courseNumber;
    }

    public double getCredits() {
        return credits;
    }

    public void setCredits(double credits) {
        if(credits < 0.5 || credits > 4.0) {
            JOptionPane.showMessageDialog(null,
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        this.credits = credits;
    }
    
    
}
