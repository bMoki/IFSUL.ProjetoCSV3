package model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Calendar;
import java.util.List;

@Entity
@Table(name = "tb_round")
public class Round implements Serializable {
    @Id
    @SequenceGenerator(name = "seq_round",sequenceName = "seq_round_id",allocationSize = 1)
    @GeneratedValue(generator = "seq_round",strategy = GenerationType.SEQUENCE)
    private Integer id;
    private Integer numero;
    private Calendar inicio;
    private Calendar fim;

    @ManyToMany
    @JoinTable(name = "tb_round_objetivo", joinColumns = {@JoinColumn(name = "round_id")},
            inverseJoinColumns = {@JoinColumn(name = "objetivo_id")})
    private List<Objetivo> objetivos;

    @ManyToOne
    @JoinColumn(name = "partida_id", nullable = false)
    private Partida partida;

    private Modo modo;

    public Round(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Calendar getInicio() {
        return inicio;
    }

    public void setInicio(Calendar inicio) {
        this.inicio = inicio;
    }

    public Calendar getFim() {
        return fim;
    }

    public void setFim(Calendar fim) {
        this.fim = fim;
    }

    public List<Objetivo> getObjetivos() {
        return objetivos;
    }

    public void setObjetivos(List<Objetivo> objetivos) {
        this.objetivos = objetivos;
    }

    public Partida getPartida() {
        return partida;
    }

    public void setPartida(Partida partida) {
        this.partida = partida;
    }

    public Modo getModo() {
        return modo;
    }

    public void setModo(Modo modo) {
        this.modo = modo;
    }
}
