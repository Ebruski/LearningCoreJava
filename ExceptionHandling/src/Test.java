public class Test {

    static ArrayIndexOOBDemo a;

    public static void main(String[] args) {

        try {
            Test.a.method1();
        }
        catch (NullPointerException ex){
            System.out.println("Class wasn't initialized");
        }



    }

}

