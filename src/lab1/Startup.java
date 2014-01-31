/*
 * I used the Liskov substitution principle below and noticed that i can change the sub class in line 17
 * and the code will still work fine.  But i cant call the getCapitalizedCourseName() in AdvancedJava
 * if i do it this way, yet i can if i replace the super class with AdvancedJava.
 * 
 * The principle seems very usefull if all the subclasses are only useing methods declared in the superclass.
 * But if the subclasses all use methods for different purposes then it probably wont be very helpful.
 */

package lab1;

/**
 *
 * @author Tim
 */
public class Startup {
    
    public static void main(String[] args) {
        
        ItCourse course = new AdvancedJavaCourse("Something", "55");
        course.setCredits(3.5);
        System.out.println(course.getCourseName() + " " + course.getCourseNumber());
        
    }
    
}
