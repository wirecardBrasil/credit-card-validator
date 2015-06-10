package br.com.moip.creditcard;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class EloCreditCard {

    private static Set<String> ELO_BINS = new TreeSet<String>(Arrays.asList(
            "50670", "50671", "50672", "50673", "50674", "50675", "50676", "50900", "50901", "50902",
            "50903", "50904", "50905", "50906", "50907", "401178", "401179", "431274", "438935", "451416",
            "457393", "457631", "457632", "504175", "506699", "506770", "506771", "506772", "506773", "506774",
            "506775", "506776", "506777", "506778", "509080", "509081", "509082", "509083", "627780", "636297"
    ));

    public static boolean isBrandElo(final String number) {
        return number != null
                && number.length() == 16
                && (ELO_BINS.contains(number.substring(0, 5)) || ELO_BINS.contains(number.substring(0, 6)));
    }
}

