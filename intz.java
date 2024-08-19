import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Currency;
import java.util.Date;
import java.util.Locale;

public class intz {
    public static void main(String[] args) {
        Locale locale = Locale.JAPAN;
        String lan = locale.getDisplayLanguage();
        System.out.println("Language:" + lan);
        String cc = locale.getDisplayCountry();
        System.out.println("Country code:" + cc);
        Currency cc1 = Currency.getInstance(locale);
        System.out.println("Currency:" + cc1);
        String cs = cc1.getSymbol();
        System.out.println("Currency Symbol:" + cs);
        DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT, locale);
        String df1 = df.format(new Date());
        System.out.println("Date Format:" + df1);
        DateFormat tf = DateFormat.getTimeInstance(DateFormat.SHORT, locale);
        String tf1 = tf.format(new Date());
        System.out.println("Time Format:" + tf1);
        NumberFormat nf=NumberFormat.getNumberInstance(locale);
        String nf1=nf.format(1284986789);
        System.out.println("Number Format:"+nf1);
    }
}
