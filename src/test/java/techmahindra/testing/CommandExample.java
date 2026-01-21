package techmahindra.testing;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class CommandExample
{
    public static double calculateWeight() {
        double weight = 0;
        // Calculate weight
        return weight;
    }

    public static List<Double> calculateOnShipments(
            List<CommandExample> l, Function<CommandExample, Double> f) {
        List<Double> results = new ArrayList<>();
        for(CommandExample s : l) {
            results.add(f.apply(s));
        }
        return results;
    }

    public static void main(String[] args) {
        List<CommandExample> l = new ArrayList<CommandExample>();
        // Using a lambda expression
        calculateOnShipments(l, s -> s.calculateWeight());

    }
}
