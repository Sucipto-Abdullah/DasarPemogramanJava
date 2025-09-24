public class AkunBankTest {
    public static void main(String[] arg){

        AkunBank akunbank = new AkunBank(50000);

        System.out.println("Saldo : Rp" + akunbank.getSaldo());
        akunbank.tabung(20000);
        System.out.println("Saldo : Rp" + akunbank.getSaldo());
        akunbank.tarikTunai(100000);
        System.out.println("Saldo : Rp" + akunbank.getSaldo());
        akunbank.tarikTunai(1000);
        System.out.println("Saldo : Rp" + akunbank.getSaldo());
    }
}
