public class StringParser {

    public static void main(String[] args) {

        try {
            String s = "abcd";
            int i = Integer.parseInt(s);
        }
        catch (NumberFormatException e){
            System.out.println("Make sure number is included in the string you want to convert to int");
        }



    }

}

