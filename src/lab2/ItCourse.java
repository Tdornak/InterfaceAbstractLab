/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab2;

/**
 * If i were to have an abstract class and an interface, i would call the class "Course"
 * and leave the interface as ItCourse. that way a course can implement methods from multiple
 * types of courses.
 * 
 * 
 * 
 * 
 * @author Tim
 */
public interface ItCourse {
    
    public abstract String getCourseNumber();
    public abstract double getCredits();
    public abstract String getCourseName();
    public abstract String getPrerequisites();
    public abstract void setCourseNumber(String courseNumber);
    public abstract void setCredits(double credits);
    
    
}
