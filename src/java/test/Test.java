/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import beans.Etudiant;
import java.util.Date;
import service.EtudiantService;
import util.HibernateUtil;

/**
 *
 * @author a
 */
public class Test {
    public static void main(String[] args) {
        
        Etudiant e1 = new Etudiant("rami", "kamal", new Date(), "email", "qwerty");
        Etudiant e2 = new Etudiant("rami", "kamal", new Date(), "email", "qwerty");
        Etudiant e3 = new Etudiant("rami", "kamal", new Date(), "email", "qwerty");
        
        EtudiantService es = new EtudiantService();
        es.create(e1);
        es.create(e2);
        es.create(e3);
                
        
        
    }
}
