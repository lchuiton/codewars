package four;

import java.util.ArrayList;
import java.util.List;

class SecretDetective {

  public String recoverSecret(char[][] triplets) {

    List<String> before = new ArrayList<>();
    List<String> after = new ArrayList<>();

    for (char[] triplet : triplets) {
      before.add(String.valueOf(triplet[0]));
      after.add(String.valueOf(triplet[1]));

      before.add(String.valueOf(triplet[1]));
      after.add(String.valueOf(triplet[2]));
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

        before.remove(prochainCaractere);
      }
    }

    return resultBuilder.toString();
  }

  private String chercheProchainCaractere(List<String> before, List<String> after) {
    for (String aBefore : before) {
      if (after.indexOf(aBefore) < 0) {
        return aBefore;
      }
    }
    return null;
  }
}
