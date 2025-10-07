public class Penyerang {

    String nama;

    Penyerang(String nama) {
        this.nama = nama;
    }

    void menendang(Bola bola) {
        System.out.println(this.nama + " menendang bola bermerek " + bola.getMerek());
    }
};