package Polymorphism;

public class Anjing extends Hewan {
    
    super.jenis = JenisHewan.ANJING;

    @Override
    public void bersuara(){
        System.out.println("Bang, pinjem 100 dong :D");
    }

}
