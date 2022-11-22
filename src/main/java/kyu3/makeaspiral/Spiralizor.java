package kyu3.makeaspiral;

import java.util.Arrays;

public class Spiralizor {

    private int[][] result;
    private int[] currentCoordinate;
    private int size;

    public  int[][] spiralize(int size) {
        this.result = getStartingArray(size);
        this.size = size;
        this.currentCoordinate = new int[]{0, 0};
//        Arrays.fill(result[0], 1);
        moveRight(0, 0);
//        Arrays.stream(result).forEach(arr -> arr[size-1] = 1);
        moveDown(currentCoordinate[0], currentCoordinate[1]);
//        Arrays.fill(result[size-1], 1);
        moveLeft(currentCoordinate[0], currentCoordinate[1]);

//        int[] coordinates = new int[2];
//        for (int i = size-1; result[i-1][0] == 0; i--) {
//            result[i][0] = 1;
//            coordinates = new int[]{i, 0};
//        }
        moveUp(currentCoordinate[0], currentCoordinate[1]);

//        for (int i = coordinates[1]; result[coordinates[0]][i+1] == 0; i++) {
//            result[coordinates[0]][i] = 1;
//        }
        System.out.println("last move rigth start at " + Arrays.toString(currentCoordinate));
        moveRight(currentCoordinate[0], currentCoordinate[1]);

        System.out.println(Arrays.deepToString(this.result));

//        System.out.println(Arrays.deepToString(result));
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
                System.out.println(Arrays.toString(currentCoordinate));
                break;
            }
            if (this.result[rowIndex][i+1] == 0) {
                this.result[rowIndex][i] = 1;
                this.currentCoordinate = new int[]{rowIndex, i};
                System.out.println(Arrays.toString(currentCoordinate));
            }

        }
    }

    void moveDown(int rowStart, int columnIndex) {
        for (int i = rowStart; i < size; i++) {
            if (i == size -1){
                this.result[i][columnIndex] = 1;
                this.currentCoordinate = new int[]{i, columnIndex};
                System.out.println(Arrays.toString(currentCoordinate));
                break;
            }
            if (this.result[i+1][columnIndex] == 0) {
                this.result[i][columnIndex] = 1;
                this.currentCoordinate = new int[]{i, columnIndex};
                System.out.println(Arrays.toString(currentCoordinate));
            }
        }
    }

    void moveLeft(int rowIndex, int columnStart) {
        for (int i = columnStart; i > -1; i--) {
            if (i == 0) {
                this.result[rowIndex][i] = 1;
                this.currentCoordinate = new int[]{rowIndex, i};
                System.out.println(Arrays.toString(currentCoordinate));
                break;
            }
            if (this.result[rowIndex][i-1] == 0) {
                this.result[rowIndex][i] = 1;
                this.currentCoordinate = new int[]{rowIndex, i};
                System.out.println(Arrays.toString(currentCoordinate));
            }

        }
    }

    void moveUp(int rowStart, int columnIndex) {
        for (int i = rowStart; i > -1; i--) {
            if (i == 0){
                this.result[i][columnIndex] = 1;

//                System.out.println("moveUp before final assignment Coordinates " + Arrays.toString(currentCoordinate));
//                System.out.println("i: " + i + ", columnIndex: " + columnIndex);
                this.currentCoordinate = new int[]{i, columnIndex};
//                System.out.println("moveUp Final Coordinates " + Arrays.toString(currentCoordinate));
                System.out.println(Arrays.toString(currentCoordinate));
                break;
            }
            if (this.result[i-1][columnIndex] == 0) {
                this.result[i][columnIndex] = 1;
                this.currentCoordinate = new int[]{i, columnIndex};
                System.out.println(Arrays.toString(currentCoordinate));
            } else break;
        }
    }





}
