/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.ProdutoVendaMsl;
import bean.VendasMsl;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Sebas :0
 */
public class ProdutoVendaDAO  extends DAO_Abstract{
    public void insert(Object object) {
        session.beginTransaction();
        session.save(object);
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
        Criteria criteria = session.createCriteria(ProdutoVendaMsl.class);
        criteria.add(Restrictions.eq("idprodutovenda", id));
        List lista = criteria.list();
        session.getTransaction().commit();        
        return lista;
    }

    @Override
    public List listAll() {
         session.beginTransaction();
        Criteria criteria = session.createCriteria(ProdutoVendaMsl.class);
//        List lista = criteria.list();
        session.getTransaction().commit();  
        List lista = new ArrayList();
        return lista;
        
//        public List<VendaBjf> listAll() {
//    session.beginTransaction();
//    Criteria criteria = session.createCriteria(VendaBjf.class);
//    List<VendaBjf> lista = criteria.list();
//    session.getTransaction().commit(); 
//    return lista;
}
     public List listProduto(ProdutoVendaMsl produtovendasMsl){
       session.beginTransaction();
        Criteria criteria = session.createCriteria(ProdutoVendaMsl.class);
        criteria.add( Restrictions.eq("produtoMsl", produtovendasMsl));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }
     
}