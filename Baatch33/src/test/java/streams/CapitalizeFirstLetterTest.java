package streams;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
public class CapitalizeFirstLetterTest {
    @Test
    public void testCapitalizeFirstLetter(){
        String[] s = new String[]{"apple","banana","kiwi","cherry"};
        String[] s1 = new String[]{"Apple","Banana","Cherry","Kiwi"};
        assertEquals(s1,CapitalizeFirstLetter.capitalizeFirstLetter(s));
    }
}
