package pl.sda.other;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class MailServerTest {

    String host = "http://sda.pl";
    String protocol = "SMTP";
    int port = 8081;
    int buffer = 1000;

    MailServer ms = new MailServer(port, buffer, host, protocol);

    @Before
    public void setup() {
        //ms.buffer = 99;
        System.out.println("@Before - setup");
    }

    //zyjaca dokumentacja
    @Test
    public void create() {
        System.out.println("--- create ---");
        ms.initServer();
        ms.initHost();
        ms.initPort();
        ms.initProtocol();
        ms.initBuffer();
    }

    @Test
    public void demo() {
        System.out.println("--- demo ---");
        //ms.buffer = 99;
        ms.initServer();
        ms.initBuffer();

        assertTrue(ms.isInitialized);   //zamiast assertEquals(true, ms.Initialized)
    }

}
