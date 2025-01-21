package OOP;

public class TestStudent {

    public static void main(String[] args) {

        Student st = new Student();
//        st.name = "Md Towhidul Islam";
//        st.dept = "EEE";
//        st.gender = "Male";
//        st.id = 100;
//
        Student st1 = new Student();
//        st1.name = "Adhora Islam";
//        st1.dept = "CSE";
//        st1.gender = "Female";
//        st1.id = 99;

     st.getStudents(100, "Md Towhidul Islam", "EEE","Male");
     st1.getStudents(101, "Adhora Islam", "CSE","female");
     st.displayStudentInfo();
     st1.displayStudentInfo();

     Student st2 = new Student();
     st2.setInformation(st);
     st2.displayStudentInfo();

//        System.out.println(st.name+" "+st.dept+" "+st.gender+" "+st.id);
//        System.out.println(st1.name+" "+st1.dept+" "+st1.gender+" "+st1.id);

    }

}
