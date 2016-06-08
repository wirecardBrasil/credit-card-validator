package br.com.moip.creditcard;

import java.util.Arrays;
import java.util.List;

public class EloCreditCard {

    public static List<String> ELO_BINS = Arrays.asList(
            "401178", "401179", "431274", "438935", "451416", "457393", "457631", "457632", "504175", "627780",
            "636297", "636368", "636369"
    );

    public static List<String[]> ELO_RANGES = Arrays.asList(

            new String[]{"506699", "506778"},
            new String[]{"509000", "509999"},
            new String[]{"650031", "650033"},
            new String[]{"650035", "650051"},
            new String[]{"650405", "650439"},
            new String[]{"650485", "650538"},
            new String[]{"650541", "650598"},
            new String[]{"650700", "650718"},
            new String[]{"650720", "650727"},
            new String[]{"650901", "650920"},
            new String[]{"651652", "651679"},
            new String[]{"655000", "655019"},
            new String[]{"655021", "655058"}
    );

    public static boolean isBrandElo(final String number) {
        if (number == null) {
            return false;
        }
        return number.length() == 16
                && (ELO_BINS.contains(number.substring(0, 6))
                || isInEloRange(number));
    }

    private static boolean isInEloRange(final String number) {
        if (number.length() < 5) {
            return false;
        }

        for (int i = 0; i < ELO_RANGES.size(); i++) {

            int startingRange = Integer.valueOf(ELO_RANGES.get(i)[0]);
            int endingRange = Integer.valueOf(ELO_RANGES.get(i)[1]);
            Integer parsedNumber = Integer.valueOf(number.substring(0, 6));

            if (parsedNumber >= startingRange && parsedNumber <= endingRange) return true;
        }
        return false;
    }
}

