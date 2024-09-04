/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;


import bean.ClienteMsl;
import bean.VendasMsl;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Sebas :0
 */
public class VendasDAO extends DAO_Abstract {

    @Override
    public void insert(Object objeto) {
      session.beginTransaction();
      session.save(objeto);
      session.getTransaction().commit();
}

    @Override
    public void update(Object object) {
        session.beginTransaction();
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
        Criteria criteria = session.createCriteria(VendasMsl.class);
        criteria.add(Restrictions.eq("idvendasMsl", id));
        List lista = criteria.list();
        session.getTransaction().commit();        
        return lista;
        
    }

    @Override
    public List listAll() {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(VendasMsl.class);
        List lista = criteria.list();
        session.getTransaction().commit();        
        return lista;
        
    }
    public List listNome(String nome) {
    session.beginTransaction();
    Criteria criteria = session.createCriteria(VendasMsl.class);
    criteria.createAlias("clientesMsl", "clientes"); // Alias para a associação entre VendasMsl e ClienteMsl
    criteria.add(Restrictions.like("clientes.nomeMsl", "%" + nome + "%"));
    List lista = criteria.list();
    session.getTransaction().commit();
    return lista;
}

public List listValor(double valor) {
    session.beginTransaction();
    Criteria criteria = session.createCriteria(VendasMsl.class);
    criteria.add(Restrictions.eq("valorTotalMsl", valor));
    List lista = criteria.list();
    session.getTransaction().commit();
    return lista;
}

public List listNomeValor(String nome, double valor) {
    session.beginTransaction();
    Criteria criteria = session.createCriteria(VendasMsl.class);
    criteria.createAlias("clientesMsl", "clientes"); // Alias para a associação entre VendasMsl e ClienteMsl
    criteria.add(Restrictions.like("clientes.nomeMsl", "%" + nome + "%"));
    criteria.add(Restrictions.eq("valorTotalMsl", valor));
    List lista = criteria.list();
    session.getTransaction().commit();
    return lista;
}
}