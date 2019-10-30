package seven;

class DnaStrand {

  public static String makeComplement(String dna) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < dna.length(); i++) {
      sb.append(complementaryDBA(dna.charAt(i)));
    }
    return sb.toString();
    // Your code
  }

  private static String complementaryDBA(char c) {
    switch (c) {
      case 'A':
        return "T";
      case 'T':
        return "A";
      case 'C':
        return "G";
      case 'G':
        return "C";
      default:
        break;
    }

    return null;
  }
}
