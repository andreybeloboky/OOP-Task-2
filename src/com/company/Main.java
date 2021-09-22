package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of columns");
        int numberOfColumns = scanner.nextInt();
        System.out.println("Enter number of line");
        int numberOfLine = scanner.nextInt();
        System.out.println("Matrix one");
        int[][] matrixOne = matrix(numberOfLine, numberOfColumns);
        System.out.println("Matrix two");
        int[][] matrixTwo = matrix(numberOfLine, numberOfColumns);
        Matrix matrix = new Matrix(matrixOne, matrixTwo);
        System.out.println("Choose function 1 - summa matrixs, 2 - multiplication of number");
        int function = scanner.nextInt();
        switch (function) {
            case 1 -> {
                int[][] matrixResult = matrix.calculatorMatrix();
                matrix.consoleOutput(matrixResult);
            }
            case 2 -> {
                int number = scanner.nextInt();
                int[][] matrixMultiplication = matrix.multiplication(number);
                matrix.consoleOutput(matrixMultiplication);
            }
        }
    }

    /**
     * @param numberOfLine    - number Of Line in matrix;
     * @param numberOfColumns - number Of Columns in matrix;
     * @return - filled matrix with numbers;
     */
    public static int[][] matrix(int numberOfLine, int numberOfColumns) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[numberOfLine][numberOfColumns];
        for (int i = 0; i < numberOfLine; i++) {
            for (int j = 0; j < numberOfColumns; j++) {
                System.out.println("Enter number");
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }
}