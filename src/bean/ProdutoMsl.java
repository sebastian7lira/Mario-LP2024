package bean;
// Generated 28/08/2024 10:55:43 by Hibernate Tools 4.3.1



import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * ProdutoMsl generated by hbm2java
 */
@Entity
@Table(name="produtoMsl"
    ,catalog="db_mario_lira"
)
public class ProdutoMsl  implements java.io.Serializable {


     private int idprodutoMsl;
     private String nomeMsl;
     private String descricaoMsl;
     private String categoriaMsl;
     private double precoMsl;
     private int quantidadeMsl;
     private String fornecedorMsl;
     

    public ProdutoMsl() {
    }

	
    public ProdutoMsl(int idprodutoMsl) {
        this.idprodutoMsl = idprodutoMsl;
    }
    public ProdutoMsl(int idprodutoMsl, String nomeMsl, String descricaoMsl, String categoriaMsl, double precoMsl, int quantidadeMsl, String fornecedorMsl) {
       this.idprodutoMsl = idprodutoMsl;
       this.nomeMsl = nomeMsl;
       this.descricaoMsl = descricaoMsl;
       this.categoriaMsl = categoriaMsl;
       this.precoMsl = precoMsl;
       this.quantidadeMsl = quantidadeMsl;
       this.fornecedorMsl = fornecedorMsl;
       
    }
   
     @Id 

    
    @Column(name="idprodutoMsl", unique=true, nullable=false)
    public int getIdprodutoMsl() {
        return this.idprodutoMsl;
    }
    
    public void setIdprodutoMsl(int idprodutoMsl) {
        this.idprodutoMsl = idprodutoMsl;
    }

    
    @Column(name="nomeMsl", length=45)
    public String getNomeMsl() {
        return this.nomeMsl;
    }
    
    public void setNomeMsl(String nomeMsl) {
        this.nomeMsl = nomeMsl;
    }

    
    @Column(name="descricaoMsl", length=10)
    public String getDescricaoMsl() {
        return this.descricaoMsl;
    }
    
    public void setDescricaoMsl(String descricaoMsl) {
        this.descricaoMsl = descricaoMsl;
    }

    
    @Column(name="categoriaMsl", length=45)
    public String getCategoriaMsl() {
        return this.categoriaMsl;
    }
    
    public void setCategoriaMsl(String categoriaMsl) {
        this.categoriaMsl = categoriaMsl;
    }

    
    @Column(name="precoMsl", precision=9)
    public double getPrecoMsl() {
        return this.precoMsl;
    }
    
    public void setPrecoMsl(double precoMsl) {
        this.precoMsl = precoMsl;
    }

    
    @Column(name="quantidadeMsl")
    public int getQuantidadeMsl() {
        return this.quantidadeMsl;
    }
    
    public void setQuantidadeMsl(int quantidadeMsl) {
        this.quantidadeMsl = quantidadeMsl;
    }

    
    @Column(name="fornecedorMsl", length=20)
    public String getFornecedorMsl() {
        return this.fornecedorMsl;
    }
    
    public void setFornecedorMsl(String fornecedorMsl) {
        this.fornecedorMsl = fornecedorMsl;
    }





}


