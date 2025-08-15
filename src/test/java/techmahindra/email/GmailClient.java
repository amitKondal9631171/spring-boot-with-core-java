package techmahindra.email;/*
package email;



import org.joda.time.DateTime;

import javax.mail.*;
import javax.mail.search.AndTerm;
import javax.mail.search.ComparisonTerm;
import javax.mail.search.ReceivedDateTerm;
import javax.mail.search.SearchTerm;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Properties;
import java.util.stream.Collectors;

public class GmailClient {

    private Store store;

    public GmailClient() {
        String host = "pop.gmail.com";
        String port = "995";
        String userName = "amitkondal203@gmail.com";
        String password = "ak#9631171";

        Properties properties = new Properties();
        properties.put("mail.pop3.host", host);
        properties.put("mail.pop3.port", port);
        properties.setProperty("mail.pop3.socketFactory.class","javax.net.ssl.SSLSocketFactory");
        properties.setProperty("mail.pop3.socketFactory.fallback", "false");
        properties.setProperty("mail.pop3.socketFactory.port",String.valueOf(port));

        Session session = Session.getDefaultInstance(properties, null);

        try {
            store = session.getStore("imaps");
            store.connect("imap.gmail.com", userName, password);
        } catch (MessagingException e) {
        }
    }

    public List<MailWrapper> getLastHoursMails(int hours) throws GmailClientException {
        return getLastHoursMails(hours, "[Gmail]/Todos");
    }

    public List<MailWrapper> getLastHoursMails(int hours, String inboxName) throws GmailClientException {
        Folder inbox = null;

        try {
            inbox = store.getFolder(inboxName);
            inbox.open(Folder.READ_ONLY);

            Message[] messages = inbox.search(lastHoursSearchTerm(hours));

            return Arrays.stream(messages)
                    .map(MailWrapper::instance)
                    .collect(Collectors.toList());
        } catch (MessagingException e) {
            throw new GmailClientException(e);
        } finally {
            closeFolder(inbox);
        }
    }

    public List<MailWrapper> getMailsSince(DateTime fromDate, String inboxName) throws GmailClientException {
        Folder inbox = null;

        try {
            inbox = store.getFolder(inboxName);
            inbox.open(Folder.READ_ONLY);

            Message[] messages = inbox.search(sinceSearchTerm(fromDate));

            return Arrays.stream(messages)
                    .map(MailWrapper::instance)
                    .collect(Collectors.toList());
        } catch (MessagingException e) {
            throw new GmailClientException(e);
        } finally {
            closeFolder(inbox);
        }
    }

    private SearchTerm sinceSearchTerm(DateTime fromDate) {
        DateTime rightNow = new DateTime();

        SearchTerm olderThan = new ReceivedDateTerm(ComparisonTerm.LE, rightNow.toDate());
        SearchTerm newerThan = new ReceivedDateTerm(ComparisonTerm.GE, fromDate.toDate());

        return new AndTerm(newerThan, olderThan);
    }

    private SearchTerm lastHoursSearchTerm(int hours) {
        DateTime rightNow = new DateTime();
        DateTime past = rightNow.minusHours(hours);

        SearchTerm olderThan = new ReceivedDateTerm(ComparisonTerm.LE, rightNow.toDate());
        SearchTerm newerThan = new ReceivedDateTerm(ComparisonTerm.GE, past.toDate());

        return new AndTerm(newerThan, olderThan);
    }

    private void closeFolder(Folder inbox) {
        try {
            if (inbox != null)
                inbox.close(false);
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }

}*/
