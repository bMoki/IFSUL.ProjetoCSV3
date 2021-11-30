package model;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Mapa;
import model.Objetivo;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2021-11-30T08:54:00", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(Local.class)
public class Local_ { 

    public static volatile SingularAttribute<Local, Objetivo> objetivo;
    public static volatile SingularAttribute<Local, Mapa> mapa;
    public static volatile SingularAttribute<Local, String> latitude;
    public static volatile SingularAttribute<Local, String> nome;
    public static volatile SingularAttribute<Local, Integer> id;
    public static volatile SingularAttribute<Local, String> longitude;

}