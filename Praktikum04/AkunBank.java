public class AkunBank {
    
    public static int jumlahAkun = 0;
    public String pemilik;
    private int saldo;
    private String pin;

    public AkunBank( String pemilik,int saldo, String pin){
        if (pin.length() != 6){
            throw new ArithmeticException("Pin harus 6 digit"); 
        } else{
            this.pemilik = pemilik;
            this.saldo = saldo;
            this.pin = pin;
            jumlahAkun += 1;
        }
    }

    public void setSaldo(int saldo){
        this.saldo = saldo;
    }

    public boolean inputPin ( String pin ){
        if(pin.length() != 6 || pin != this.pin){
            return false;
        }
        else{
            return true;
        }
    }

    public int getSaldo(){
        return this.saldo;
    }

    public int tabung( int saldo ){
        this.saldo += saldo;
        return saldo;
    }

    public void tarikTunai(int saldo){
        if (this.saldo - saldo > 50000){
            this.saldo -= saldo;
        }
        else{
            System.out.println("Saldo harus menyisahkan minimal Rp50.000");
        }
    }

}
