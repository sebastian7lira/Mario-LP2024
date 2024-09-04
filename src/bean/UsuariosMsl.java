package bean;
// Generated 28/08/2024 10:55:43 by Hibernate Tools 4.3.1


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * UsuariosMsl generated by hbm2java
 */
@Entity
@Table(name="usuariosMsl"
    ,catalog="db_mario_lira"
)
public class UsuariosMsl  implements java.io.Serializable {


     private int idusuariosMsl;
     private String nomeMsl;
     private Date dataNascMsl;
     private String sexoMsl;
     private String emailMsl;
     private String cpfMsl;
     private String senhaMsl;

    public UsuariosMsl() {
    }

	
    public UsuariosMsl(int idusuariosMsl) {
        this.idusuariosMsl = idusuariosMsl;
    }
    public UsuariosMsl(int idusuariosMsl, String nomeMsl, Date dataNascMsl, String sexoMsl, String emailMsl, String cpfMsl, String senhaMsl) {
       this.idusuariosMsl = idusuariosMsl;
       this.nomeMsl = nomeMsl;
       this.dataNascMsl = dataNascMsl;
       this.sexoMsl = sexoMsl;
       this.emailMsl = emailMsl;
       this.cpfMsl = cpfMsl;
       this.senhaMsl = senhaMsl;
    }
   
     @Id 

    
    @Column(name="idusuariosMsl", unique=true, nullable=false)
    public int getIdusuariosMsl() {
        return this.idusuariosMsl;
    }
    
    public void setIdusuariosMsl(int idusuariosMsl) {
        this.idusuariosMsl = idusuariosMsl;
    }

    
    @Column(name="nomeMsl", length=45)
    public String getNomeMsl() {
        return this.nomeMsl;
    }
    
    public void setNomeMsl(String nomeMsl) {
        this.nomeMsl = nomeMsl;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="dataNascMsl", length=10)
    public Date getDataNascMsl() {
        return this.dataNascMsl;
    }
    
    public void setDataNascMsl(Date dataNascMsl) {
        this.dataNascMsl = dataNascMsl;
    }

    
    @Column(name="sexoMsl", length=45)
    public String getSexoMsl() {
        return this.sexoMsl;
    }
    
    public void setSexoMsl(String sexoMsl) {
        this.sexoMsl = sexoMsl;
    }

    
    @Column(name="emailMsl", length=45)
    public String getEmailMsl() {
        return this.emailMsl;
    }
    
    public void setEmailMsl(String emailMsl) {
        this.emailMsl = emailMsl;
    }

    
    @Column(name="cpfMsl", length=14)
    public String getCpfMsl() {
        return this.cpfMsl;
    }
    
    public void setCpfMsl(String cpfMsl) {
        this.cpfMsl = cpfMsl;
    }

    
    @Column(name="senhaMsl", length=15)
    public String getSenhaMsl() {
        return this.senhaMsl;
    }
    
    public void setSenhaMsl(String senhaMsl) {
        this.senhaMsl = senhaMsl;
    }




}

