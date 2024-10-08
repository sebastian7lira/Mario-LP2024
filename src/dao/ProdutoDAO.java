/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.ProdutoMsl;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author duals
 */
public class ProdutoDAO extends DAO_Abstract{
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
        Criteria criteria = session.createCriteria(ProdutoMsl.class);
        criteria.add(Restrictions.eq("idprodutoMsl", id));
        List lista = criteria.list();
        session.getTransaction().commit();        
        return lista;
        
    }

    @Override
    public List listAll() {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(ProdutoMsl.class);
        List lista = criteria.list();
        session.getTransaction().commit();        
        return lista;
        
    }
   public List listNome(String nome) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(ProdutoMsl.class);
        criteria.add(Restrictions.like("nomeMsl", "%" + nome + "%"));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }
    public List listPreco(double preco) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(ProdutoMsl.class);
        criteria.add(Restrictions.eq("precoMsl", preco));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
}
    public List listNomePreco(String nome, double salario) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(ProdutoMsl.class);
        criteria.add(Restrictions.like("nomeMsl", "%" + nome + "%"));
        criteria.add(Restrictions.eq("salarioMsl", salario));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
}

    public static void main(String[] args) {
        ProdutoDAO produtoDAO = new ProdutoDAO();
        List lista = produtoDAO.listNome("nome que você está procurando");
        for (Object produtoMsl : lista) {
            System.out.println("nome:" + ((ProdutoMsl)produtoMsl).getNomeMsl());
        }
    }
}