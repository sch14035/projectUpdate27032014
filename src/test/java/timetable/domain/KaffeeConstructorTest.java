
package timetable.domain;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(value = Parameterized.class)
public class KaffeeConstructorTest {

    private final String name;

    private final Float preis;
    
    private final String menge;
    
    private final String herkunft;
    
    private final String art;
    
    private final Float alterBohne;

    public KaffeeConstructorTest(String name, Float preis,String menge,String herkunft,String art,Float alterBohne) {
        this.name = name;
        this.herkunft = herkunft;
        this.menge = menge;
        this.art = art;
        this.preis = preis;
        this.alterBohne = alterBohne;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][]{ //
                {"Ristretto",5.3f,"5","Wien","Espresso",null}, //
                {null,5.3f,"5","Wien","Espresso",5.0f},
                {"Ristretto",null,"5","Wien","Espresso",5.0f},
                {"Ristretto",5.3f,null,"Wien","Espresso",5.0f},
                {"Ristretto",5.3f,"5",null,"Espresso",5.0f},
                {"Ristretto",5.3f,"5","Wien",null,5.0f}
               };
        return Arrays.asList(data);
    }

    @Test(expected = IllegalArgumentException.class)
    public void whenCreatingWithNullArguments() {
        new Kaffee(this.name,this.preis,this.menge,this.herkunft,this.art,this.alterBohne);
    }
}

