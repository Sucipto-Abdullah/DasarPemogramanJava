class Kocheng extends Hewan {
    
    public Kocheng(){
        super.jenis = JenisHewan.KUCING;
    }

    @Override
    void bersuara(){
        System.out.println("Ngeong");
    }

}
