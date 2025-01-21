package Static;

public class TestEmployee {

    public static void main(String[] args) {

        Employee em1 = new Employee();
        Employee em2 = new Employee();
        em1.getInfo(101, "Md Towhidul Islam");
        em2.getInfo(102, "Munna Ahmed");

        em1.showDisplay();
        em2.showDisplay();


    }

}
