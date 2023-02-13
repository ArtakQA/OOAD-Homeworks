public class Controller {
    public static void main(String[] args) {

        SpreadSheet sp = new SpreadSheet(5, 4);
        sp.setNewSheet(0,0, "test5");
        sp.setNewSheet(0,1,1);
        sp.setNewSheet(0,2,1.2);
        sp.setNewSheet(0,3,3);
        sp.setNewSheet(1,0,"test4");
        sp.setNewSheet(1,1,"2022-02-03");
        sp.setNewSheet(1,2,"2022-02-03");
        sp.setNewSheet(1,3,1);
        sp.setNewSheet(2,0,"test3");
        sp.setNewSheet(2,1,"1");
        sp.setNewSheet(2,2,"2");
        sp.setNewSheet(2,3,"3");
        sp.setNewSheet(3,0,"test2");
        sp.setNewSheet(3,1,"1");
        sp.setNewSheet(3,2,"2");
        sp.setNewSheet(3,3,"3");
        sp.setNewSheet(4,0,"test1");
        sp.setNewSheet(4,1,"1");
        sp.setNewSheet(4,2,"2");
        sp.setNewSheet(4,3,"3");
        sp.swapRows(1, 3);
        sp.swapColumns(1, 3);
        sp.addColumn(1);
        sp.addRow(2);
        sp.removeColumn(4);
        sp.getNewSheet();
    }
}
