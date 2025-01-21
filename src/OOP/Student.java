package OOP;

public class Student {

    String name, dept, gender;
    int id;

    //Object call pass Data Example
    void setInformation(Student st){
        id = st.id;
        name = st.name;
        dept = st.dept;
        gender = st.gender;
    }

    void getStudents(int id, String name, String department, String gender){

        this.id = id;
        this.name = name;
        dept = department;
        this.gender = gender;

    }

    void displayStudentInfo(){
        System.out.println("Id: "+id+" Name: "+name+" Dept: "+dept+"" +" Gender: "+gender);
    }


}
