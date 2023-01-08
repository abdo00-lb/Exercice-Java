package ma.education.tp2.reflection;

import ma.education.tp1.introduction.Salle;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TestReflection {
    public static void main(String[] args) {
        Class cls = Salle.class;
        Field[] attributs = cls.getDeclaredFields();
        for (Field att : attributs) {
            System.out.println(att.getName());
        }

        Method[] methods = cls.getDeclaredMethods();
        for (Method meth : methods) {
            System.out.println(meth.getName());
        }

        Salle o1 = new Salle();
        Salle o2 = new Salle("Salle Informatique");
        Salle o3 = new Salle(2,"Salle des cours");
        System.out.print(o2.equals(o3));
    }
}
