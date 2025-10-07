package praktikum05.Abstraction;

public class Minuman extends Konsumsi {
    
    public Minuman( int kapasitas ){
        super.kapasitas = kapasitas;
    }

    @Override
    public void mengonsumsi(){
        System.out.println("gulug gulug!!");
    }

}
