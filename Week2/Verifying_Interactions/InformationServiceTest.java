import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class InformationServiceTest {

    @Test
    public void ensureRetrieveDataCalled() {
        // Create mock object
        NetworkClient mockClient = Mockito.mock(NetworkClient.class);

        // Use mock in the service
        InformationService infoService = new InformationService(mockClient);
        infoService.initiateFetch();

        // Verify interaction
        verify(mockClient).retrieveData();
    }
}