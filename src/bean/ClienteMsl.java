package bean;
// Generated 28/08/2024 10:55:43 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * ClienteMsl generated by hbm2java
 */
@Entity
@Table(name="clienteMsl"
    ,catalog="db_mario_lira"
)
public class ClienteMsl  implements java.io.Serializable {


     private int idclienteMsl;
     private String nomeMsl;
     private String emailMsl;
     private String telefoneMsl;
     private String estadoCivilMsl;
     private String profissaoMsl;
     private String rgMsl;
     private String cpfMsl;
     private Date dataNascMsl;
     private String enderecoMsl;
     private String estadoMsl;
     private String cidadeMsl;
     private String cepMsl;
     private String formacaoMsl;
   
    public ClienteMsl() {
    }

	
    public ClienteMsl(int idclienteMsl) {
        this.idclienteMsl = idclienteMsl;
    }
    public ClienteMsl(int idclienteMsl, String nomeMsl, String emailMsl, String telefoneMsl, String estadoCivilMsl, String profissaoMsl, String rgMsl, String cpfMsl, Date dataNascMsl, String enderecoMsl, String estadoMsl, String cidadeMsl, String cepMsl, String formacaoMsl) {
       this.idclienteMsl = idclienteMsl;
       this.nomeMsl = nomeMsl;
       this.emailMsl = emailMsl;
       this.telefoneMsl = telefoneMsl;
       this.estadoCivilMsl = estadoCivilMsl;
       this.profissaoMsl = profissaoMsl;
       this.rgMsl = rgMsl;
       this.cpfMsl = cpfMsl;
       this.dataNascMsl = dataNascMsl;
       this.enderecoMsl = enderecoMsl;
       this.estadoMsl = estadoMsl;
       this.cidadeMsl = cidadeMsl;
       this.cepMsl = cepMsl;
       this.formacaoMsl = formacaoMsl;
       
    }
   
     @Id 

    
    @Column(name="idclienteMsl", unique=true, nullable=false)
    public int getIdclienteMsl() {
        return this.idclienteMsl;
    }
    
    public void setIdclienteMsl(int idclienteMsl) {
        this.idclienteMsl = idclienteMsl;
    }

    
    @Column(name="nomeMsl", length=45)
    public String getNomeMsl() {
        return this.nomeMsl;
    }
    
    public void setNomeMsl(String nomeMsl) {
        this.nomeMsl = nomeMsl;
    }

    
    @Column(name="emailMsl", length=45)
    public String getEmailMsl() {
        return this.emailMsl;
    }
    
    public void setEmailMsl(String emailMsl) {
        this.emailMsl = emailMsl;
    }

    
    @Column(name="telefoneMsl", length=15)
    public String getTelefoneMsl() {
        return this.telefoneMsl;
    }
    
    public void setTelefoneMsl(String telefoneMsl) {
        this.telefoneMsl = telefoneMsl;
    }

    
    @Column(name="estadoCivilMsl", length=20)
    public String getEstadoCivilMsl() {
        return this.estadoCivilMsl;
    }
    
    public void setEstadoCivilMsl(String estadoCivilMsl) {
        this.estadoCivilMsl = estadoCivilMsl;
    }

    
    @Column(name="profissaoMsl", length=20)
    public String getProfissaoMsl() {
        return this.profissaoMsl;
    }
    
    public void setProfissaoMsl(String profissaoMsl) {
        this.profissaoMsl = profissaoMsl;
    }

    
    @Column(name="rgMsl", length=14)
    public String getRgMsl() {
        return this.rgMsl;
    }
    
    public void setRgMsl(String rgMsl) {
        this.rgMsl = rgMsl;
    }

    
    @Column(name="cpfMsl", length=15)
    public String getCpfMsl() {
        return this.cpfMsl;
    }
    
    public void setCpfMsl(String cpfMsl) {
        this.cpfMsl = cpfMsl;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="dataNascMsl", length=10)
    public Date getDataNascMsl() {
        return this.dataNascMsl;
    }
    
    public void setDataNascMsl(Date dataNascMsl) {
        this.dataNascMsl = dataNascMsl;
    }

    
    @Column(name="enderecoMsl", length=45)
    public String getEnderecoMsl() {
        return this.enderecoMsl;
    }
    
    public void setEnderecoMsl(String enderecoMsl) {
        this.enderecoMsl = enderecoMsl;
    }

    
    @Column(name="estadoMsl", length=20)
    public String getEstadoMsl() {
        return this.estadoMsl;
    }
    
    public void setEstadoMsl(String estadoMsl) {
        this.estadoMsl = estadoMsl;
    }

    
    @Column(name="cidadeMsl", length=30)
    public String getCidadeMsl() {
        return this.cidadeMsl;
    }
    
    public void setCidadeMsl(String cidadeMsl) {
        this.cidadeMsl = cidadeMsl;
    }

    
    @Column(name="cepMsl", length=15)
    public String getCepMsl() {
        return this.cepMsl;
    }
    
    public void setCepMsl(String cepMsl) {
        this.cepMsl = cepMsl;
    }

    
    @Column(name="formacaoMsl", length=45)
    public String getFormacaoMsl() {
        return this.formacaoMsl;
    }
    
    public void setFormacaoMsl(String formacaoMsl) {
        this.formacaoMsl = formacaoMsl;
    }




}

