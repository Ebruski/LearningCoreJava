import java.text.NumberFormat;
import java.util.Locale;

public class Assignment {
    public static void main(String[] args) {
        long l = 789;

        NumberFormat us = NumberFormat.getInstance(Locale.US);
        System.out.println(us.format(l));

        NumberFormat uk = NumberFormat.getInstance(Locale.UK);
        System.out.println(uk.format(l));

        //Extras - not in the scope of the assignment but for a quick demo on formatting
        Double d = 12312312.3434;
        System.out.println(us.format(d));
        System.out.println(uk.format(d));

    }
}
