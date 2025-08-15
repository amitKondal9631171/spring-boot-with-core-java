package techmahindra.patterns.proxy;

/**
 * Created by HP-USER on 26-05-2019.
 */
public class RealInternet implements Internet
{
    @Override
    public void connectTo(String serverhost)
    {
        System.out.println("Connecting to "+ serverhost);
    }

}