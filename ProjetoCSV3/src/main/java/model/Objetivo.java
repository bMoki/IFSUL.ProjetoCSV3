package model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "tb_objetivo")
public class Objetivo implements Serializable {
    @Id
    private Integer id;
    private String nome;
    private Integer pontos;

    @OneToMany(mappedBy = "objetivo")
    private List<Local> locais;

    @ManyToOne
    @JoinColumn(name = "round_id")
    private Round round;

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
