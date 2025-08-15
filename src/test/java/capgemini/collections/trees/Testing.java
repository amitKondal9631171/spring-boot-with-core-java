package capgemini.collections.trees;

import com.sun.source.tree.BinaryTree;
import com.sun.source.tree.ExpressionTree;
import com.sun.source.tree.Tree;
import com.sun.source.tree.TreeVisitor;
import org.assertj.core.util.Arrays;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Testing {

    public static void main(String[] args) {
        int[] testArray = {32,12,43,52,1,4,5,62,2,32,6};
        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("X",1);
        treeMap.put("A",2);
        //Order based on key
        treeMap.entrySet().stream().iterator().forEachRemaining(System.out::println);

    }
}
