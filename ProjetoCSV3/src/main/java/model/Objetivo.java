package model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "tb_objetivo")
public class Objetivo implements Serializable {
    @Id
    @SequenceGenerator(name = "seq_objetivo" , sequenceName = "seq_objetivo_id",allocationSize = 1)
    @GeneratedValue(generator = "seq_objetivo", strategy = GenerationType.SEQUENCE)
    private Integer id;
    private String nome;
    private Integer pontos;

    @ManyToMany
    @JoinTable(name = "tb_objetivo_local", joinColumns = {@JoinColumn(name = "objetivo_id")},
            inverseJoinColumns = {@JoinColumn(name = "local_id")})
    private List<Local> locais;

    public Objetivo(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getPontos() {
        return pontos;
    }

    public void setPontos(Integer pontos) {
        this.pontos = pontos;
    }

    public List<Local> getLocais() {
        return locais;
    }

    public void setLocais(List<Local> locais) {
        this.locais = locais;
    }
}
