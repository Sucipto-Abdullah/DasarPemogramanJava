
// import association.bidirectional.PemainBola;
import association.bidirectional.*;
import association.uniderectional.Pelatih;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Pemainbola> pemain = new ArrayList<Pemainbola>();
        pemain.add(new Pemainbola("firly", "Kiper"));
        pemain.add(new Pemainbola("Azhar", "Striker"));
        pemain.add(new Pemainbola("Azhar ke dua", "Back"));
        pemain.add(new Pemainbola("Azhar ke tiga", "Striker"));

        Supporter davi = new Supporter(pemain.get(1));

        Pelatih patrik = new Pelatih("Patrik", "Muter-muter");


        for(int i=0; i<pemain.size(); i++){

            patrik.addPemain(pemain.get(i));
            
        }
        
        patrik.getInstruction("firly");
        // patrik.Pemain.get("firly");

        System.out.println(patrik.Pemain.get("firly"));

    }
}
