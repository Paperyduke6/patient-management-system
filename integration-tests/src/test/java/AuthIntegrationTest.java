import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class AuthIntegrationTest {
    @BeforeAll
    public static void setup() {
        RestAssured.baseURI = "http://localhost:4004" ;
    }

    @Test
    public void ShouldReturnOKWithValidToken(){

    }
}
