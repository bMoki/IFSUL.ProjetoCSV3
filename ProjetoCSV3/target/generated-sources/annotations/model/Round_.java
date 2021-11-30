package model;

import java.util.Calendar;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Modo;
import model.Objetivo;
import model.Partida;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2021-11-30T09:24:42", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(Round.class)
public class Round_ { 

    public static volatile SingularAttribute<Round, Integer> numero;
    public static volatile ListAttribute<Round, Objetivo> objetivos;
    public static volatile SingularAttribute<Round, Calendar> inicio;
    public static volatile SingularAttribute<Round, Integer> id;
    public static volatile SingularAttribute<Round, Calendar> fim;
    public static volatile SingularAttribute<Round, Modo> modo;
    public static volatile SingularAttribute<Round, Partida> partida;

}