public class DoubleCell extends Cell{
    private double value;

    public void setValue(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    @Override
    public String getStringValue() {
        return Double.toString(getValue());
    }

    @Override
    public void reset() {
        value = 0;
    }
}
