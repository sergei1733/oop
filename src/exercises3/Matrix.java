package exercises3;

public class Matrix {
    private int row;
    private int column;
    private int[][] realNumbers;

    public Matrix(int row, int column){
        this.realNumbers= new int[row][column];
    }

    public void zapolnenieMass(){
        for (int i = 0; i <this.realNumbers.length ; i++) {
            for (int j = 0; j <this.realNumbers[i].length ; j++) {
                this.realNumbers[i][j] = 15;
            }
        }
    }

    public void printRealNumbers(){
        for (int i = 0; i <this.realNumbers.length ; i++) {
            for (int j = 0; j <this.realNumbers[i].length ; j++) {
                System.out.print(this.realNumbers[i][j]+" ");
            }
            System.out.println();
        }
    }
    public void multiplicationByNumber(int number){
        for (int i = 0; i <this.realNumbers.length ; i++) {
            for (int j = 0; j <this.realNumbers[i].length ; j++) {
                this.realNumbers[i][j]*=number;
            }
        }
    }
    public void matrixAddition(int matrix[][]){
        for (int i = 0; i <this.realNumbers.length ; i++) {
            for (int j = 0; j <this.realNumbers[i].length ; j++) {
                this.realNumbers[i][j]+=matrix[i][j];
            }
        }
    }
}
