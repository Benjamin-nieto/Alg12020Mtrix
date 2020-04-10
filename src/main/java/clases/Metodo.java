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
    


    public static int[][] matriz_aleatoria(int filas, int cols) {
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
                if (m[i][j]!=0) {
                    table.setValueAt(m[i][j], i, j);
      
                }
                
            }
        }

    }
    
    public static int[][] diag_principal(int[][] m){
        // recibe matriz y saca la diagonal para devolverla
        int[][] nw= new int[m.length][m[0].length];
        for (int i = 0; i < m.length; i++) { // filas
            for (int j = 0; j < m[0].length; j++) { // columnas
                if (m[i]==m[j]) {
                    nw[i][j]=m[i][j];
                }
                
            }
        }
        return nw;
    }
   
    public static int[][] diag_sec(int[][] m){
        // recibe matriz y saca la diagonal para devolverla
        int[][] nw= new int[m.length][m[0].length];
        
        for (int i = 0; i < m.length; i++) { // filas
            for (int j = 0; j < m[0].length; j++) { // columnas
               // if (m[j]==aux) {
                    nw[i][j]=m[i][j];
                //}
                
            }
        }
        return nw;
    }

}
