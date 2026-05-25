package zadatakStudent;


public class Profesor extends Osoba{
//    private String ime;
//    private String prezime;
//    private int godine;
    private String predmet;
    private double placa;


    public Profesor(String ime, String prezime, int godine, String predmet, double placa) {
        super(ime, prezime, godine);
        this.predmet = predmet;
        this.placa = placa;
    }

    @Override
    public String toString() {
        return "Pozdrav, ja sam profesor " + ime + " " + prezime + " i predajem " + predmet + ".";
    }
}
