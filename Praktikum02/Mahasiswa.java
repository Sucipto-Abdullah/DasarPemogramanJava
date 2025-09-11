enum Jurusan{ keperawatan, mesin, informatika, RPL, SIKC}

public class Mahasiswa{

    public String nama;
    public String nim;

    public int angkatan;
    public double nilai;
    private Jurusan jurusan;

    public Mahasiswa(String nama, String nim, int angkatan, Jurusan jurusan){
        this.nama = nama;
        this.nim = nim;
        this.angkatan = angkatan;
        this.jurusan = jurusan;
    }

    public Jurusan getJurusan(){
        return this.jurusan;
    }

}