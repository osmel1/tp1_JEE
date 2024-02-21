package org.example.presentationStatique;

import org.example.dao.DaoImpl;
import org.example.dao.IDao;
import org.example.metier.IMetier;
import org.example.metier.MetierImpl;

public class Main {
    public static void main(String[] args) {
        System.out.println("Injection de dependances par instanciations statique");
        IDao dao1 = new DaoImpl();
        MetierImpl metier = new MetierImpl();
        metier.setDao(dao1);
        System.out.println(metier.calcul());
    }
}