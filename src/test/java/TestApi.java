import com.google.gson.Gson;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.Test;
import java.io.IOException;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class TestApi {
    private final static String url = "https://api.handwrytten.com/v1/cards/list";

    @Test
    public void checkExistCart() throws IOException {

        HttpUriRequest request = new HttpGet(url);
        HttpResponse httpResponse = HttpClientBuilder.create().build().execute(request);
        String jsonString = EntityUtils.toString(httpResponse.getEntity());

        Root fromJson = new Gson().fromJson(jsonString, Root.class);

        assertEquals(httpResponse.getStatusLine().getStatusCode(), 200);
        assertTrue(fromJson.getCards().stream().anyMatch(x->x.getName().equals("Flat 5x7 Card")));
    }
}


