package four;

class RomanConversion {
    public String convert(int n) {
        StringBuilder resultBuffer = new StringBuilder();
        int nombreAConvertir = n;
        while (nombreAConvertir > 0) {
            if (nombreAConvertir >= 1000) {
                convertMilliers(resultBuffer);
                nombreAConvertir -= 1000;
            } else if (nombreAConvertir >= 100) {
                resultBuffer = convertCentaines(resultBuffer);
                nombreAConvertir -= 100;
            } else if (nombreAConvertir >= 10) {
                resultBuffer = convertDizaines(resultBuffer);
                nombreAConvertir -= 10;
            } else {
                resultBuffer = convertUnits(resultBuffer);
                nombreAConvertir -= 1;
            }
        }

        return resultBuffer.toString();
    }

    private void convertMilliers(StringBuilder resultBuffer) {
        resultBuffer.append("M");

    }

    private StringBuilder convertCentaines(StringBuilder resultBuffer) {
        return converter(resultBuffer, "C", "D", "M");
    }

    private StringBuilder convertDizaines(StringBuilder resultBuffer) {
        return converter(resultBuffer, "X", "L", "C");
    }

    private StringBuilder convertUnits(StringBuilder resultBuffer) {
        return converter(resultBuffer, "I", "V", "X");
    }

    private StringBuilder converter(StringBuilder toConvert, String unite, String cinqUnite, String uniteSuivante) {

        StringBuilder resultBuilder = new StringBuilder(toConvert);
        int indexOfTroisUnites = resultBuilder.indexOf(unite + unite + unite);
        if (indexOfTroisUnites != -1) {
            resultBuilder = new StringBuilder(resultBuilder.substring(0, indexOfTroisUnites));
            if (resultBuilder.indexOf(cinqUnite) != -1) {
                resultBuilder = new StringBuilder(resultBuilder.substring(0, resultBuilder.indexOf(cinqUnite)));
                resultBuilder.append(unite).append(uniteSuivante);
            } else {
                resultBuilder.append(unite).append(cinqUnite);
            }

        } else if (resultBuilder.indexOf(cinqUnite) > resultBuilder.indexOf(unite) && resultBuilder.indexOf(unite) > -1) {
            resultBuilder = new StringBuilder(resultBuilder.substring(0, resultBuilder.indexOf(unite))).append(cinqUnite);
        } else {
            resultBuilder.append(unite);
        }
        return resultBuilder;
    }
}
