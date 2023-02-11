import java.text.ParseException;
import java.util.Date;

enum Color {
    red, blue, green, black, white, yellow, violet
}
public class Cell {
   private Color color;
   private String value;

    public void setColor(Color color) {
        this.color = color;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public Color getColor() {
        return color;
    }
    public int toInt(){
        try {
            //pars String to int
            int num = Integer.parseInt(value);
            System.out.println("The number is: " + num);
            return num;
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format: " + value);
            return -1;
        }
    }
    public double toDouble(){
        try {
            //pars String to Double
            double num = Double.parseDouble(value);
            System.out.println("The number is: " + num);
            return num;
        }   catch (NumberFormatException e) {
            System.out.println("Invalid number format: " + value);
            return -1;
        }
    }
    public void toDate(){
        //pars String to Date;
        DateParser date = new DateParser();
        try {
          Date parsDate = date.parsDate(value, "yyyy-MM-dd");
            System.out.println("Date is " + parsDate);
        } catch (ParseException e) {
            System.out.println("Invalid date format: " + e.getMessage());
        }
    }
    public void reset(){
        value = null;
    }
}
