package techmahindra.email;/*



package email;

import org.joda.time.DateTime;

import javax.mail.*;
import javax.mail.internet.MimeBodyPart;
import javax.mail.search.AndTerm;
import javax.mail.search.ComparisonTerm;
import javax.mail.search.ReceivedDateTerm;
import javax.mail.search.SearchTerm;
import java.io.File;
import java.io.IOException;
import java.util.Properties;
import java.util.Vector;

public class EmailAttachmentReceiver {
        private String saveDirectory;
        public void setSaveDirectory(String dir) {
                this.saveDirectory = dir;
        }

        private SearchTerm lastHoursSearchTerm(int hours) {
                DateTime rightNow = new DateTime();
                DateTime past = rightNow.minusHours(hours);

                SearchTerm olderThan = new ReceivedDateTerm(ComparisonTerm.LE, rightNow.toDate());
                SearchTerm newerThan = new ReceivedDateTerm(ComparisonTerm.GE, past.toDate());

                return new AndTerm(newerThan, olderThan);
        }

        public void downloadEmailAttachments(String host, String port,String userName, String password) {
                Properties properties = new Properties();
                properties.put("mail.pop3.host", host);
                properties.put("mail.pop3.port", port);
                properties.setProperty("mail.pop3.socketFactory.class","javax.net.ssl.SSLSocketFactory");
                properties.setProperty("mail.pop3.socketFactory.fallback", "false");
                properties.setProperty("mail.pop3.socketFactory.port",String.valueOf(port));
                Session emailSession = Session.getDefaultInstance(properties);
                try {
                        Store store = emailSession.getStore("pop3");
                        store.connect(userName, password);
                        Folder folderInbox = store.getFolder("INBOX");
                        folderInbox.open(Folder.READ_ONLY);
                        Vector matchedMsgs = new Vector();
                        SearchTerm search = new SearchTerm() {
                                @Override
                                public boolean match(Message message) {
                                        String subject = null;
                                        try {
                                                subject = message.getSubject();

                                                System.out.println(subject);
                                        } catch (MessagingException e) {
                                                e.printStackTrace();
                                        }
                                        if(subject.trim().contains("Hi Amit Kondal, Google Fortune")){
                                                matchedMsgs.add(message);
                                                return true;
                                        }
                                        return false;
                                }
                        };


                         Message arrayMessages[] = folderInbox.search(search);// folderInbox.search(term);

                        // ArrayUtils.reverse(arrayMessages);
                        for (int i = 0; i < arrayMessages.length; i++) {
                                Message message = arrayMessages[i];
                                Address[] fromAddress = message.getFrom();
                                String from = fromAddress[0].toString();
                                String subject = message.getSubject();
                                String sentDate = message.getSentDate().toString();
                                String contentType = message.getContentType();
                                String messageContent = "";
                                String attachFiles = "";
                                if (contentType.contains("multipart")) {
                                        Multipart multiPart = (Multipart) message.getContent();
                                        int numberOfParts = multiPart.getCount();
                                        for (int partCount = 0; partCount < numberOfParts; partCount++) {
                                                MimeBodyPart part = (MimeBodyPart) multiPart.getBodyPart(partCount);
                                                if (Part.ATTACHMENT.equalsIgnoreCase(part.getDisposition())) {
                                                        String fileName = part.getFileName();
                                                        attachFiles += fileName + ", ";
                                                        part.saveFile(saveDirectory + File.separator + fileName);
                                                } else {
                                                        messageContent = part.getContent().toString();
                                                }
                                        }
                                        if (attachFiles.length() > 1) {
                                                attachFiles = attachFiles.substring(0, attachFiles.length() - 2);
                                        }
                                }else if (contentType.contains("text/plain") || contentType.contains("text/html")) {
                                        Object content = message.getContent();

                                        if (content != null) {
                                                messageContent = content.toString();
                                        }
                                }
                                System.out.println("Message #" + (i) + ":");
                                System.out.println("\t From: " + from);
                                System.out.println("\t Subject: " + subject);
                                System.out.println("\t Sent Date: " + sentDate);
                                System.out.println("\t Message: " + messageContent);
                                System.out.println("\t Attachments: " + attachFiles);

                        }
                        folderInbox.close(false);
                        store.close();
                } catch (AuthenticationFailedException ex){
                        System.out.println("Authentication failed with provided user name and pass");
                } catch (NoSuchProviderException ex) {
                         System.out.println("No provider for pop3.");
                         ex.printStackTrace();
                } catch (MessagingException ex) {
                        System.out.println("Could not connect to the message store");
                        ex.printStackTrace();
                } catch (IOException ex) {
                        ex.printStackTrace();
                }
        }


        public static void main(String[] args) {
        String host = "pop.gmail.com";
        String port = "995";
        String userName = "amitkondal203@gmail.com";
        String password = "ak#9631171";

        String saveDirectory = "E:/Attachment";

        EmailAttachmentReceiver receiver = new EmailAttachmentReceiver();
        receiver.setSaveDirectory(saveDirectory);
        receiver.downloadEmailAttachments(host, port, userName, password);

        }
}*/
