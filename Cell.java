import java.text.ParseException;
import java.util.Date;

enum Color {
    red, blue, green, black, white, yellow, violet
}
public abstract class Cell {
   private Color color;

    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
    public abstract String getStringValue ();

    public abstract void reset();
}
