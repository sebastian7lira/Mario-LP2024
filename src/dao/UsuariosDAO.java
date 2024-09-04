/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;


import bean.ClienteMsl;
import bean.UsuariosMsl;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author u07679183120
 */
public class UsuariosDAO extends DAO_Abstract {

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
        Criteria criteria = session.createCriteria(UsuariosMsl.class);
        criteria.add(Restrictions.eq("idusuariosMsl", id));
        List lista = criteria.list();
        session.getTransaction().commit();        
        return lista;
        
    }

    @Override
    public List listAll() {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(UsuariosMsl.class);
        List lista = criteria.list();
        session.getTransaction().commit();        
        return lista;
        
    }
      public boolean listCadastro(String nome, String senha){
        
        session.beginTransaction();
        Criteria criteria = session.createCriteria(UsuariosMsl.class);
        criteria.add(Restrictions.eq("nomeMsl", nome));
        criteria.add(Restrictions.eq("senhaMsl", senha));
        List lista = criteria.list();
        session.getTransaction().commit();
        System.out.println("lista:" + lista);
        if(lista.isEmpty()){
            return false; 
        }else{
            return true; 
        }
    }
    public List listNome(String nome) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(UsuariosMsl.class);
        criteria.add(Restrictions.like("nomeMsl", "%" + nome + "%"));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }
    public List listCpf(String cpf) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(UsuariosMsl.class);
        criteria.add(Restrictions.like("cpfMsl", "%" + cpf + "%"));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }
    public List listNomeCpf(String nome, String cpf) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(UsuariosMsl.class);
        criteria.add(Restrictions.like("nomeMsl", "%" + nome + "%"));
        criteria.add(Restrictions.like("cpfMsl", "%" + cpf + "%"));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }
    public static void main(String[] args) {
        UsuariosDAO usuariosDAO = new UsuariosDAO();
        List lista = usuariosDAO.listNome("nome que você está procurando");
        for (Object usuariosMsl : lista) {
            System.out.println("nome:" + ((UsuariosMsl)usuariosMsl).getNomeMsl());
        }
    }
   // public UsuariosMsl login(String usuario, String senha) {
    //session.beginTransaction();
    //Criteria criteria = session.createCriteria(UsuariosMsl.class);
    //criteria.add(Restrictions.eq("nomeMsl", usuario));
    //criteria.add(Restrictions.eq("senhaMsl", senha));
    //UsuariosMsl usuarioAutenticado = (UsuariosMsl) criteria.uniqueResult();
    //session.getTransaction().commit();
    //return usuarioAutenticado;
   // }
}