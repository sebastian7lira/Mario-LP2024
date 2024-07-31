package dao;

import bean.VendedorJmbv;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sebas
 */
public class FuncionarioDAO extends DAO_Abstract {

    @Override
    public void insert(Object object) {
        session.beginTransaction();
        session.save(object);
        session.getTransaction().commit();
    }

    @Override
    public void update(Object object) {
        session.beginTransaction();
        session.flush();//para limpar o cache do hibernate
        session.clear();//para que ele nao grave coisas erradas
        session.update(object);
        session.getTransaction().commit();
    }

    @Override
    public void delete(Object object) {
        session.beginTransaction();
        session.flush();
        session.clear();
        session.delete(object);
        session.getTransaction().commit();
    }

    @Override
    public Object list(int id) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(VendedorJmbv.class);
        criteria.add(Restrictions.eq("idvendedorJmbv", id));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    @Override
    public List listAll() {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(VendedorJmbv.class);
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }
    public List listNome(String nome){
        session.beginTransaction();
        Criteria criteria = session.createCriteria(VendedorJmbv.class);
        criteria.add(Restrictions.like("nomeJmbv", nome, MatchMode.ANYWHERE));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }
    public List listData(Date data, Date dataM){
        session.beginTransaction();
        Criteria criteria = session.createCriteria(VendedorJmbv.class);
        criteria.add(Restrictions.gt("dataNascimentoJmbv", data));
        criteria.add(Restrictions.lt("dataNascimentoJmbv", dataM));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }
    public List listNomeEData(String nome, Date data, Date dataM){
        session.beginTransaction();
        Criteria criteria = session.createCriteria(VendedorJmbv.class);
        criteria.add(Restrictions.gt("dataNascimentoJmbv", data));
        criteria.add(Restrictions.lt("dataNascimentoJmbv", dataM));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }
    public static void main(String[] args) {
        FuncionarioDAO funcionaroDAO = new FuncionarioDAO();
    }
    
}
