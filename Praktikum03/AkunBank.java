public class AkunBank {
    
    public static int jumlahAkun = 0;
    private int saldo;

    public AkunBank(int saldo){
        this.saldo = saldo;
        jumlahAkun += 1;
    }

    public void setSaldo(int saldo){
        this.saldo = saldo;
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
