/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab2;

/**
 * I copied the exact same code from lab1 here (and other places).
 * I needed to re-declare the credits and courseNumber variables in each sub-class.
 * 
 * At this time i am not noticing any difference in the code below now that ItCourse is an interface
 * 
 * Liskov substitution principle can be used when the sub-class only needs to use methods that are inherited from
 * the super-class.  So it works very well with the code below. however if i needed to get "course1"'s 
 * prerequisite I would have to change line 26 to look like line 31
 * 
 * 
 * @author Tim
 */
public class Startup {
    
    public static void main(String[] args) {
        
        ItCourse course1 = new AdvancedJavaCourse("115-116", 3);
        System.out.println(course1.getCourseName() + " - " + course1.getCourseNumber() + " - " + 
                course1.getCredits());
        
        
        AdvancedJavaCourse course2 = new AdvancedJavaCourse("116-117", 4);
        System.out.println(course2.getCourseName() + " - " + course2.getCourseNumber() + " - " + 
                course2.getCredits() + " - " + course2.getPrerequisites());
        
        
        ItCourse course3 = new IntroToProgrammingCourse("199-199", 3.5);
        System.out.println(course3.getCourseName() + " - " + course3.getCourseNumber() + " - " + 
                course3.getCredits());
        
        
        ItCourse course4 = new IntroJavaCourse("188-188", 2);
        System.out.println(course4.getCourseName() + " - " + course4.getCourseNumber() + " - " + 
                course4.getCredits());
        
        
    }
    
}
