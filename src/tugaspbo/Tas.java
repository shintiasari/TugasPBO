/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspbo;

/**
 *
 * @author LENOVO
 */
public class Tas {
    
    String merk;
    String made;
    String jenis;
    String aksesoris;
    String harga;
    
    void cetakinfo(){
        System.out.println("Merk tas           : "+merk);
        System.out.println("Asal Pembuatan tas : "+made);
        System.out.println("jenis tas          : "+jenis);
        System.out.println("Aksesoris tas      : "+aksesoris);
        System.out.println("Harga tas          : "+harga);
        System.out.println("==============================");
        
    }
}
