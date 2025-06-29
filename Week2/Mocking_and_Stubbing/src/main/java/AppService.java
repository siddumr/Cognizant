public class AppService {
    private RemoteConnector connector;

    public AppService(RemoteConnector connector) {
        this.connector = connector;
    }

    public String obtainData() {
        return connector.retrieveInfo();
    }
}