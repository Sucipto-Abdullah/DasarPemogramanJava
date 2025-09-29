
import Mahasiswa.Mahasiswa;
import java.util.HashMap;
import java.util.ArrayList;

public class Kampus {

    public static void main(String[] args){
        
        HashMap<String, Mahasiswa> dataMahasiswa = new HashMap<String, Mahasiswa>();
        ArrayList<Mahasiswa> listMahasiswa = new ArrayList<Mahasiswa>();        

        Mahasiswa mahasiswa1 = new Mahasiswa("Sucipto Abdullah", "2403065", 2024);
        Mahasiswa mahasiswa2 =  new Mahasiswa("Firly Alam Sudrajat", "2403064", 2024);

        dataMahasiswa.put("2403065", mahasiswa1);
        dataMahasiswa.put("2403064", mahasiswa2);

        System.out.println("\nHashMap:");
        System.out.println("2403065 : " + dataMahasiswa.get("2403065").getNama());
        System.out.println("2403064 : " +dataMahasiswa.get("2403064").getNama());

        System.out.println("\nArrayList:");

        listMahasiswa.add(mahasiswa1);
        listMahasiswa.add(mahasiswa2);

        for( int i=0; i<10 ; i++){
            try {
                System.out.println("Index ke-" + i + " : " + listMahasiswa.get(i).getNama());
            } catch (Exception e) {
                System.out.println("Index ke-" + i + " : kosong");
            }
        }

    }
}
