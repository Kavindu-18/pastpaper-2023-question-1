import java.util.ArrayList;
import java.util.Scanner;

class student{
    //make three string variables
    private String name;
    private String StudentId;
    private String address;
    private String contactNumber;

    //make constructors to Read() and Print() the variable
    public void Read(String name, String StudentId, String address, String contactNumber){
        this.name = name;
        this.StudentId = StudentId;
        this.address = address;
        this.contactNumber = contactNumber;
    }

    //create a read method with scanner

    public void read(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Student Id : ") ;
        StudentId =scn.next();

        System.out.println("Enter Student name : ");
        name=scn.next();

        System.out.println("Enter Student address : ");
        address=scn.next();

        System.out.println("Enter contact number : ");
        contactNumber=scn.next();
    }
    

    public void Print(String name,String StudentId,String address,String contactNumber){
        System.out.println("Name: "+name);
        System.out.println("StudentId: "+StudentId);
        System.out.println("Address: "+address);
        System.out.println("ContactNumber: "+contactNumber);
    }

    public void print() {
    }
}

//add class called course
class Course{
    //create three string variables
    private String courseId;
    private String name;
    private String instructor;

    private ArrayList<student> enrolledStudents = new ArrayList<student>();
    
    //create a constructor to the course
    public Course(String courseId, String name, String instructor){
        this.courseId = courseId;
        this.name = name;
        this.instructor = instructor;
    }

        public Course() {
    }

        //create a read method with scanner
        public void read(){
            Scanner scn = new Scanner(System.in);
            System.out.println("Enter Course Id: ");
            courseId =scn.next();
    
            System.out.println("Enter Course name: ");
            name=scn.next();
    
            System.out.println("Enter Course instructor: ");
            instructor=scn.next();
        }

        //create a method to add students
        public void addStudent(student s){
            enrolledStudents.add(s);
        }

        //create a print method
        public void print(){
            System.out.println("Course Id: "+courseId);
            System.out.println("Course name: "+name);
            System.out.println("Course instructor: "+instructor);
            System.out.println("Enrolled Students: "+enrolledStudents.size());
            
            for(student s: enrolledStudents){
                s.print();
            }
        }
}

//crrating a class called StudentApp
class StudentApp{
    public static void main(String[] args) {
        //arraylist for students
        ArrayList<student> students = new ArrayList<student>();
        //arraylist for course
        ArrayList<Course> courses = new ArrayList<Course>();

        //create a for loop to read the students
        for(int i=0; i<2; i++){
            student s = new student();
            s.read();
            students.add(s);
        }

        //create a for loop to read the courses
        for(int i=0; i<2; i++){
            Course c = new Course();
            c.read();

            //create a for loop to add students 
            for(student s: students){
                c.addStudent(s); 
            }
            courses.add(c);
        }

        //create a for loop to print the courses
        for(Course c: courses){
            c.print();
        }
    }
}

