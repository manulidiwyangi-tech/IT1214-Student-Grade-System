import java.util.Scanner;
import java.util.ArrayList;

class Student{
    private int studentID;
    private String studentName;
    private double marks;

    Student(int studentID,String studentName,double marks){
        this.studentID=studentID;
        this.studentName=studentName;
        this.marks=marks;
    }

    //getters
    public int getStudentID(){
        return studentID;
    }

    public String getStudentName(){
        return studentName;
    }

    public double getMarks(){
        return marks;
    }

    //setters
    public void setStudentID(int studentID){
        this.studentID=studentID;
    }

    public void setStudentName(String studentName){
        this.studentName=studentName;
    }

    public void setMarks(double marks){
        this.marks=marks;
    }


}

public class Main {
    public static void main (String arg[]){
    System.out.println("Welcome to Student Grade Management System!");

    ArrayList<Student> studentList=new ArrayList<>();
    Scanner sc=new Scanner(System.in);

    int choice;

    do{
        System.out.println("=================Student Grade Management System=========================");
        
        System.out.println("1.Add New Student Recode");
        System.out.println("2.View All Student Records");
        System.out.println("3.Search Student by ID");
        System.out.println("4.Calculate Average Marks");
        System.out.println("5.Exit");

        System.out.println("Enter your choice 1-5 :");
        choice= sc.nextInt();

        switch(choice){
            case 1:
                System.out.println("");
                System.out.println("1.Add New Student Recode");
                System.out.println("Enter Student ID : ");
                int id = sc.nextInt();   

                sc.nextLine();

                System.out.println("Enter Student Name : ");
                String name=sc.nextLine();

                System.out.println("Enter Student Marks : ");
                double marks=sc.nextDouble();

                Student st = new Student(id,name,marks);
                studentList.add(st);

                System.out.println("Student record added successfully! (^^)");
                break;

            case 2:
                System.out.println("");
                System.out.println("2.View All Student Records");

                if(studentList.size()==0){
                    System.out.println("Sorry....No student records available");
                }else{
                    for(Student s: studentList){
                        System.out.println("Student ID :" + s.getStudentID() + " Student Name : " + s.getStudentName() + " Student Marks : " + s.getMarks());
                    }
                    System.out.println("Total Students: " + studentList.size());
                }
                break;

            case 3:
                System.out.println("");
                break;

            case 4:
                System.out.println("");
                break;
            
            case 5:
                    System.out.println("\nExiting the system. Thank you!");
                    break;

                default:
                    System.out.println("\n[Invalid Input] Please enter a valid choice between 1 and 5.");
        }

    }while(choice !=5);


    }
}