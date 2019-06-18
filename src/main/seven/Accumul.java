package seven;

class Accumul {

    public static String accum(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (i > 0) {
                sb.append("-");
            }
            for (int j = 0; j <= i; j++) {
                if (j == 0) {
                    sb.append(Character.toUpperCase(s.charAt(i)));
                } else {
                    sb.append(Character.toLowerCase(s.charAt(i)));
                }
            }
        }
        return sb.toString();
    }
}
