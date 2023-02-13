import java.util.Date;

public class Testing {
    public void testIntToString() {
        IntCell c = new IntCell();
        c.setValue(50);
        if (c.getStringValue().equals("50")) {
            System.out.println("Pass testToInt");
        } else {
            System.out.println("Failed testToInt");
        }
    }

    public void testDoubleToString() {
        DoubleCell c = new DoubleCell();
        c.setValue(50.24);
        if (c.getStringValue().equals("50.24")) {
            System.out.println("Pass testToDoubleMinus");
        } else {
            System.out.println("Failed testToDoubleMinus");
        }
    }

    public void testDateToString() {
        DateCell d = new DateCell();
        Date date = new Date();
        d.setValue(date);
        System.out.println(d.getStringValue());
    }
}
