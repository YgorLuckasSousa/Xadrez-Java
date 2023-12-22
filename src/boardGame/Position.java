package boardGame;

public class Position {
    private int row;
    private int column;

    Position(){

    }

    public Position(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public void setColumn(int column) {
        this.column = column;
    }
    @Override
    public String toString(){
        return row + ", " + column;
    }
}
