package ma.education.tp1.introduction;

public class Test {
    public static void main(String[] args) {
        /*Instanciation (Création) des trois
         * objets o1,2 and 3*/
        Salle s1=new Salle();
        Salle s2=new Salle("Salle Informatique");
        Salle s3=new Salle("Salle des cours");

        System.out.println(s1.id+" "+s1.nom);
        System.out.println(s2.id+" "+s2.nom);
        System.out.println(s3.id+" "+s3.nom);
    }
}

