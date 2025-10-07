package association.bidirectional;

public class Pemainbola {
    String posisi;
    String nama;

    public Pemainbola(String nama, String posisi) {
        this.posisi = posisi;
        this.nama = nama;
    }

    public String getName(){
        return this.nama;
    }

}