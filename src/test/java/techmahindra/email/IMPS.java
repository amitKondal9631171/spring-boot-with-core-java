package techmahindra.email;/*
package email;

import com.sun.mail.imap.IMAPStore;

import javax.mail.Quota;
import javax.mail.Session;
import javax.mail.Store;
import java.util.Properties;

*/
/**
 * Created by HP-USER on 26-02-2019.
 *//*

public class IMPS {
    public static void main(String[] args) {

        Properties properties = new Properties();
        properties.put("mail.store.protocol", "imaps");
        properties.put("mail.imaps.port", "993");
        properties.put("mail.imaps.starttls.enable", "true");

        Session emailSession = Session.getDefaultInstance(properties);
        try {
            Store store = emailSession.getStore("imaps");
            store.connect("imap.gmail.com", "a@gmail.com", "xyz");
            IMAPStore imapStore = (IMAPStore) store;
            Quota[] quotas = imapStore.getQuota("INBOX");
            for (Quota quota : quotas) {
                System.out.println(String.format("quotaRoot:'%s'", quota.quotaRoot));
                //Iterate through the Quota Resource
                for (Quota.Resource resource : quota.resources) {
                    System.out.println(String.format(
                            "name:'%s', limit:'%s', usage:'%s'", resource.name,
                            resource.limit, resource.usage));
                }
            }
        } catch (Exception ex) {

        }
    }
}
*/
