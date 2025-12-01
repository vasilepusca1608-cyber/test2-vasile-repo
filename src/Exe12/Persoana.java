package Exe12;

public class Persoana {

    private String nume;
    private int varsta;
    private String personalID;

    public Persoana(String nume, int varsta, String personalID){
        this.nume = nume;
        this.varsta = varsta;
        this.personalID = personalID;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public String getpersonalID() {
        return personalID;
    }

    public void setpesronalID(String personalID) {
        this.personalID = personalID;
    }
}

