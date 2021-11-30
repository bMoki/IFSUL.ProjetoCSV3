package model;

import java.util.Calendar;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Jogador;
import model.Round;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2021-11-30T09:24:42", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(Partida.class)
public class Partida_ { 

    public static volatile SingularAttribute<Partida, Calendar> inicio;
    public static volatile SingularAttribute<Partida, Integer> id;
    public static volatile SingularAttribute<Partida, Calendar> fim;
    public static volatile ListAttribute<Partida, Round> rounds;
    public static volatile SingularAttribute<Partida, Jogador> jogador;

}