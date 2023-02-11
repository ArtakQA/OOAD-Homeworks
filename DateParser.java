import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DateParser {
    public Date parsDate (String str, String Format) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(Format);
        simpleDateFormat.setLenient(false); // strict parsing
        return simpleDateFormat.parse(str);
    }
}
