import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest {

    public static void main(String[] args) {
        Double d = 1232322.3434;

        NumberFormat nf = NumberFormat.getInstance(Locale.FRANCE);
        nf.setMinimumFractionDigits(4);
        nf.setMaximumFractionDigits(3);

        nf.setMaximumIntegerDigits(4);
        System.out.println(nf.format(d));
    }
}
