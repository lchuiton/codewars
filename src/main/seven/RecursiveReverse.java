package seven;

class RecursiveReverse {

    public static String reverse(String str) {
        return str.length() > 1 ? String.valueOf(str.charAt(str.length() - 1)) + reverse(str.substring(0, str.length() - 1)) : str;
    }
}
