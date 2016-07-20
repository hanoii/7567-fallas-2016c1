package ar.uba.fi.fallas;

import javax.inject.Inject;
import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;
import org.kie.api.cdi.KSession;
import org.kie.api.runtime.KieSession;

/**
 * Hello world!
 *
 */
public class App
{
    @Inject
    @KSession()
    private KieSession kSession;

    public void bootstrapDrools() {
        // The KieSession was injected so we can use it now
        // go !
        Parser parser = new Parser();
        parser.setPasiva(Parser.Cantidad.FRECUENTE);
        parser.setFormal(Parser.Cantidad.FRECUENTE);
        parser.setOraciones(Parser.Complejidad.NORMAL);
        parser.setContracciones(Parser.Cantidad.POCO);
        parser.setForma(Parser.Forma.MR);
        parser.setSaludo(Parser.Cortesia.YOURS_SINCERELY);
        parser.setFirma(Parser.Firma.NOMBRE_APELLIDO);

        kSession.insert(parser);
        int rulesFired = kSession.fireAllRules();
        System.out.println("Rules Fired: "+rulesFired);
    }

    public static void main( String[] args )
    {
        //Boostrap the CDI container, in this case WELD
        Weld w = new Weld();

        WeldContainer wc = w.initialize();
        App app = wc.instance().select(App.class).get();
        app.bootstrapDrools();

        w.shutdown();
    }
}
