public class IntCell extends Cell{
    private int value;

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String getStringValue() {
         return Integer.toString(getValue());
    }

    @Override
    public void reset() {
        value = 0;
    }
}
