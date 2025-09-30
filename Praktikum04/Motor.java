class kendaraan {
    public void klakson(){
        System.out.println("Beeeppp");
    }
    public void jalan(){
        System.out.println("ngeengg");
    }
}

class Motor extends kendaraan{

    static int jumlahMotor = 0;

    public enum JenisMotor {
        BEBEK,
        SKUTER_MATIK,
        VARIO,
        NAKED_BIKE,
        TOURING;
    }

    public JenisMotor jenisMotor;

    public Motor(JenisMotor jenis_motor){
        this.jenisMotor = jenis_motor;
        jumlahMotor += 1;
        System.out.println("Motor " + jenisMotor + ", telah berhasil terdaftar");
    }
}
