/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import javax.swing.JTable;

/**
 *
 * @author Bnieto
 */
public class Metodo {

    public static int[][] matrizAleatoria(int filas, int cols) {
        int[][] m = new int[filas][cols];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                int r = (int) ((Math.random() * 10) + 1);
                m[i][j] = r;
            }
        }

        return m;
    }

    public static void llenar(int[][] m, JTable table) {

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                if (m[i][j] != 0) {
                    table.setValueAt(m[i][j], i, j);

                }

            }
        }

    }

    public static void vaciarTble(int[][] m, JTable table) {

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                table.setValueAt("", i, j);
            }
        }

    }

    public static void diagPrincipal(int[][] m, JTable table) {
        for (int i = 0; i < m.length; i++) { // filas
            for (int j = 0; j < m[0].length; j++) { // columnas
                if (i == j) {
                    table.setValueAt(m[i][j], i, j);
                }

            }
        }
    }

    public static void diagSec(int[][] m, JTable table) {

        for (int i = 0; i < m.length; i++) { // filas
            for (int j = 0; j < m[0].length; j++) { // columnas
                if (i + j == m.length - 1) {
                    table.setValueAt(m[i][j], i, j);
                }

            }
        }
    }

    public static void triangularSup(int[][] m, JTable table) {

        for (int i = 0; i < m.length; i++) { // filas
            for (int j = 0; j < m[0].length; j++) { // columnas
                if (i == j || j > i) {
                    table.setValueAt(m[i][j], i, j);
                }

            }
        }
    }

    public static void triangularInf(int[][] m, JTable table) {

        for (int i = 0; i < m.length; i++) { // filas
            for (int j = 0; j < m[0].length; j++) { // columnas
                if (i == j || j < i) {
                    table.setValueAt(m[i][j], i, j);
                }

            }
        }
    }

    public static void transpuesta(int[][] m, JTable table) {
        for (int i = 0; i < m.length; i++) { // filas
            for (int j = 0; j < m[0].length; j++) { // columnas
                if (i != j || i == j) {
                    table.setValueAt(m[i][j], j, i);
                }

            }
        }

    }

    public static void letraA(int[][] m, JTable table) {
        int filas = m.length;
        for (int i = 0; i < m.length; i++) { // filas
            for (int j = 0; j < m[0].length; j++) { // columnas
                if (i == 0 || j == 0 || i == filas - 2 || j == m[0].length - 1) {
                    table.setValueAt(m[i][j], i, j);
                }

            }
        }

    }

    public static void letraZ(int[][] m, JTable table) {
        for (int i = 0; i < m.length; i++) { // filas
            for (int j = 0; j < m[0].length; j++) { // columnas
                if (i + j == m.length - 1 || i == 0 || i == m[0].length - 1) {
                    table.setValueAt(m[i][j], i, j);
                }

            }
        }

    }

    public static void letraT(int[][] m, JTable table) {
        int column = m[0].length;

        if (column % 2 == 0) { // si es par
            column = (int) (column / 2);
            column -= 1;
            for (int i = 0; i < m.length; i++) { // filas
                for (int j = 0; j < m[0].length; j++) { // columnas
                    if (i == 0 || j == column || j == column + 1) {
                        table.setValueAt(m[i][j], i, j);
                    }

                }
            }

        } else { // si es impar
            column = (int) (column / 2);
            for (int i = 0; i < m.length; i++) { // filas
                for (int j = 0; j < m[0].length; j++) { // columnas
                    if (i == 0 || j == column) {
                        table.setValueAt(m[i][j], i, j);
                    }

                }
            }
        }

    }

    public static void letraV(int[][] m, JTable table) {
        int uCols = m[0].length - 1; // ultima columna
        int uRow = m.length - 1; // ultima fila
        for (int i = 0; i < m.length; i++) { // filas
            for (int j = 0; j < m[0].length; j++) { // columnas
                if ((i == uRow && j == uCols) || (i == uRow && j == 0)) {
                    table.setValueAt("", i, j);
                } else if (j == 0 || j == uCols || i == uRow) {
                    table.setValueAt(m[i][j], i, j);
                }
            }
        }
    }

    public static void letraE(int[][] m, JTable table) {
        int row = m.length;
        int cols = m[0].length;
        if (row % 2 == 0) { // si es par
            row = (int) (row / 2);
            row -= 1;
            for (int i = 0; i < m.length; i++) { // filas
                for (int j = 0; j < m[0].length; j++) { // columnas
                    if (i == 0 || j == 0 || i == row + 1 || i == row || i == (m.length - 1)) {
                        table.setValueAt(m[i][j], i, j);
                    }

                }
            }

        } else { // si es impar
            row = (int) (row / 2);
            for (int i = 0; i < m.length; i++) { // filas
                for (int j = 0; j < m[0].length; j++) { // columnas
                    if (i == 0 || j == 0 || i == row || i == (m.length - 1)) {
                        table.setValueAt(m[i][j], i, j);
                    }

                }
            }
        }
    }

    public static void letraF(int[][] m, JTable table) {
        int row = m.length;
        int cols = m[0].length;
        if (row % 2 == 0) { // si es par
            row = (int) (row / 2);
            row -= 1;
            for (int i = 0; i < m.length; i++) { // filas
                for (int j = 0; j < m[0].length; j++) { // columnas
                    if (i == 0 || j == 0 || i == row + 1 || i == row) {
                        table.setValueAt(m[i][j], i, j);
                    }

                }
            }

        } else { // si es impar
            row = (int) (row / 2);
            for (int i = 0; i < m.length; i++) { // filas
                for (int j = 0; j < m[0].length; j++) { // columnas
                    if (i == 0 || j == 0 || i == row) {
                        table.setValueAt(m[i][j], i, j);
                    }

                }
            }
        }
    }

    public static void letraP(int[][] m, JTable table) {
        int row = m.length;
        int cols = m[0].length;

        row = (int) (row / 2);
        for (int i = 0; i < m.length; i++) { // filas
            for (int j = 0; j < m[0].length; j++) { // columnas
                if ((i == 0 || j == 0 || i == row) || (j == m[0].length - 1 && i <= row)) {
                    table.setValueAt(m[i][j], i, j);
                }
            }

        }

    }

    public static void letraI(int[][] m, JTable table) {
        int column = m[0].length;
        int row = m.length - 1;
        if (column % 2 == 0) { // si es par
            column = (int) (column / 2);
            column -= 1;
            for (int i = 0; i < m.length; i++) { // filas
                for (int j = 0; j < m[0].length; j++) { // columnas
                    if (i == 0 || i == row || j == column || j == column + 1) {
                        table.setValueAt(m[i][j], i, j);
                    }

                }
            }

        } else { // si es impar
            column = (int) (column / 2);
            for (int i = 0; i < m.length; i++) { // filas
                for (int j = 0; j < m[0].length; j++) { // columnas
                    if (i == 0 || j == column || i == row) {
                        table.setValueAt(m[i][j], i, j);
                    }

                }
            }
        }

    }

    public static void letraN(int[][] m, JTable table) {
        for (int i = 0; i < m.length; i++) { // filas
            for (int j = 0; j < m[0].length; j++) { // columnas
                if (i == j || j == 0 || j == m[0].length - 1) {
                    table.setValueAt(m[i][j], i, j);
                }

            }
        }

    }

    public static void letraY(int[][] m, JTable table) {
        int column = m[0].length;
        int row = m.length;
        if (column % 2 == 0) { // si es par
            column = (int) (column / 2);
            row = (int) (row / 2);
            column -= 1;

            for (int i = 0; i < m.length; i++) { // filas
                for (int j = 0; j < m[0].length; j++) { // columnas
                    // if ((j == column || j == column + 1) || (i == j && i <= row)) {
                    if ((j == column && i > column) || (j == column + 1 && i > column) || (i == j && i <= column) || (i + j == m.length - 1 && i <= column)) {
                        table.setValueAt(m[i][j], i, j);
                    }

                }
            }

        } else { // si es impar
            column = (int) (column / 2); // mitad columnas
            row = (int) (row / 2);
            for (int i = 0; i < m.length; i++) { // filas
                for (int j = 0; j < m[0].length; j++) { // columnas
                    if ((j == column && i > column) || (i == j && i <= column) || (i + j == m.length - 1 && i <= column)) {
                        table.setValueAt(m[i][j], i, j);
                    }

                }
            }
        }
    }

    public static void letraX(int[][] m, JTable table) {

        for (int i = 0; i < m.length; i++) { // filas
            for (int j = 0; j < m[0].length; j++) { // columnas
                if (i == j || i + j == m.length - 1) {
                    table.setValueAt(m[i][j], i, j);
                }

            }
        }

    }

    //----- quiz de matriz --------
    public static void ajedrez(int[][] m, JTable table) {
        for (int i = 0; i < m.length; i++) { // filas
            for (int j = 0; j < m[0].length; j++) { // columnas
                if ((i + j) % 2 == 0) {
                    table.setValueAt("", i, j);
                } else {
                    table.setValueAt(m[i][j], i, j);
                }

            }
        }
    }

    public static void letraM(int[][] m, JTable table) {
        int row = m.length;
        int column = m[0].length;

        if (column % 2 == 0) { // si es par
            column = (int) (column / 2);
            row = (int) (row / 2);
            column -= 1;

            for (int i = 0; i < m.length; i++) { // filas
                for (int j = 0; j < m[0].length; j++) { // columnas
                    if ((j == m[0].length - 1) || (j == 0) || (j == m[0].length + 1 && i > m[0].length - 1) || (i == j && i <= row) || (i + j == m.length - 1 && i <= row)) {
                        table.setValueAt(m[i][j], i, j);
                    }

                }
            }

        } else { // si es impar
            column = (int) (column / 2); // mitad columnas
            row = (int) (row / 2);
            for (int i = 0; i < m.length; i++) { // filas
                for (int j = 0; j < m[0].length; j++) { // columnas 
                    if ((j == m[0].length - 1) || (j == 0) || (i == j && i <= row - 1) || (i + j == m.length - 1 && i <= row)) {
                        table.setValueAt(m[i][j], i, j);
                    }

                }
            }
        }
    }

    public static void cuboH(int[][] m, JTable table) {
        int row = m.length;
        int cols = m[0].length;

        int midrow = (row / 2);
        for (int i = 0; i < m.length; i++) { // filas
            for (int j = 0; j < m[0].length; j++) { // columnas 
                if ((i + j == midrow) || (i - j == midrow) || (j - i == midrow) || (i + j == (midrow * 3))) {
                    table.setValueAt(m[i][j], i, j);

                }

            }
        }

    }

    public static void letraB(int[][] m, JTable table) {
        int row = m.length;
        int cols = m[0].length;
        System.out.println("" + cols);
        if (row % 2 == 0) { // si es par
            row = (int) (row / 2);
            row -= 1;
            for (int i = 0; i < m.length; i++) { // filas
                for (int j = 0; j < m[0].length; j++) { // columnas
                    if ((j == cols - 1) || (i == 0 && j != cols - 1) || (j == 0) || (i == row && j != cols - 1) || (i == row + 1 && j != cols - 1) || (i == m.length - 1 && j != cols - 1)) {
                        table.setValueAt(m[i][j], i, j);
                    }

                }
            }
            /**
             * ULTIMA COLUMNA*
             */
            for (int i = 0; i < m.length; i++) { // filas
                for (int j = 0; j < m[0].length; j++) { // columnas
                    if ((j == cols - 1 && i == 0) || (j == cols - 1 && i == row) || (j == cols - 1 && i == row + 1) || (j == cols - 1 && i == m.length - 1)) {
                        table.setValueAt("", i, j);
                    }

                }
            }

        } else { // si es impar
            row = (int) (row / 2);
            for (int i = 0; i < m.length; i++) { // filas
                for (int j = 0; j < m[0].length; j++) { // columnas
                    if ((j == cols - 1) || (i == 0 && j != cols - 1) || (j == 0) || (i == row && j != cols - 1) || (i == m.length - 1 && j != cols - 1)) {
                        table.setValueAt(m[i][j], i, j);
                    }

                }
            }
            /**
             * ULTIMA COLUMNA*
             */
            for (int i = 0; i < m.length; i++) { // filas
                for (int j = 0; j < m[0].length; j++) { // columnas
                    if ((j == cols - 1 && i == 0) || (j == cols - 1 && i == row) || (j == cols - 1 && i == m.length - 1)) {
                        table.setValueAt("", i, j);
                    }

                }
            }

        }
    }

}
