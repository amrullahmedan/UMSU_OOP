/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan62;

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
        String msg = "";
        int input = 0;
        
        //mengambil nilai string
        input = Integer.parseInt(JOptionPane.showInputDialog ("masukkan nilai antara 1 to 10"));
        
        // bentuk variable string dengan fungsi if, else dan else if
        if(input == 1) msg = "angka satu ya"; else if(input == 2) msg = "angka dua ya";
        else if(input == 3) msg = "three"; else if(input == 4) msg = "four";
        else if(input == 5) msg = "five"; else if(input == 6) msg = "six";
        else if(input == 7) msg = "seven"; else if(input == 8) msg = "eight";
        else if(input == 9) msg = "nine"; else if(input == 10) msg = "ten";
        else msg = "kan disuruh masukkan nilai 1 sampai 10";
        
        //tampilkan nilai yang di masukkan ke sistem
        JOptionPane.showMessageDialog(null,msg);
        
             
    }
    
}
