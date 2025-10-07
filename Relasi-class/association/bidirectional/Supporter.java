package association.bidirectional;

import java.util.ArrayList;

public class Supporter {

    Pemainbola idola;

    public Supporter( Pemainbola idola) {
        this.idola = idola;
    }

    public void memberiDukungan() {
        System.out.println("SEMANGAT " + this.idola.getName() + "!!!!");
    }

}
