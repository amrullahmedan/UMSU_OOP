/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan61;

/**
 *
 * @author Acer
 */
import javax.swing.JOptionPane;
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nilai1 = 0; int nilai2 = 0; 
        int nilai3 = 0; double nilaitotal = 0;
        nilai1 = Integer.parseInt(JOptionPane.showInputDialog("masukkan nilai ke 1 antara 0 and 100!"));
        nilai2 = Integer.parseInt(JOptionPane.showInputDialog("masukkan nilai ke 2 antara  0 and 100!"));
        nilai3 = Integer.parseInt(JOptionPane.showInputDialog("masukkan nilai ke 3 antara 0 and 100!"));
        nilaitotal = (nilai1+nilai2+nilai3)/3;
        if (nilaitotal >= 60){
        JOptionPane.showMessageDialog(null, "Nilai Kamu sangat bagus "    + nilaitotal);
        } else{JOptionPane.showMessageDialog(null, "Kamu harus rajin belajar dong " + nilaitotal);
        }
}
}