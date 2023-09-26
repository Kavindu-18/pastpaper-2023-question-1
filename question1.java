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
        System.out.println("Enter Student Id: ");
        StudentId =scn.next();

        System.out.println("Enter Student name: ");
        name=scn.next();

        System.out.println("Enter Student address: ");
        address=scn.next();

        System.out.println("Enter contact number: ");
        contactNumber=scn.next();
    }
    

    public void Print(String name,String StudentId,String address,String contactNumber){
        System.out.println("Name: "+name);
        System.out.println("StudentId: "+StudentId);
        System.out.println("Address: "+address);
        System.out.println("ContactNumber: "+contactNumber);
    }
}

//add class called course
class Course{
    //create three string variables
    private String courseId;
    private String name;
    private String instructor;


}

public static void main(String[] args) {
    
}