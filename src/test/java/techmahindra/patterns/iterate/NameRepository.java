package techmahindra.patterns.iterate;

//import org.apache.commons.lang3.ArrayUtils;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;

/**
 * Created by HP-USER on 25-05-2019.
 */
public class NameRepository implements Container {
    public String names[] = {"Robert" , "John" ,"Julie" , "Lora"};


    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator {

        int index;
        int arrayGrowth = 1;
        @Override
        public boolean hasNext() {

            if(index < names.length){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {

            if(this.hasNext()){
                return names[index++]; //return object at index and then increment the index.
            }
            return null;
        }

        @Override
        public void add(Object obj) {
            names = Arrays.copyOf(names, names.length + arrayGrowth);
            names[(names.length-1)] = (String)obj;
        }

        @Override
        public boolean remove(Object object){
            if(values().contains((String)(object))) {
                names = ArrayUtils.removeElement(names, object); //use inbuilt arrayUtils function.
            }else
                return false;
            return true;
        }
        String values() {
            String arrayValues="[";
            for(int i=0; i < names.length; i++){
                arrayValues+=names[i] + " ";
            }
            return arrayValues.trim() + "]";
        }

    }
}