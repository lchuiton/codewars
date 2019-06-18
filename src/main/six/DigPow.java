package six;

class DigPow {

    public static long digPow(int n, int p) {
        char[] chiffresArray = String.valueOf(n).toCharArray();
        int[] chiffres = new int[chiffresArray.length];
        for (int i = 0; i < chiffres.length; i++) {
            chiffres[i] = Character.getNumericValue(chiffresArray[i]);
        }

        int sommeDesPuissances = 0;
        for (int i = 0; i < chiffres.length; i++) {
            sommeDesPuissances += Math.pow(chiffres[i], p + i);
        }

        if (sommeDesPuissances % n != 0) {

            return -1;
        }
        return sommeDesPuissances / n;
    }
}
