package Constructor;

public class Student {

    int id;
    String name, dept;

    Student(){
        System.out.println("This Students Class Constructtor Call");
    }

    void showDisplay(){
        System.out.println("Student Id: "+ id+"Student Name: "+ name+"Student Department: "+ dept);
    }

}
