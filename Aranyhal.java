package aranyhal;

import java.util.HashMap;

public class Aranyhal {

    private final int KIVANSAGOKSZAMA = 3;
    private int kor;
    private HashMap<String, Integer> kivansagok;
    private String kifogta;

    public Aranyhal(String kifogta) {
        this.kifogta = kifogta;
    }

    public Aranyhal(String kifogta, int kor) {
        this.kor = kor;
        this.kifogta = kifogta;
    }

    public int getKor() {
        return kor;
    }

    public void setKifogta(String kifogta) {
        this.kifogta = kifogta;
    }

    public int kivansagokSzama(String kifogta) {
        return 0;
    }

    public String[] kikkelTalalkozott() {
        return null;
    }

    public boolean kivansagotTeljesit(String kivansag) {
        return true;
    }

    @Override
    public String toString() {
        return "Aranyhal{" + "KIVANSAGOKSZAMA=" + KIVANSAGOKSZAMA + ", kor=" + kor + ", kivansagok=" + kivansagok + ", kifogta=" + kifogta + '}';
    }

}
