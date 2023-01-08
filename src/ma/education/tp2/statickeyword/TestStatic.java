package ma.education.tp2.statickeyword;

public class TestStatic {
    public static void main(String[] args) {
        Etudiant e1= new Etudiant(1, "AHMED", 20);
        Etudiant e2= new Etudiant(2, "SAID", 30);
        System.out.print(e2.nom+" "+e2.id+" "+Etudiant.nbEtudiants);
        System.out.print(e1.nom+" "+e1.id+" "+Etudiant.nbEtudiants);
    }
}
