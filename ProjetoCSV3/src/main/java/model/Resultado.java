package model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity()
@Table(name = "tb_resulado")
public class Resultado  {
    @EmbeddedId
    private ResultadoID id;

    private Status status;

    public Resultado(){

    }

    public ResultadoID getId() {
        return id;
    }

    public void setId(ResultadoID id) {
        this.id = id;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
