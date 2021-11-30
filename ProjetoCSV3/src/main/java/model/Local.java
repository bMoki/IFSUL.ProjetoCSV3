package model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "tb_local")
public class Local implements Serializable {

    @Id
    private Integer id;
    private String nome;
    private String longitude;
    private String latitude;

    @ManyToOne
    @JoinColumn(name = "mapa_id")
    private Mapa mapa;

    @ManyToOne
    @JoinColumn(name = "objetivo_id")
    private Objetivo objetivo;

    public Local(){

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

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }
}
