import zadatakStudent.Fakultet;
import zadatakStudent.Osoba;
import zadatakStudent.Profesor;
import zadatakStudent.Student;
import java.lang.String;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Fakultet mojFakultet = new Fakultet();
        Student student1 = new Student("Studentko", "Studentić", 21, "39380", 4);
        Student student2 = new Student("Zaboravko", "Sjetić", 22, "39381", 3);
        Profesor profesor1 = new Profesor("Blago", "Strogić", 54, "kažnjavanje prava", 3500);
        Profesor profesor2 = new Profesor("Jakov", "Imašdobarparfem", 46, "simuliranje povjesti", 2500);

        mojFakultet.getPopis().add(student1);
        mojFakultet.getPopis().add(student2);
        mojFakultet.getPopis().add(profesor1);
        mojFakultet.getPopis().add(profesor2);

        for(Osoba popis : mojFakultet.getPopis()){
            System.out.println(popis);
            System.out.println("");
        }
        System.out.println("Sortiranje i ispis");

//        Collections.sort(mojFakultet.getPopis());
//        for (Fakultet popis : mojFakultet.getPopis()){
//            System.out.println(popis);
//        }



    }
}
