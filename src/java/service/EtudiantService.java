/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import beans.Etudiant;
import dao.IDao;
import java.util.List;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import util.HibernateUtil;

public class EtudiantService implements IDao<Etudiant> {

    @Override
    public void create(Etudiant o) {
        Session s = HibernateUtil.getSessionFactory().openSession();
        s.beginTransaction();
        s.save(o);
        s.getTransaction().commit();
        s.close();
    }

    @Override
    public void delete(Etudiant o) {
        Session s = HibernateUtil.getSessionFactory().openSession();
        s.beginTransaction();
        s.delete(o);
        s.getTransaction().commit();
        s.close();
    }

    @Override
    public void update(Etudiant o) {
        Session s = HibernateUtil.getSessionFactory().openSession();
        s.beginTransaction();
        s.update(o);
        s.getTransaction().commit();
        s.close();
    }

    @Override
    public Etudiant findById(int id) {
        Etudiant e = null;
        Session s = HibernateUtil.getSessionFactory().openSession();
        s.beginTransaction();
        e = (Etudiant) s.get(Etudiant.class, id);
        s.getTransaction().commit();
        s.close();
        return e;
    }

    @Override
    public List<Etudiant> findAll() {
        List<Etudiant> e = null;
        Session s = HibernateUtil.getSessionFactory().openSession();
        s.beginTransaction();
        e = s.createQuery("from Etudiant").list();
        s.getTransaction().commit();
        s.close();
        return e;
    }

}
