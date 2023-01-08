package ma.education.tp1.introduction;

public class Salle {
    public long id;
    public String nom;

    public Salle(long id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public Salle(long id) {
        this.id = id;
    }

    public Salle(String nom) {
        this.nom = nom;
    }

    public Salle() {
    }

    public boolean is_equal(Salle s1,Salle s2){
        return s1.equals(s2);
    }
}
