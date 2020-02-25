
package student;

import course.Course;
import computer.Computer;

/**
 *
 * @author qa
 */
public class Student {
    private String firstName;
    private String lastName;
    private int yearOfBirth;
    private Course course;
    private Computer computer;
    
    public Computer getComputer() {
        return this.computer;
    }
    
    
    public Course getCourse() {
        return this.course;
    }
    
    
    
    
    public String getFirstName() {
        return this.firstName;
    }
    
    public void setFirstName(String customFirstName) {
        this.firstName = customFirstName;
    }
    
    public String getLastName() {
        return this.lastName;
    }
    
    public void setLastName(String customLastName) {
        this.firstName = customLastName;
    }
    
     public int getYearOfBirth() {
        return this.yearOfBirth;
    }
    
    public void setYearOfBirth(int customYearOfBirth) {
        this.yearOfBirth = customYearOfBirth;
    }
    
    
    public Student() {
        
    } 
    
    
    public Student(String customFirstName, String customLastName, int customYearOfBirth) {
        this.firstName = customFirstName;
        this.lastName = customLastName;
        this.yearOfBirth = customYearOfBirth;
    }
    
    
    public void info() {
        System.out.println("First name: " + this.getFirstName());
        System.out.println("Last name: " + this.getLastName());
        System.out.println("Year of Birth: " + this.getYearOfBirth());
    }
    


    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


