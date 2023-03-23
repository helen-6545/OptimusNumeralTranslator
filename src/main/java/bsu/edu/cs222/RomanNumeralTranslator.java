package bsu.edu.cs222;

public class RomanNumeralTranslator {

    public static String NumeralOrganizer(int input){
        int thousands=input/1000;
        input=input%1000;
        String output=thousandsTranslator(thousands);
        int hundreds=input/100;
        input=input%100;
        output=output+hundredsTranslator(hundreds);
        int tens=input/10;
        output=output+tensTranslator(tens);
        input=input%10;
        output=output+onesTranslator(input);
        return output;
    }

    public static String thousandsTranslator(int input){
        return switch (input) {
            case 1 -> "M";
            case 2 -> "MM";
            case 3 -> "MMM";
            default -> "";
        };
    }
    public static String hundredsTranslator(int input){
        return switch (input) {
            case 1 -> "C";
            case 2 -> "CC";
            case 3 -> "CCC";
            case 4 -> "CD";
            case 5 -> "D";
            case 6 -> "DC";
            case 7 -> "DCC";
            case 8 -> "DCCC";
            case 9 -> "CM";
            default -> "";
        };
    }
    public static String tensTranslator(int input){
        return switch (input) {
            case 1 -> "X";
            case 2 -> "XX";
            case 3 -> "XXX";
            case 4 -> "XL";
            case 5 -> "L";
            case 6 -> "LX";
            case 7 -> "LXX";
            case 8 -> "LXXX";
            case 9 -> "XC";
            default -> "";
        };
    }
    public static String onesTranslator(int input){
        return switch (input) {
            case 1 -> "I";
            case 2 -> "II";
            case 3 -> "III";
            case 4 -> "IV";
            case 5 -> "V";
            case 6 -> "VI";
            case 7 -> "VII";
            case 8 -> "VIII";
            case 9 -> "IX";
            default -> "";
        };
    }
    public static boolean OutOfRangeCheck(int input){
        return (input >= 1) && (input <= 3000);
    }
}
