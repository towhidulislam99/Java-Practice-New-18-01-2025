package OOP;

public class TestOverloading {

    public static void main(String[] args) {

        methodOverloadingExample overloading = new methodOverloadingExample();
        System.out.println(overloading.doAddition(10, 30));
        System.out.println(overloading.doAddition(50, 50, 50));
        System.out.println(overloading.doAddition(30.5f, 70.9f));

        overloading.showDisplay(10, 30.44f);
        overloading.showDisplay(10, 60, 30.66f, 66.25f);

//        overloading.showDisplay();

    }

}
