/*
 * ItCourse would inherit from a class named "Course".
 */

package lab1;

/**
 *
 * @author Tim
 */
public abstract class ItCourse {
    private String courseName;
    private String courseNumber;
    private double credits;

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    public double getCredits() {
        return credits;
    }

    public void setCredits(double credits) {
        this.credits = credits;
    }
    
    
}
