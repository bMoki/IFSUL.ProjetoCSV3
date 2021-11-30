
package model;

import java.io.Serializable;
import java.util.Calendar;
import java.util.List;
import javax.persistence.*;


@Entity
@Table(name = "tb_jogador")
public class Jogador implements Serializable {
    
    @Id
    private String nickname;
    
    @Column(nullable = false)
    private String senha;
    
    @Column(nullable = true)
    private Integer pontos;
    
    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar data_cadastro;
    
    @Column(nullable = true)
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar data_ultimo_login;
    
    @ManyToOne
    @JoinColumn(name = "endereco_id", nullable = false)
    private Endereco endereco;
    
    @OneToMany(mappedBy = "jogador")//mappedBy deve apontar para a referencia de jogador dentro de Compra.
    private List<Compra> compras; //agregacao por composicao
    
    
    @ManyToMany
    @JoinTable(name = "tb_jogador_artefato", joinColumns = {@JoinColumn(name = "jogador_nickname")}, //agregacao, vai gerar uma tabela associativa.
                                       inverseJoinColumns = {@JoinColumn(name = "artefato_id")})
    private List<Artefato> artefatos;
    
    
    @ManyToMany
    @JoinTable(name = "tb_jogador_patente", joinColumns = {@JoinColumn(name = "jogador_nickname")}, //agregacao, vai gerar uma tabela associativa.
                                       inverseJoinColumns = {@JoinColumn(name = "patente_id")})
    private List<Patente> patentes;
    
    
    public Jogador(){
        
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getSenha() {
        return senha;
    }


    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Integer getPontos() {
        return pontos;
    }

    public void setPontos(Integer pontos) {
        this.pontos = pontos;
    }

    public Calendar getData_cadastro() {
        return data_cadastro;
    }

    public void setData_cadastro(Calendar data_cadastro) {
        this.data_cadastro = data_cadastro;
    }

    public Calendar getData_ultimo_login() {
        return data_ultimo_login;
    }

    public void setData_ultimo_login(Calendar data_ultimo_login) {
        this.data_ultimo_login = data_ultimo_login;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public List<Compra> getCompras() {
        return compras;
    }

    public void setCompras(List<Compra> compras) {
        this.compras = compras;
    }

    public List<Artefato> getArtefatos() {
        return artefatos;
    }

    public void setArtefatos(List<Artefato> artefatos) {
        this.artefatos = artefatos;
    }

    public List<Patente> getPatentes() {
        return patentes;
    }

    public void setPatentes(List<Patente> patentes) {
        this.patentes = patentes;
    }

}
