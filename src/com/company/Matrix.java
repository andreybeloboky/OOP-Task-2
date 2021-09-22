package com.company;

public class Matrix {

    int[][] matrixOne;
    int[][] matrixTwo;

    public Matrix(int[][] matrixOne, int[][] matrixTwo) {
        this.matrixOne = matrixOne;
        this.matrixTwo = matrixTwo;
    }

    /**
     * @return the sum of two matrices.
     */
    public int[][] calculatorMatrix() {
        for (int i = 0; i < matrixOne.length; i++) {
            for (int j = 0; j < matrixOne[0].length; j++) {
                matrixOne[i][j] += matrixTwo[i][j];
            }
        }
        return matrixOne;
    }

    /**
     * @param number - the number, whose need multiply on the matrix;
     * @return - the multiplication of two matrices.
     */
    public int[][] multiplication(int number) {
        for (int i = 0; i < matrixTwo.length; i++) {
            for (int j = 0; j < matrixTwo[0].length; j++) {
                matrixTwo[i][j] *= number;
            }
        }
        return matrixTwo;
    }

    /**
     * @param matrix output on the screen;
     */
    public void consoleOutput(int[][] matrix) {
        for (int[] matrixResult : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(" " + matrixResult[j] + " ");
            }
            System.out.println();
        }
    }
}

