package six;

class Dubstep {

    public String songDecoder(String song) {
        return song.replaceAll("(WUB)+", " ").trim();
    }

}
