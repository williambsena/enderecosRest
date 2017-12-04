package com.enderecorest.model;

import java.util.Date;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.xml.bind.annotation.XmlRootElement;



/**
 *
 * @author Williamsena
 */
@Entity
@Table(name = "Pessoa")
@XmlRootElement(name = "pessoa")
@NamedQueries({
    @NamedQuery(name = "Pessoa.findByCpf" , query = "select p "
                                                  + "    from Pessoa p "
                                                  + "    where p.cpf = :cpf"
                ),//findByCpf
    
    @NamedQuery(name = "Pessoa.findByrg",   query = "select p "
                                                  + "   from Pessoa p "
                                                  + "   where p.nome = :rg"
                ),//findByrg
    
    @NamedQuery(name = "Pessoa.findByNomeCompleto",   query = "select p "
                                                            + " from Pessoa p where p.nome = :nome"
                                                            + "            and p.sobreNome = :sobreNome"
                ),//findByNomeCompleto
    
    @NamedQuery(name = "Pessoa.findByNome", query = "select p "
                                                  + "   from Pessoa p "
                                                  + "   where p.nome = :nome"
                ),//findByNome
    //@NamedQuery(name = "Pessoa.findByNome", query = "select p from Pessoa p where p.nome = :nome")
        
    @NamedQuery(name = "Pessoa.findByLogradouro" , query = "select p  "
                                                         + "    from Pessoa p"
                                                         + "    where p.logradouro = :logradouro"
                )//findByLogradouro
})

public class Pessoa extends AbstractEntity {

    @Column(length = 11, nullable = false , unique = true)
    private String cpf;
    
    @Column(length = 8, nullable = true)
    private String rg;
    
    @Column(length = 155, nullable = false)
    private String nome;
    
    @Column(length = 255, nullable = false)
    private String sobreNome;
    
    @Column(length = 255, nullable = true , unique = true)
    private String email;

    @Column(nullable = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dtNascimento;

    @ManyToOne
    private Logradouro logradouro;

    public Pessoa() {
    }

    public Pessoa(String cpf, String rg, String nome, String sobreNome, String email, Date dtNascimento, Logradouro logradouro) {
        this.cpf          = cpf;     
        this.rg           = rg;
        this.nome         = nome;
        this.sobreNome    = sobreNome;
        this.email        = email;
        this.dtNascimento = dtNascimento;
        this.logradouro   = logradouro;
    }//Pessoa()

    public Pessoa(String string, String string0, String william, String basseto_Sena, String williamsena13gmailcom, Date date) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(Date dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public Logradouro getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(Logradouro logradouro) {
        this.logradouro = logradouro;
    }

    @Override
    public void updateParameters(Object entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
            

    

}
