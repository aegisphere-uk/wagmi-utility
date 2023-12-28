package uk.co.aegisphere;

import org.springframework.web.reactive.function.client.WebClient;
import uk.co.aegisphere.model.Count;
import uk.co.aegisphere.properties.ImxProperties;
import uk.co.aegisphere.service.CardCountService;

public class Main {
    private static WebClient.Builder webClient = WebClient.builder();
    private static final ImxProperties imxProperties = new ImxProperties();

    public static void main(String[] args) {

        CardCountService cardCountService = new CardCountService(webClient, imxProperties);
        Count collectionCount = cardCountService.getCollectionDetails();
        System.out.println(collectionCount.toString());

    }
}