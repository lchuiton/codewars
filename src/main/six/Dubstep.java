package six;

public class Dubstep {

  public String songDecoder(String song) {
    return song.replaceAll("(WUB)+", " ").trim();
  }

}
