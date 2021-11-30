package model;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.ResultadoID;
import model.Status;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2021-11-30T08:54:00", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(Resultado.class)
public class Resultado_ { 

    public static volatile SingularAttribute<Resultado, ResultadoID> id;
    public static volatile SingularAttribute<Resultado, Status> status;

}