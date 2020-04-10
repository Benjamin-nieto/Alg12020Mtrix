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
        System.out.println("" + m.length);
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
        for (int i = 0; i < m.length; i++) { // filas
            for (int j = 0; j < m[0].length; j++) { // columnas
                if (i != j || i == j) {
                    table.setValueAt(m[i][j], j, i);
                }

            }
        }

    }

}
