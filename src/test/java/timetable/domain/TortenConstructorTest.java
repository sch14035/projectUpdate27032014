
package timetable.domain;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(value = Parameterized.class)
public class TortenConstructorTest {

    private final String bezeichnung;

    private final Integer zutaten;
    
    private final Integer menge;
    
    private final Float groesse;
    
    private final Float preis;

    public TortenConstructorTest(String bezeichnung, Integer zutaten, Integer menge, Float groesse, Float preis) {
        this.bezeichnung = bezeichnung;
        this.zutaten = zutaten;
        this.menge = menge;
        this.groesse = groesse;
        this.preis = preis;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][]{ //
                {"Sachertorte",null,5,10.0f,3.0f}, //
                {null,3,5,10.0f,3.0f},
                {"Sachertorte",3,5,null,3.0f},
                {"Sachertorte",3,null,10.0f,3.0f},
                {"Sachertorte",3,5,10.0f,null}
               };
        return Arrays.asList(data);
    }

    @Test(expected = IllegalArgumentException.class)
    public void whenCreatingWithNullArguments() {
        new Torte( this.bezeichnung,
        this.zutaten,
        this.menge,
        this.groesse,
        this.preis);
    }
}
