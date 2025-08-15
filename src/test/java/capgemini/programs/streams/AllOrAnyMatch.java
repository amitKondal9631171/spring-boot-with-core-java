package capgemini.programs.streams;

import java.util.List;

public class AllOrAnyMatch {

    public static void main(String[] args) {

        List<String> defaultValues = List.of("Active", "Inactive");
        String str = "active";

        String value = defaultValues.parallelStream()
                        .filter(values -> values.equalsIgnoreCase(str))
                        .findAny().orElse("Not found");

        System.out.println(value);

        boolean defaultValuesTest = defaultValues.stream().anyMatch(values -> values.equalsIgnoreCase(str));
        System.out.println(defaultValuesTest);

    }

}
