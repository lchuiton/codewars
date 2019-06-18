package six;

class DubstepFirst {

    public String songDecoder(String song) {
        if (song.length() < 3) {
            return song;
        }

        String songToDecode = song;
        StringBuilder decodedSong = new StringBuilder();

        int indexOfWub = songToDecode.indexOf("WUB");
        while (indexOfWub >= 0) {
            if (indexOfWub == 0) {
                songToDecode = songToDecode.substring(indexOfWub + 3);
            } else {
                decodedSong.append(songToDecode, 0, indexOfWub).append(" ");
                songToDecode = songToDecode.substring(indexOfWub);
            }
            indexOfWub = songToDecode.indexOf("WUB");
        }
        decodedSong.append(songToDecode);
        return decodedSong.toString().trim();
    }
}
