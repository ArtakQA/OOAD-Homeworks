import java.text.SimpleDateFormat;
import java.util.Date;

public class DateCell extends Cell{
    private Date value;

    public void setValue(Date value) {
        this.value = value;
    }

    public Date getValue() {
        return value;
    }

    @Override
    public String getStringValue() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return simpleDateFormat.format(value);
    }

    @Override
    public void reset() {
        value = null;
    }
}
