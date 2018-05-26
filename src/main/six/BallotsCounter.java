package six;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BallotsCounter {
  private BallotsCounter() {

  }

  public static String getWinner(final List<String> listOfBallots) {
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

  private static Map<String, Integer> depouillageDesVotes(final List<String> listOfBallots) {
    Map<String, Integer> numberOfVotesByCandidats = new HashMap<>();

    for (String string : listOfBallots) {
      if (numberOfVotesByCandidats.get(string) != null) {
        numberOfVotesByCandidats.put(string, numberOfVotesByCandidats.get(string) + 1);
      } else {
        numberOfVotesByCandidats.put(string, 1);
      }
    }
    return numberOfVotesByCandidats;
  }
}
