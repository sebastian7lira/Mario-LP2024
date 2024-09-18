/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;


import bean.ClienteMsl;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Sebas 
 */
public class ClienteDAO extends DAO_Abstract {

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
        Criteria criteria = session.createCriteria(ClienteMsl.class);
        criteria.add(Restrictions.eq("idclienteMsl", id));
        List lista = criteria.list();
        session.getTransaction().commit();        
        return lista;
        
    }

    @Override
    public List listAll() {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(ClienteMsl.class);
        List lista = criteria.list();
        session.getTransaction().commit();        
        return lista;
        
    }
 public List listNome(String nome) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(ClienteMsl.class);
        criteria.add(Restrictions.like("nomeMsl", "%" + nome + "%"));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }
    public List listCpf(String cpf) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(ClienteMsl.class);
        criteria.add(Restrictions.like("cpfMsl", "%" + cpf + "%"));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }
    public List listNomeCpf(String nome, String cpf) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(ClienteMsl.class);
        criteria.add(Restrictions.like("nomeMsl", "%" + nome + "%"));
        criteria.add(Restrictions.like("cpfMsl", "%" + cpf + "%"));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }
    public static void main(String[] args) {
        ClienteDAO clienteDAO = new ClienteDAO();
        List lista = clienteDAO.listNome("nome que você está procurando");
        for (Object clienteMsl : lista) {
            System.out.println("nome:" + ((ClienteMsl)clienteMsl).getNomeMsl());
        }
    }
    

}