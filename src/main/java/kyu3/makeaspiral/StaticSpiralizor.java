package kyu3.makeaspiral;

import java.util.Arrays;

public class StaticSpiralizor {

    public static int[][] spiralize(int size) {
        SpiralizorObject kata = new SpiralizorObject();
        return kata.spiralize(size);
    }
}

class SpiralizorObject {

    private int[][] result;
    private int[] currentCoordinate;
    private int size;

    public  int[][] spiralize(int size) {
        this.result = getStartingArray(size);
        this.size = size;
        this.currentCoordinate = new int[]{0, 0};

        int[] lastCoordinates = new int[]{};
        while(!Arrays.equals(lastCoordinates, currentCoordinate)) {
            lastCoordinates = currentCoordinate;
            moveRight(currentCoordinate[0], currentCoordinate[1]);
            moveDown(currentCoordinate[0], currentCoordinate[1]);
            moveLeft(currentCoordinate[0], currentCoordinate[1]);
            moveUp(currentCoordinate[0], currentCoordinate[1]);
        }

        System.out.println(Arrays.deepToString(this.result));
        return this.result;
    }

    int[][] getStartingArray(int size) {
        int[][] result = new int[size][size];
        Arrays.stream(result).forEach(arr -> Arrays.fill(arr, 0));
        this.result = result;
        return result;
    }

    void moveRight(int rowIndex, int columnStart) {
        for (int i = columnStart; i < size; i++) {
            if (i == size -1) {
                this.result[rowIndex][i] = 1;
                this.currentCoordinate = new int[]{rowIndex, i};
                break;
            }
            if (this.result[rowIndex][i+1] == 0 && this.result[rowIndex+1][i+1] == 0) {
                this.result[rowIndex][i] = 1;
                this.currentCoordinate = new int[]{rowIndex, i};
            } else break;
        }
    }

    void moveDown(int rowStart, int columnIndex) {
        for (int i = rowStart; i < size; i++) {
            if (i == size -1){
                this.result[i][columnIndex] = 1;
                this.currentCoordinate = new int[]{i, columnIndex};
                break;
            }
            if (this.result[i+1][columnIndex] == 0 && this.result[i+1][columnIndex -1] == 0) {
                this.result[i][columnIndex] = 1;
                this.currentCoordinate = new int[]{i, columnIndex};
            } else break;
        }
    }

    void moveLeft(int rowIndex, int columnStart) {
        for (int i = columnStart; i > -1; i--) {
            if (i == 0) {
                this.result[rowIndex][i] = 1;
                this.currentCoordinate = new int[]{rowIndex, i};
                break;
            }
            if (this.result[rowIndex][i-1] == 0 && this.result[rowIndex -1][i-1] == 0) {
                this.result[rowIndex][i] = 1;
                this.currentCoordinate = new int[]{rowIndex, i};
            } else break;

        }
    }

    void moveUp(int rowStart, int columnIndex) {
        for (int i = rowStart; i > -1; i--) {
            if (i == 0){
                this.result[i][columnIndex] = 1;
                this.currentCoordinate = new int[]{i, columnIndex};
                break;
            }
            if (this.result[i-1][columnIndex] == 0) {
                this.result[i][columnIndex] = 1;
                this.currentCoordinate = new int[]{i, columnIndex};
            } else break;
        }
    }
}
