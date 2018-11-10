package six;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

class BallotsCounter {

  private BallotsCounter() {

  }

  public static String getWinner(List<String> listOfBallots) {
    Integer nombreDeVotesTotaux = listOfBallots.size();
    Map<String, Integer> votesParCandidats = depouillageDesVotes(listOfBallots);

    return designationDuGagnant(nombreDeVotesTotaux, votesParCandidats);

  }

  private static String designationDuGagnant(Integer nombreDeVotesTotaux, Map<String, Integer> votesParCandidats) {
    String winner = null;
    Integer nombreDeVotePourMajoriteAbsolue = nombreDeVotesTotaux / 2 + 1;

    for (Map.Entry<String, Integer> entry : votesParCandidats.entrySet()) {
      if (entry.getValue().compareTo(nombreDeVotePourMajoriteAbsolue) >= 0) {
        winner = entry.getKey();
      }
    }
    return winner;
  }

  private static Map<String, Integer> depouillageDesVotes(List<String> listOfBallots) {
    Map<String, Integer> numberOfVotesByCandidats = new HashMap<>();

    for (String string : listOfBallots) {
      numberOfVotesByCandidats.merge(string, 1, (a, b) -> a + b);
    }
    return numberOfVotesByCandidats;
  }
}
