package praktikum05.Abstraction;

public class Makanan extends Konsumsi {
    
    public maknanan( int kapasitas ){
        super.kapasitas = kapasitas;
    }

    @Override
    public void mengonsumsi(){
        System.out.println("Makannn");
    }

}
