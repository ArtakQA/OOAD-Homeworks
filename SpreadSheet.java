import java.util.Date;

public class SpreadSheet {
    private Cell[][] NewSheet;

    public SpreadSheet(int r, int c) {
        NewSheet = new Cell[r][c];
    }

    public void setNewSheet(int r, int c, String value) {
        if (r >= 0 && c >= 0) {
            if (r < NewSheet.length && c < NewSheet[0].length) {
                if (NewSheet[r][c] != null) {
                    NewSheet[r][c].reset();
                }
                StringCell cl = new StringCell();
                cl.setValue(value);
                NewSheet[r][c] = cl;
            } else {
                throw new IllegalArgumentException("Row or Column index is out of range");
            }
        } else {
            throw new IllegalArgumentException("Invalid row or column index, must be non-negative");
        }
    }

    public void setNewSheet(int r, int c, int value) {
        if (r >= 0 && c >= 0) {
            if (r < NewSheet.length && c < NewSheet[0].length) {
                if (NewSheet[r][c] != null) {
                    NewSheet[r][c].reset();
                }
                IntCell cl = new IntCell();
                cl.setValue(value);
                NewSheet[r][c] = cl;
            } else {
                throw new IllegalArgumentException("Row or Column index is out of range");
            }
        } else {
            throw new IllegalArgumentException("Invalid row or column index, must be non-negative");
        }
    }

    public void setNewSheet(int r, int c, double value) {
        if (r >= 0 && c >= 0) {
            if (r < NewSheet.length && c < NewSheet[0].length) {
                if (NewSheet[r][c] != null) {
                    NewSheet[r][c].reset();
                }
                DoubleCell cl = new DoubleCell();
                cl.setValue(value);
                NewSheet[r][c] = cl;
            } else {
                throw new IllegalArgumentException("Row or Column index is out of range");
            }
        } else {
            throw new IllegalArgumentException("Invalid row or column index, must be non-negative");
        }
    }

    public void setNewSheet(int r, int c, Date value) {
        if (r >= 0 && c >= 0) {
            if (r < NewSheet.length && c < NewSheet[0].length) {
                if (NewSheet[r][c] != null) {
                    NewSheet[r][c].reset();
                }
                DateCell cl = new DateCell();
                cl.setValue(value);
                NewSheet[r][c] = cl;
            } else {
                throw new IllegalArgumentException("Row or Column index is out of range");
            }
        } else {
            throw new IllegalArgumentException("Invalid row or column index, must be non-negative");
        }
    }

    public void getNewSheet() {
        for (Cell[] cells : NewSheet) {
            for (int j = 0; j < NewSheet[0].length; j++) {
                try {
                    System.out.print(cells[j].getStringValue() + " ");
                } catch (NullPointerException e) {
                    System.out.print("null" + " ");
                }
            }
            System.out.println();
        }
    }


    public void addRow(int r) {
        if (r < 0 || r > NewSheet.length) {
            throw new IllegalArgumentException("Invalid row index");
        } else {
            int newRows = NewSheet.length + 1;
            Cell[][] newArray = new Cell[newRows][NewSheet[0].length];
            for (int i = 0; i < NewSheet.length; i++) {
                for (int j = 0; j < NewSheet[0].length; j++) {
                    if (i < r) {
                        newArray[i][j] = NewSheet[i][j];
                    } else {
                        newArray[i + 1][j] = NewSheet[i][j];
                    }
                }
            }
            NewSheet = newArray;
        }
    }

    public void removeRow(int r) {
        if (r < 0 || r >= NewSheet.length) {
            throw new IllegalArgumentException("Invalid row index");
        } else {
            int newRows = NewSheet.length - 1;
            Cell[][] newArray = new Cell[newRows][NewSheet[0].length];
            for (int i = 0; i < NewSheet.length; i++) {
                for (int j = 0; j < NewSheet[0].length; j++) {
                    if (i < r) {
                        newArray[i][j] = NewSheet[i][j];
                    } else if (i > r) {
                        newArray[i - 1][j] = NewSheet[i][j];
                    }
                }
            }
            NewSheet = newArray;
        }
    }

    public void addColumn(int c) {
        if (c < 0 || c > NewSheet[0].length) {
            throw new IllegalArgumentException("Invalid column index");
        } else {
            int newColumns = NewSheet[0].length + 1;
            Cell[][] newArray = new Cell[NewSheet.length][newColumns];
            for (int i = 0; i < NewSheet.length; i++) {
                for (int j = 0; j < NewSheet[0].length; j++) {
                    if (j < c) {
                        newArray[i][j] = NewSheet[i][j];
                    } else {
                        newArray[i][j + 1] = NewSheet[i][j];
                    }
                }
            }
            NewSheet = newArray;
        }
    }

    public void removeColumn(int c) {
        if (c < 0 || c >= NewSheet[0].length) {
            throw new IllegalArgumentException("Invalid row index");
        } else {
            int newColumns = NewSheet[0].length - 1;
            Cell[][] newArray = new Cell[NewSheet.length][newColumns];
            for (int i = 0; i < NewSheet.length; i++) {
                for (int j = 0; j < NewSheet[0].length; j++) {
                    if (j < c) {
                        newArray[i][j] = NewSheet[i][j];
                    } else if (j > c) {
                        newArray[i][j - 1] = NewSheet[i][j];
                    }
                }
            }
            NewSheet = newArray;
        }
    }

    public void swapRows(int r1, int r2) {
        if (r1 >= 0 && r1 < NewSheet.length && r2 >= 0 && r2 < NewSheet.length) {
            Cell[] temp = NewSheet[r1];
            NewSheet[r1] = NewSheet[r2];
            NewSheet[r2] = temp;
        } else {
            throw new IllegalArgumentException("Invalid row index, must be within the range of the spreadsheets");
        }
    }

    public void swapColumns(int c1, int c2) {
        if (c1 >= 0 && c1 < NewSheet[0].length && c2 >= 0 && c2 < NewSheet[0].length) {
            for (int i = 0; i < NewSheet.length; i++) {
                Cell temp = NewSheet[i][c1];
                NewSheet[i][c1] = NewSheet[i][c2];
                NewSheet[i][c2] = temp;
            }
        } else {
            throw new IllegalArgumentException("Invalid column index, must be within the range of the spreadsheets");
        }
    }
}
