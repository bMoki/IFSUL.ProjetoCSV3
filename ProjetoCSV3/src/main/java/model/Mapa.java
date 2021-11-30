package model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "tb_mapa")
public class Mapa implements Serializable {
    @Id
    @SequenceGenerator(name = "seq_mapa", sequenceName = "seq_mapa_id", allocationSize = 1)
    @GeneratedValue(generator = "seq_mapa",strategy = GenerationType.SEQUENCE)
    private Integer id;
    private String nome;

    @ManyToMany
    @JoinTable(name = "tb_mapa_local", joinColumns = {@JoinColumn(name = "mapa_id")},
            inverseJoinColumns = {@JoinColumn(name = "local_id")})
    private List<Local> locais;

    private Mapa(){

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

    public List<Local> getLocais() {
        return locais;
    }

    public void setLocais(List<Local> locais) {
        this.locais = locais;
    }
}
