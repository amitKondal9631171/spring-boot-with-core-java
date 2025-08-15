package techmahindra.access.pack2;

import techmahindra.access.pack1.DeclareSpecifiers;

/**
 * Created by vkondal on 8/12/2020.
 */
public class AccessOutSideThePackage {

    public static void main(String[] args) {
        DeclareSpecifiers obj = new DeclareSpecifiers();
        // can't access private default and protected member of class.
        //can get public members of class
    }
}
