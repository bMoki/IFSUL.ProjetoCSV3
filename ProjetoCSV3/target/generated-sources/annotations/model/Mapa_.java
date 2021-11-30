package model;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Local;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2021-11-30T08:54:00", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(Mapa.class)
public class Mapa_ { 

    public static volatile SingularAttribute<Mapa, String> nome;
    public static volatile SingularAttribute<Mapa, Integer> id;
    public static volatile ListAttribute<Mapa, Local> locais;

}