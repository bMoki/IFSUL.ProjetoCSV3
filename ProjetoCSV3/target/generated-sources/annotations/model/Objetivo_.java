package model;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Local;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2021-11-30T09:24:42", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(Objetivo.class)
public class Objetivo_ { 

    public static volatile SingularAttribute<Objetivo, Integer> pontos;
    public static volatile SingularAttribute<Objetivo, String> nome;
    public static volatile SingularAttribute<Objetivo, Integer> id;
    public static volatile ListAttribute<Objetivo, Local> locais;

}