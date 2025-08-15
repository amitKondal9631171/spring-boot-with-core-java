package techmahindra.patterns.iterate;

/**
 * Created by HP-USER on 25-05-2019.
 */
public interface Iterator {
    public boolean hasNext();
    public Object next();
    public void add(Object obj);
    public boolean remove(Object object);
}
