public class InformationService {
    private NetworkClient client;

    public InformationService(NetworkClient client) {
        this.client = client;
    }

    public void initiateFetch() {
        client.retrieveData();
    }
}