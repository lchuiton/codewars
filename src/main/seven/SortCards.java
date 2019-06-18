package seven;

import java.util.*;

class SortCards {

    public String[] sortCards(String[] cards) {
        List<String> orderOfCards = new ArrayList<>();
        Collections.addAll(orderOfCards, "A", "2", "3", "4", "5", "6", "7", "8", "9", "T", "J", "Q", "K");

        Map<String, Integer> occurenceOfCards = initializeOccurenceOfCards(orderOfCards);

        for (String card1 : cards) {
            occurenceOfCards.put(card1, occurenceOfCards.get(card1) + 1);
        }

        String[] collection = new String[cards.length];
        int indexDeLaCarte = 0;
        for (String card : orderOfCards) {
            for (int i = 0; i < occurenceOfCards.get(card); i++) {
                collection[indexDeLaCarte] = card;
                indexDeLaCarte++;
            }
        }

        return collection;
        // / Fill me
    }

    private Map<String, Integer> initializeOccurenceOfCards(List<String> orderOfCards) {
        Map<String, Integer> occurence = new HashMap<>();
        for (String string : orderOfCards) {
            occurence.put(string, 0);
        }
        return occurence;
    }
}
