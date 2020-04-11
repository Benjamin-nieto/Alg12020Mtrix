/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import javax.swing.JTable;

/**
 *
 * @author erichaag
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
                    System.out.println("" + i + " = " + row);
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

}
