package association.uniderectional;

import java.util.ArrayList;

import association.bidirectional.Pemainbola;
import java.util.HashMap;

public class Pelatih {
    
    public ArrayList<Pemainbola> daftarPemain;
    public HashMap<String, Pemainbola> Pemain = new HashMap<String, Pemainbola>();

    public String nama;
    public String strategi;

    public Pelatih( String nama, String stratei ){
        this.nama = nama;
        this.strategi = stratei;
    }

    public void getInstruction( String namaPemain ){
        try {
            System.out.println( this.Pemain.get(namaPemain).getName() );
        } catch (Exception e) {
            System.out.println("Pemain tidak ditemukan");
        }
    }

    public void addPemain( Pemainbola pemain ){
        daftarPemain.add(pemain);
        System.out.println("Pemain bernama " + pemain.getName() + " berhasil ditambahkan");
        Pemain.put( pemain.getName(), pemain);
    }

}
