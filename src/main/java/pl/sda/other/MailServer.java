package pl.sda.other;

/**
 * Mail server is used to send mails.
 * After creating an object, remember to initialize its components in following order:
 * host, port, protocol, buffer
 */
public class MailServer {

    int port, buffer;
    private String host, protocol;
    boolean isInitialized;

    public MailServer(int port, int buffer, String host, String protocol) {
        this.port = port;
        this.buffer = buffer;
        this.host = host;
        this.protocol = protocol;
    }

    public void initPort() {
        checkInit();
    };
    public void initBuffer() {
        checkInit();
    };
    public void initHost() {
        checkInit();
    };
    public void initProtocol() {
        checkInit();
    };
    public void initServer() {
        this.isInitialized = true;
    };
    private void checkInit() {
        if(!isInitialized || buffer < 100)
            throw new IllegalStateException();
    }

}
