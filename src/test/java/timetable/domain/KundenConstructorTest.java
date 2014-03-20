
package timetable.domain;

import java.util.Arrays;
import java.util.Collection;
import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(value = Parameterized.class)
public class KundenConstructorTest {

    private final String name;

    private final Date gebDat;
    
    private final String adresse;
    
    private final String ort;
    
    private final String plz;

    public KundenConstructorTest(String name, Date gebDat, String adresse, String ort, String plz) {
        this.name = name;
        this.gebDat = gebDat;
        this.adresse = adresse;
        this.ort = ort;
        this.plz = plz;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][]{ //
                {"Erik Schwienbacher", null,"Taubergasse","Wien","1170"}
                
               };
        return Arrays.asList(data);
    }

    @Test(expected = IllegalArgumentException.class)
    public void whenCreatingWithNullArguments() {
        new Kunde( this.name,
        this.gebDat,
        this.adresse,
        this.ort,
        this.plz);
    }
}
