import java.util.ArrayList;

public class PaketStation {
    ArrayList<Fach> myFacher = new ArrayList<Fach>();


    PaketStation() {
        for (int i = 0; i < 9; i++) {
            myFacher.add(new Fach());
        }
    }

    public String einlagern(Paket p) {
        for (Fach f : myFacher) {
            if (f.isEmpty()) {
                f.setPaket(p);
                return "Paket eingelagert";
            }
        }
        return "Paket konnte nicht eingelagert werden";
    }
}
