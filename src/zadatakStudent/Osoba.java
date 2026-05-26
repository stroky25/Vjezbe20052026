package zadatakStudent;

public class Osoba implements Comparable<Osoba>{
    public String ime;
    public String prezime;
    public int godine;

    public Osoba(String ime, String prezime, int godine) {
        this.ime = ime;
        this.prezime = prezime;
        this.godine = godine;
    }

    public int getGodine() {
        return godine;
    }

    @Override
    public String toString() {
        return "Pozdrav, ja sam " + ime + " " + prezime + " i imam " + godine + " godina.";
    }

    @Override
    public int compareTo(Osoba o) {
        return Integer.compare(this.godine, o.godine);
    }
}


