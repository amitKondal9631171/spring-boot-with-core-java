package techmahindra.patterns.adaptor;

/**
 * Created by HP-USER on 24-05-2019.
 */
public class SocketClassAdapterImpl   implements SocketAdapter{

    @Override
    public Volt get120Volt() {
        return new Volt(120);
    }

    @Override
    public Volt get12Volt() {
        return convertVolt(new Volt(120),10);
    }

    @Override
    public Volt get3Volt() {
        return convertVolt(new Volt(120),40);
    }

    private Volt convertVolt(Volt v, int i) {
        return new Volt(v.getVolts()/i);
    }

}
