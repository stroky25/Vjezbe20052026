package zadatakStudent;

public class Student extends Osoba{
//    private String ime;
//    private String prezime;
//    private int godine;
    private String BrojIndexa;
    private int godinaStudija;

    public Student(String ime, String prezime, int godine, String brojIndexa, int godinaStudija) {
        super(ime, prezime, godine);
        this.BrojIndexa = brojIndexa;
        this.godinaStudija = godinaStudija;
    }


    @Override
    public String toString() {
        return "Pozdrav, ja sam " + ime + " " + prezime + " i imam " + godine + " godina." + " Ja sam student s brojem indexa " +  BrojIndexa + " na " +  godinaStudija + ". godini.";
    }
}
