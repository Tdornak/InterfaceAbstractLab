
package lab1;

/**
 * There was not much to make abstract in this lab but the program is certainly more flexible then
 * it was without the abstract superclass.
 * 
 * @author Tim
 */
public class Startup {
    
    public static void main(String[] args) {
        
        ItCourse course1 = new AdvancedJavaCourse("115-116", 3);
        System.out.println(course1.getCourseName() + "  " + course1.getCourseNumber() + "  " + 
                course1.getCredits());
        
        
        AdvancedJavaCourse course2 = new AdvancedJavaCourse("116-117", 4);
        System.out.println(course2.getCourseName() + "  " + course2.getCourseNumber() + "  " + 
                course2.getCredits() + "  " + course2.getPrerequisites());
        
        
        ItCourse course3 = new IntroToProgrammingCourse("199-199", 3.5);
        System.out.println(course3.getCourseName() + "  " + course3.getCourseNumber() + "  " + 
                course3.getCredits());
        
        
        ItCourse course4 = new IntroJavaCourse("188-188", 2);
        System.out.println(course4.getCourseName() + "  " + course4.getCourseNumber() + "  " + 
                course4.getCredits());
    }
    
 /*
 * I used the Liskov substitution principle below and noticed that i can change the sub class in line 17
 * and the code will still work fine.  But i cant call the getCapitalizedCourseName() in AdvancedJava
 * if i do it this way, yet i can if i replace the super class with AdvancedJava.
 * 
 * The principle seems very useful if all the subclasses are only using methods declared in the superclass.
 * But if the subclasses all use methods for different purposes then it probably wont be very helpful.
 */
    
}
