package Polymorphism;

abstract class Hewan {
    
    public enum JenisHewan{
        KUCING("Kucing"),
        ANJING("Anjing"),
        KELINCI("Kelinci");

        private String jenisHewan;

        private JenisHewan( String jenisHewan ) {
            this.jenisHewan = jenisHewan;
        }

        public String getJenis(){
            return jenisHewan;
        }
    }

    private JenisHewan jenis;

    public Hewan( JenisHewan jenisHewan ){
        this.jenisHewan = jenisHewan;
    }

    abstract void bersuara();
}
