package model;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Municao;
import model.Tipo;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2021-11-30T08:37:36", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(Arma.class)
public class Arma_ extends Artefato_ {

    public static volatile SingularAttribute<Arma, Float> comprimento_cano;
    public static volatile SingularAttribute<Arma, Tipo> tipo;
    public static volatile ListAttribute<Arma, Municao> municoes;

}