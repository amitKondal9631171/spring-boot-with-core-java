package interview;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

public class FirstNonRepeatingCharacter {


    public static void main(String[] args) {

         String incomingString = "MMY Name is amy";

        returnWithModifiedCase(incomingString);

        returnWithOutModifiedCase(incomingString);
    }

    private static void returnWithModifiedCase(String incomingString) {
        Character v = incomingString
                 .chars()
                 .mapToObj(c -> Character.toLowerCase((char) c))// .mapToObj(c -> (char) c) --> without ignore case
                 .collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()))
                 .entrySet()
                 .stream()
                 .filter(entry -> entry.getValue() == 1)
                 .map(Map.Entry::getKey)
                 .findFirst()
                 .orElse(null);

        System.out.println(v);
    }

    private static void  returnWithOutModifiedCase(String incomingString){
       //record Pair(char original, char normalized) {}

      Character character = incomingString
               .chars()
               .mapToObj(c -> {
                   char toLowerCase = Character.toLowerCase((char) c);
                   return new Pair((char) c, toLowerCase);
               })
               .collect(Collectors.groupingBy(pair -> pair.normalized, LinkedHashMap::new, Collectors.counting()))
               .entrySet()
               .stream()
               .filter(e -> e.getValue() == 1)
               .map(pair ->
                    incomingString.chars()
                           .mapToObj(c -> (char) c)
                           .filter(ch -> Character.toLowerCase(ch) == pair.getKey() )
                           .findFirst()
                           .orElse(null)
               ).filter(Objects::nonNull)
               .findFirst()
               .orElse(null);

       System.out.println(character);

   }

    static class Pair{

        char original; char normalized;

        public Pair(char original, char normalized) {
            this.original = original;
            this.normalized = normalized;
        }

        public char getOriginal() {
            return original;
        }

        public void setOriginal(char original) {
            this.original = original;
        }

        public char getNormalized() {
            return normalized;
        }

        public void setNormalized(char normalized) {
            this.normalized = normalized;
        }
    }
}


