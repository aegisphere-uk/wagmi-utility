package uk.co.aegisphere;

import org.springframework.web.reactive.function.client.WebClient;
import uk.co.aegisphere.model.Count;
import uk.co.aegisphere.properties.ImxProperties;
import uk.co.aegisphere.service.LegendaryCountService;

public class Main {
    private static WebClient.Builder webClient = WebClient.builder();
    private static final ImxProperties imxProperties = new ImxProperties();

    public static void main(String[] args) {

        LegendaryCountService legendaryCount = new LegendaryCountService(webClient, imxProperties);
        Count totalLegendaries = legendaryCount.getCollectionDetails();
        System.out.println(totalLegendaries.toString());
    }
}