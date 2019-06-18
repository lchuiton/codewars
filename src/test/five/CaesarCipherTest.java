package five;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CaesarCipherTest {

    @Test
    public void test1_Codage() {
        String u = "Aa Aaaa Aaaaaa Aaaa Aaaaaaaaa.";
        List<String> v = Arrays.asList("Bc Efg", "h Jklm", "no Qrs", "t Vwxy", "zabcd.");
        assertEquals(v, CaesarCipher.movingShift(u, 1));
    }

    @Test
    public void test1_Decodage() {
        String u = "Aa Aaaa Aaaaaa Aaaa Aaaaaaaaa.";
        List<String> v = Arrays.asList("Bc Efg", "h Jklm", "no Qrs", "t Vwxy", "zabcd.");
        assertEquals(u, CaesarCipher.demovingShift(v, 1));
    }

    @Test
    public void test2_Codage() {
        String u = "I should have known that you would have a perfect answer for me!!!";
        List<String> v = Arrays.asList("J vltasl rlhr ", "zdfog odxr ypw", " atasl rlhr p ", "gwkzzyq zntyhv", " lvz wp!!!");
        assertEquals(v, CaesarCipher.movingShift(u, 1));
    }

    @Test
    public void test2_Decodage() {
        String u = "I should have known that you would have a perfect answer for me!!!";
        List<String> v = Arrays.asList("J vltasl rlhr ", "zdfog odxr ypw", " atasl rlhr p ", "gwkzzyq zntyhv", " lvz wp!!!");
        assertEquals(u, CaesarCipher.demovingShift(v, 1));
    }

    @Test
    public void test3_Codage() {
        String u = "Aa Aaaa Aaaaaa Aaaa Aaaaaaaaa.";
        List<String> v = Arrays.asList("De Ghi", "j Lmno", "pq Stu", "v Xyza", "bcdef.");
        assertEquals(v, CaesarCipher.movingShift(u, 3));
    }

    @Test
    public void test3_Decodage() {
        String u = "Aa Aaaa Aaaaaa Aaaa Aaaaaaaaa.";
        List<String> v = Arrays.asList("De Ghi", "j Lmno", "pq Stu", "v Xyza", "bcdef.");
        assertEquals(u, CaesarCipher.demovingShift(v, 3));
    }
}