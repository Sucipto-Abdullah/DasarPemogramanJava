package Mahasiswa;


public class Mahasiswa{
    
    private int jumlah = 0;

    private String nama;
    private String nim;
    private int angkatan;

    public Mahasiswa(String nama, String nim, int angkatan){
        this.nama = nama;
        this.nim = nim;
        this.angkatan = angkatan;
        jumlah += 1;
    }

    public String getNama(){
        return this.nama;
    }
    
    public String getNIM(){
        return this.nim;
    }

    public int getAngkatan(){
        return this.angkatan;
    }

}