package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] firstMatrix = {{1, 2, 3}, {1, 3, 3}};
        int[][] secondMatrix = {{1, 1, 1}, {1, 1, 1}};
        Matrix matrixOne = new Matrix(firstMatrix);
        Matrix matrixTwo = new Matrix(secondMatrix);
        System.out.println("Enter operation");
        System.out.println("1 - addition matrix, 2 - myltiply on number, 3 - find max number, 4 - find min number");
        System.out.println("5 - comparison on equal between two matrices, 6 - degree matrix");
        System.out.println("7 - transpose matrix, 8 - multiply matrices, another number - leave from program");
        int index = scanner.nextInt();
        switch (index) {
            case 1: {
                matrixOne.add(matrixTwo);
                int[][] result = matrixOne.toArray();
                for (int i = 0; i < result.length; i++) {
                    for (int j = 0; j < result[0].length; j++) {
                        System.out.print(result[i][j] + " ");
                    }
                    System.out.println();
                }
                break;
            }
            case 2: {
                int number = 2;
                matrixOne.myltiplyOnNumber(number);
                int[][] result = matrixOne.toArray();
                for (int i = 0; i < result.length; i++) {
                    for (int j = 0; j < result[0].length; j++) {
                        System.out.print(result[i][j] + " ");
                    }
                    System.out.println();
                }
                break;
            }
            case 3: {
                int max = matrixOne.findMaxNumber();
                System.out.println(max + " max");
                break;
            }
            case 4: {
                int min = matrixOne.findMinNumber();
                System.out.println(min + " min");
                break;
            }
            case 5: {
                boolean equel = matrixOne.isEqual(matrixTwo);
                System.out.println(equel);
                break;
            }
            case 6: {
                System.out.println("Enter degree");
                int degree = scanner.nextInt();
                matrixOne.erectToDegree(degree);
                int[][] matrixDegree = matrixOne.toArray();
                for (int i = 0; i < matrixDegree.length; i++) {
                    for (int j = 0; j < matrixDegree[0].length; j++) {
                        System.out.print(matrixDegree[i][j] + " ");
                    }
                    System.out.println();
                }
                break;
            }
            case 7: {
                matrixOne.transpose();
                int[][] matrixTranspose = matrixOne.toArray();
                for (int i = 0; i < matrixTranspose.length; i++) {
                    for (int j = 0; j < matrixTranspose[0].length; j++) {
                        System.out.print(matrixTranspose[i][j] + " ");
                    }
                    System.out.println();
                }
                break;
            }
            case 8: {
                matrixOne.multiply(matrixTwo);
                int[][] result = matrixOne.toArray();
                for (int i = 0; i < result.length; i++) {
                    for (int j = 0; j < result[0].length; j++) {
                        System.out.print(result[i][j] + " ");
                    }
                    System.out.println();
                }
                break;
            }
            default: {
                System.out.println("end");
                break;
            }
        }
    }
}

