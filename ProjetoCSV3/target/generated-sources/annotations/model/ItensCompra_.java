package model;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Artefato;
import model.Compra;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2021-11-30T08:37:36", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(ItensCompra.class)
public class ItensCompra_ { 

    public static volatile SingularAttribute<ItensCompra, Artefato> artefato;
    public static volatile SingularAttribute<ItensCompra, Compra> compra;
    public static volatile SingularAttribute<ItensCompra, Float> valor;
    public static volatile SingularAttribute<ItensCompra, Integer> id;
    public static volatile SingularAttribute<ItensCompra, Float> quantidade;

}