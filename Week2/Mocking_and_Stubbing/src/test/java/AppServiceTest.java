import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class AppServiceTest {

    @Test
    public void verifyStubbedApiReturnsMockedValue() {
        
        RemoteConnector mockConnector = Mockito.mock(RemoteConnector.class);

        when(mockConnector.retrieveInfo()).thenReturn("Sample Mock Response");

       
        AppService appSvc = new AppService(mockConnector);

       
        String fetched = appSvc.obtainData();
        assertEquals("Sample Mock Response", fetched);
    }
}