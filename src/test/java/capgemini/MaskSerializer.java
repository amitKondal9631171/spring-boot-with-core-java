package capgemini;

public class MaskSerializer   {

    public static String mask(String value) {
        return mask(value, 4, 4, '*');
    }

    public static void main(String[] args) {
        System.out.println(mask("My name is Amit"));
    }

    public static String mask(String value, int unmaskedPrefix, int unmaskedSuffix, char maskChar) {
        if (value == null) return null;
        int len = value.length();
        if (len <= unmaskedPrefix + unmaskedSuffix) {
            // show only first char and mask rest
            if (len <= 1) return value;
            StringBuilder sb = new StringBuilder();
            sb.append(value.charAt(0));
            for (int i = 1; i < len; i++) sb.append(maskChar);
            return sb.toString();
        }
        String prefix = value.substring(0, unmaskedPrefix);
        String suffix = value.substring(len - unmaskedSuffix);
        StringBuilder sb = new StringBuilder(prefix);
        for (int i = 0; i < len - unmaskedPrefix - unmaskedSuffix; i++) sb.append(maskChar);
        sb.append(suffix);
        return sb.toString();
    }
}