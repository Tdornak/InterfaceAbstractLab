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

/**
 * The credits could probably be a final as well.
 * 
 * @author Tim
 */
public abstract class ItCourse {
    
    private String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisites;
 
    public abstract String getCourseName();

    public final String getCourseNumber() {
        return courseNumber;
    }

    public  void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    public final double getCredits() {
        return credits;
    }

    public  void setCredits(double credits) {
        this.credits = credits;
    }

    public abstract String getPrerequisites();

    
    
    
    
}
