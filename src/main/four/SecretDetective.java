package four;

import java.util.ArrayList;
import java.util.List;

public class SecretDetective {

  public String recoverSecret(char[][] triplets) {

    List<String> before = new ArrayList<>();
    List<String> after = new ArrayList<>();

    for (int i = 0; i < triplets.length; i++) {
      before.add(String.valueOf(triplets[i][0]));
      after.add(String.valueOf(triplets[i][1]));

      before.add(String.valueOf(triplets[i][1]));
      after.add(String.valueOf(triplets[i][2]));
    }

    StringBuilder resultBuilder = new StringBuilder();
    while (!before.isEmpty()) {
      String prochainCaractere = chercheProchainCaractere(before, after);
      resultBuilder.append(prochainCaractere);
      while (before.indexOf(prochainCaractere) != -1) {
        if (after.size() == 1) {
          resultBuilder.append(after.get(0));
        }
        after.remove(before.indexOf(prochainCaractere));

        before.remove(before.indexOf(prochainCaractere));
      }
    }

    return resultBuilder.toString();
  }

  private String chercheProchainCaractere(List<String> before, List<String> after) {
    for (int i = 0; i < before.size(); i++) {
      if (after.indexOf(before.get(i)) < 0) {
        return before.get(i);
      }
    }
    return null;
  }
}
