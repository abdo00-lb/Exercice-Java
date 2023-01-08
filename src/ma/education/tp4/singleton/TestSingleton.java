package ma.education.tp4.singleton;

public class TestSingleton {
    public static void main(String[] args) {
        Terre t1= Terre.getInstance(1000, 2000);
        Terre t2= Terre.getInstance(4000, 5000);
        System.out.print(t2.distanceToSoleil+" "+t2.surface);
        System.out.print(t1.distanceToSoleil+" "+t1.surface);
    }
}
