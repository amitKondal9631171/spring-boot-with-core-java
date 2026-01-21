package interview;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Practise {

    static void intArrayToStreamOperation(){


        int[] input = {3,2,3,4,5,6,3,2,3,5};

        int sumOfIntArray = Arrays.stream(input).boxed().mapToInt(v->v).sum();
        System.out.println("Sum of Int Array: "+ sumOfIntArray);


        System.out.println("Avg: " +  Arrays.stream(input).boxed().mapToInt(v->v).average().orElse(0));

        System.out.println("Min: " +  Arrays.stream(input).boxed().mapToInt(v->v).min());

        System.out.println("Max: " +  Arrays.stream(input).boxed().mapToInt(v->v).max());

        System.out.println("Distinct: " +  Arrays.stream(input).boxed().mapToInt(v->v).distinct().count());


        System.out.println("Count: " +  Arrays.stream(input).count());

    }

    static void replaceFirstKElements(){

        int[] input = {1,2,3,4,5,6,7,8,9};

        int k = 5;

        Integer[] response = IntStream.range(0, input.length)
                .mapToObj(counter -> counter < k ? input[input.length - k - counter] : input[counter])
                .toArray(Integer[]::new);

        System.out.println("Replace first K integers and return stream response in array: " + Arrays.toString(response) );

    }

    static void replaceFirstKStringElements(){

        String[] input = {"Amit", "kondal", "Is", "living", "in", "samela","with", "familiy", "Will", "go", "back", "next", "month"};

        int k = 5;

        String response = IntStream.range(0, input.length)
                 .mapToObj(counter -> counter < k ? input[k-1-counter] : input[counter])
                 .collect(Collectors.joining(" , " , "[" , "]"));
        System.out.println(response);
    }

    static void frequencyOfCharArrays(){
        char[] characters = {'a','m','i','t', ' ' , 'k', 'o','n','d','a','l'};

        Map<Character,Long> response = IntStream.range(0, characters.length)
                .mapToObj(rangeCounter -> characters[rangeCounter])
                .collect(Collectors.groupingBy(v -> v  , Collectors.counting()));


        System.out.println(response);
    }

    static void firstNonRepeatingCharArrays(){
        char[] characters = {'a','m','i','t', 'm' , 'k', 'o','n','d','a','l'};

        Optional<Character> response = IntStream.range(0, characters.length)
                .mapToObj(rangeCounter -> characters[rangeCounter])
                .collect(Collectors.groupingBy(v -> v  , LinkedHashMap::new, Collectors.counting()))
                        .entrySet().stream()
                        .filter(e -> e.getValue()== 1)
                                .map(Map.Entry::getKey)
                                        .findFirst();



        System.out.println("First non repeating character: " + response.orElse(null));
    }

    static void countVowelsFromCharArrays(){
        char[] characters = {'a','m','i','t', 'm' , 'k', 'o','n','d','a','l'};

       Long response = IntStream.range(0, characters.length)
                .mapToObj(rangeCounter -> Character.toLowerCase(characters[rangeCounter]))
                        .filter(v-> "aeiou".contains(String.valueOf(v)))
                                .count();



        System.out.println("Number of Vowels in array: " +  response);
    }

    static void charToString(){
        char[] characters = {'a','m','i','t',' ' , 'k', 'o','n','d','a','l'};


        String string = new String(characters);

        System.out.println(string);
    }

    static void convertCharactersToUpperCase(){
        char[] characters = {'a','m','i','t',' ' , 'k', 'o','n','d','a','l'};

        System.out.println("character value: " + ( (char) 32));
        List<Integer> intList = IntStream.range(0, characters.length)
                                .map(i -> characters[i])
                                .map(v->(char)v)  // this won't convert ASCII value to character as above because IntStream works with integers only. In this case its internally convert again back to int.
                                .boxed() // convert integers to object
                                .toList();


        char[] response = IntStream.range(0, characters.length)
                .map(i -> Character.toUpperCase(characters[i]))
                .collect(StringBuilder::new
                ,StringBuilder::append, //this will store the current element
                StringBuilder::append) // this will take the element from previous append and will append finally
                .toString().toCharArray();


        System.out.println(" Characters to upperCase: "+ response);


        String[] strArray = {"Amit","kondal"};

        IntStream.range(0, strArray.length)
                .mapToObj(v -> strArray[strArray.length - 1 - v ])
                .forEach(System.out::println);

    }

    static void checkAllCharactersAreUnique(){
        char[] characters = {'a','m','i','t',' ' , 'k', 'o','n','d','a','l'};

        boolean isUniqueArrayOfChars = IntStream.range(0, characters.length)
                .mapToObj(v -> characters[v])
                .distinct().count() == characters.length;

        System.out.println("Unique char array: " + isUniqueArrayOfChars);
    }

    static void maxOccuringChar() {
        char[] characters = {'a', 'm', 'i', 't', ' ', 'k', 'o', 'n', 'd', 'a', 'l' };

        Optional<Map.Entry<Character, Long>> chars = IntStream.range(0,characters.length)
                .mapToObj(c -> characters[c])
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .stream().findFirst();

        Map.Entry<Character, Long> test = chars.orElse(null);

        assert test != null;
        System.out.println("max occ char in array: "+ test.getKey());
    }
        public static void main(String[] args) {
        intArrayToStreamOperation();

        charToString();

        replaceFirstKElements();

        replaceFirstKStringElements();

        frequencyOfCharArrays();

        firstNonRepeatingCharArrays();

        countVowelsFromCharArrays();

        convertCharactersToUpperCase();

        checkAllCharactersAreUnique();

        maxOccuringChar();
    }
}
