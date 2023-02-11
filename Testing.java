public class Testing {
    public void testToInt (){
        Cell c = new Cell();
        c.setValue("50");
        if (c.toInt() == 50)  {
            System.out.println("Pass testToInt");
        }
        else {
            System.out.println("Failed testToInt");
        }
    }
    public void testToIntZero (){
        Cell c = new Cell();
        c.setValue("0");
        if (c.toInt() == 0)  {
            System.out.println("Pass testToIntZero");
        }
        else {
            System.out.println("Failed testToIntZero");
        }
    }
    public void testToIntMinus (){
        Cell c = new Cell();
        c.setValue("-50");
        if (c.toInt() == -50)  {
            System.out.println("Pass testToIntMinus");
        }
        else {
            System.out.println("Failed testToIntMinus");
        }
    }
    public void testToDoubleMinus (){
        Cell c = new Cell();
        c.setValue("-50.24");
        if (c.toDouble() == -50.24)  {
            System.out.println("Pass testToDoubleMinus");
        }
        else {
            System.out.println("Failed testToDoubleMinus");
        }
    }
    public void testDoubleInt () {
        Cell c = new Cell();
        c.setValue("50");
        if (c.toDouble() == 50.0) {
            System.out.println("Pass testDoubleInt");
        } else {
            System.out.println("Failed testDoubleInt");
        }
    }
    public void testDouble () {
        Cell c = new Cell();
        c.setValue("50.24");
        if (c.toDouble() == 50.24) {
            System.out.println("Pass testDouble");
        } else {
            System.out.println("Failed testDouble");
        }
    }
    public void testSetValue () {
        Cell c = new Cell();
        c.setValue("Test");
        if (c.getValue().equals("Test") ) {
            System.out.println("Pass testSetValue");
        } else {
            System.out.println("Failed testSetValue");
        }
    }
    public void negativeTestInt (){
        Cell c = new Cell();
        c.setValue("test");
        try {
            c.toInt();
        }
        catch (NumberFormatException e) {
            System.out.println("Pass negativeTestInt");
        }
    }

    public void testReset () {
        Cell c = new Cell();
        c.setValue("50.24");
        c.reset();
        if (c.getValue() == null) {
            System.out.println("Pass testReset");
        } else {
            System.out.println("Failed testReset");
        }
    }

}
