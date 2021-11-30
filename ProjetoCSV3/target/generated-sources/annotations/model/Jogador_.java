package model;

import java.util.Calendar;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Artefato;
import model.Compra;
import model.Endereco;
import model.Patente;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2021-11-30T09:27:02", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(Jogador.class)
public class Jogador_ { 

    public static volatile ListAttribute<Jogador, Artefato> artefatos;
    public static volatile SingularAttribute<Jogador, String> senha;
    public static volatile SingularAttribute<Jogador, Calendar> data_ultimo_login;
    public static volatile ListAttribute<Jogador, Compra> compras;
    public static volatile ListAttribute<Jogador, Patente> patentes;
    public static volatile SingularAttribute<Jogador, Calendar> data_cadastro;
    public static volatile SingularAttribute<Jogador, Endereco> endereco;
    public static volatile SingularAttribute<Jogador, Integer> pontos;
    public static volatile SingularAttribute<Jogador, String> nickname;

}