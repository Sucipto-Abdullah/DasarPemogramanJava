// package praktikum05;

class Hewan {

    private int usia;
    private String nama;

    public Hewan(){
        this.nama = "Unamed";
        this.usia = 0;
    }
    
    public Hewan( String nama, int usia){
        this.nama = nama;
        this.usia = usia;
    }
 
    public Hewan( int usia, String nama){
        this.nama = nama;
        this.usia = usia;
    }

    public Hewan( String nama){
        this.nama = nama;
        this.usia = 0;
    }

    public Hewan( int usia){
        this.nama = "Unamed";
        this.usia = usia;
    }

    public String getNama(){
        return this.nama;
    }
    
    public int getumur(){
        return this.usia;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setUsia( int usia ){
        this.usia = usia;
    }

    public void berkomunikasi(){
        System.out.println("Hewan berusia " + this.usia + " tahun bernama " + this.nama + " berkomunikasi.");
    }
    
}

public class Kucing extends Hewan{

    public enum RasKucing{
        PERSIA,
        ANGGORA,
        SIAM,
        MAINE_COON
    }

    RasKucing rasKucing;

    public Kucing(){
        this.rasKucing = RasKucing.ANGGORA;
        this.setNama("Unamed");
        this.setUsia(0);
    }

    public void berkomunikasi(){
        System.out.println("Kucing " + this.rasKucing + " bernama " + this.getNama() + " mengeong");
    }

}