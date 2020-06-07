package pl.sda.other;

import org.junit.Test;

public class MailServerTest {

    //zyjaca dokumentacja
    @Test
    public void create() {
        String host = "http://sda.pl";
        String protocol = "SMTP";
        int port = 8081;
        int buffer = 1000;

        MailServer ms = new MailServer(port, buffer, host, protocol);

        ms.initServer();
        ms.initHost();
        ms.initPort();
        ms.initProtocol();
        ms.initBuffer();
    }

}
