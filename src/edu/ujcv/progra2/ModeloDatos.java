package edu.ujcv.progra2;

public class ModeloDatos {
    private int col1;
    private int col2;
    private int col3;
    private int col4;

    public ModeloDatos(String[] columnas) {
        col1 = Integer.parseInt(columnas[0]);
        col2 = Integer.parseInt(columnas[1]);
        col3 = Integer.parseInt(columnas[2]);
        col4 = Integer.parseInt(columnas[3]);

    }

    public int getCol1() {
        return col1;
    }

    public void setCol1(int col1) {
        this.col1 = col1;
    }

    public int getCol2() {
        return col2;
    }

    public void setCol2(int col2) {
        this.col2 = col2;
    }

    public int getCol3() {
        return col3;
    }

    public void setCol3(int col3) {
        this.col3 = col3;
    }

    public int getCol4() {
        return col4;
    }

    public void setCol4(int col4) {
        this.col4 = col4;
    }

    public int[] add(ModeloDatos modelo2) {
        int[] retval = new int[4];

        retval[0] = col1+ modelo2.col1;
        retval[1] = col2+ modelo2.col2;
        retval[2] = col3+ modelo2.col3;
        retval[3] = col4+ modelo2.col4;
        return retval;
    }
}
