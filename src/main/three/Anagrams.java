package three;

import util.MathUtil;

import java.math.BigInteger;
import java.util.*;

import static java.math.BigInteger.ONE;
import static java.math.BigInteger.ZERO;

class Anagrams {

    private Anagrams() {

    }

    public static BigInteger listPosition(String word) {
        char[] listChars = word.toCharArray();
        StringBuilder alphabetOfTheWord = new StringBuilder();
        List<String> listLetters = new ArrayList<>();
        for (char listChar : listChars) {
            listLetters.add(String.valueOf(listChar));
        }
        Collections.sort(listLetters);
        Map<String, BigInteger> map = new HashMap<>();
        for (String s : listLetters) {
            if (map.get(s) != null) {
                map.put(s, map.get(s).add(ONE));
            } else {
                alphabetOfTheWord.append(s);
                map.put(s, ONE);
            }
        }

        BigInteger indexDeLAnagramme = ONE;
        StringBuilder writed = new StringBuilder();
        int i = 0;
        while (!writed.toString().equals(word)) {
            String lettreCourante = String.valueOf(alphabetOfTheWord.charAt(i));

            map.put(lettreCourante, map.get(lettreCourante).subtract(ONE));
            if (word.substring(0, writed.length() + 1).equals(writed.toString() + lettreCourante)) {
                if (map.get(lettreCourante).equals(ZERO)) {
                    alphabetOfTheWord.deleteCharAt(i);
                }
                writed.append(lettreCourante);
                i = 0;
            } else {
                i++;
                long fact = (long) (word.length() - (writed.length() + 1));
                indexDeLAnagramme = indexDeLAnagramme.add(MathUtil.factorial(BigInteger.valueOf(fact)).divide(produitDesFactorielles(map)));
                map.put(lettreCourante, map.get(lettreCourante).add(ONE));
            }
        }

        return indexDeLAnagramme;
    }

    private static BigInteger produitDesFactorielles(Map<String, BigInteger> map) {
        BigInteger produitFact = BigInteger.ONE;
        for (Map.Entry<String, BigInteger> entry : map.entrySet()) {
            produitFact = produitFact.multiply(MathUtil.factorial(entry.getValue()));

        }
        return produitFact;

    }
}