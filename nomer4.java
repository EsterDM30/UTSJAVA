
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.PrintWriter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author C-14
 */
public class nomer4 {
  
    public static void main(String[] args) throws Exception {
        // instansiasi class pembaca file
        PrintWriter fileout = new PrintWriter("data.txt");
        fileout.println("Nilai Array ke - 0:5, Nilai Array ke - 1:10, Nilai Array ke - 2:15,Nilai Array ke - 3:20,Nilai Array ke - 4:25,Nilai Array ke - 5:30,"
                + "Nilai Array ke - 6:35,Nilai Array ke - 7:40,Nilai Array ke - 8:45,Nilai Array ke - 9:50");
        fileout.println("nama teman ke-1:Angel,nama teman ke-2:Maulana,nama teman ke-3:Ailsa,nama teman ke-4:Ridho,nama teman ke-5:Farhan");
        fileout.println("Nama: Ester Debora Manawan, NIM: 22201144, Alamat: malang, Umur: 19, Tinggi Badan: 170.0 cm" );
        fileout.close();
    }
                
    }
        
                
       

