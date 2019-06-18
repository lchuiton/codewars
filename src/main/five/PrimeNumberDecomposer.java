package five;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static util.MathUtil.isPrimeNumber;

class PrimeNumberDecomposer {

    private static Long getNextFactor(Long nombreRestant) {
        for (Long i =
             Long.valueOf("2"); i <= nombreRestant; i++) {
            if (isPrimeNumber(i) && nombreRestant % i == 0) {
                return i;
            }
        }
        return nombreRestant;
    }

    public Long[] getAllPrimeFactors(long n) {
        List<Long> listeDesFacteurs = new ArrayList<>();
        Long nombreRestant = n;
        while (!isPrimeNumber(nombreRestant)) {
            Long nextFactor = getNextFactor(nombreRestant);
            listeDesFacteurs.add(nextFactor);
            nombreRestant = nombreRestant / nextFactor;
        }
        if (nombreRestant > 0) {
            listeDesFacteurs.add(nombreRestant);
        }
        Long[] list = new Long[listeDesFacteurs.size()];

        for (int i = 0; i < listeDesFacteurs.size(); i++) {
            list[i] = listeDesFacteurs.get(i);
        }
        return list;
    }

    public Long[][] getUniquePrimeFactorsWithCount(long n) {
        Long[] listeDesFacteurs = getAllPrimeFactors(n);
        Map<Long, Long> map = new HashMap<>();
        for (Long facteur : listeDesFacteurs) {
            if (map.get(facteur) != null) {

                map.put(facteur, map.get(facteur) + 1);
            } else {
                map.put(facteur, Long.valueOf("1"));
            }
        }
        Long[] listeFacteur = new Long[map.keySet().size()];
        Long[] occurenceFacteur = new Long[map.keySet().size()];
        int i = 0;
        for (Map.Entry<Long, Long> entry : map.entrySet()) {
            listeFacteur[i] = entry.getKey();
            occurenceFacteur[i] = entry.getValue();
            i++;
        }
        return new Long[][]{listeFacteur, occurenceFacteur};
    }

    public Long[] getPrimeFactorPotencies(long n) {
        Long[][] listesFacteurOccurences = getUniquePrimeFactorsWithCount(n);
        Long[] listeFacteurs = listesFacteurOccurences[0];
        Long[] listeNombreOccurence = listesFacteurOccurences[1];

        Long[] listeProduitFacteur = new Long[listeFacteurs.length];

        for (int i = 0; i < listeFacteurs.length; i++) {
            listeProduitFacteur[i] = (long) Math.pow(listeFacteurs[i], listeNombreOccurence[i]);
        }

        return listeProduitFacteur;
    }

}
