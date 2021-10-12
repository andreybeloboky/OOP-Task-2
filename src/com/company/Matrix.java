package com.company;

public class Matrix {

    private int[][] array;

    /**
     * @param array - the first matrix user;
     */
    public Matrix(int[][] array) {
        this.array = array;
    }

    /**
     * @param matrix - matrix which need addition with the first matrix (array).
     */
    public void add(Matrix matrix) {
        int[][] ints = matrix.toArray();
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[i].length; j++) {
                array[i][j] += ints[i][j];
            }
        }
    }

    /**
     * @param matrix - the matrix which need multiply with the first matrix (array).
     */
    public void multiply(Matrix matrix) {
        int[][] ints = matrix.toArray();
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[i].length; j++) {
                array[i][j] *= ints[i][j];
            }
        }
    }

    /**
     * @param number - the number which multiply on each index in the array.
     */
    public void myltiplyOnNumber(int number) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] *= number;
            }
        }
    }

    public int findMaxNumber() {
        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        return max;
    }

    public int findMinNumber() {
        int min = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < min) {
                    min = array[i][j];
                }
            }
        }
        return min;
    }

    /**
     * @param matrix - the matrix, which comparison the two matrix on the equal.
     * @return true - the matrices equal, false - the matrices not equal.
     */
    public boolean isEqual(Matrix matrix) {
        int[][] ints = matrix.toArray();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] != ints[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public void transpose() {
        int[][] ints = new int[array[0].length][array.length];
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[i].length; j++) {
                ints[i][j] = array[j][i];
            }
        }
        this.array = ints;
    }

    /**
     * @param degree - the degree which multiply whole the array.
     */
    public void erectToDegree(int degree) {
        int[][] ints = new int[array.length][array[0].length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                ints[i][j] = array[i][j];
            }
        }
        for (int time = 1; time < degree; time++) {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    array[i][j] *= ints[i][j];
                }
            }
        }
    }

    public int[][] toArray() {
        return array;
    }
}

