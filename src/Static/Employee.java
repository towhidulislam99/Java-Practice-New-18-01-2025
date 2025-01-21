package Static;

public class Employee {

    int id;
    String name;
    static String companyName = "DevWebPlus";

    void getInfo(int id, String name){
        this.id = id;
        this.name = name;

    }

    void showDisplay(){
        System.out.println("Id: "+id+"\n"+"Name: "+name+"\n"+"Company Name: "+companyName+"\n\n");
    }

}
