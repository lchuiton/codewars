package seven;

public class NumberOfVowels {

  public static int getCount(String chaineInitiale) {
    int longueurInitiale = chaineInitiale.length();

    String chaineSansVoyelles = chaineInitiale;

    chaineSansVoyelles = chaineSansVoyelles.replace("a", "");
    chaineSansVoyelles = chaineSansVoyelles.replace("e", "");
    chaineSansVoyelles = chaineSansVoyelles.replace("i", "");
    chaineSansVoyelles = chaineSansVoyelles.replace("o", "");
    chaineSansVoyelles = chaineSansVoyelles.replace("u", "");

    return longueurInitiale - chaineSansVoyelles.length();
  }

}
