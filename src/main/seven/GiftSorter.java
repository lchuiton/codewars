package seven;

import java.util.Arrays;

class GiftSorter {

    public String sortGiftCode(String code) {
        char[] chars = code.toCharArray();
        Arrays.sort(chars);
        return String.valueOf(chars);
    }
}
