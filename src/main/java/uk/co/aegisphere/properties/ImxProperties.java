package uk.co.aegisphere.properties;

import lombok.Data;

@Data
public class ImxProperties {
    private final String baseUrl = "https://api.x.immutable.com/v1/assets?page_size=100&collection=0x0b6023df2a8d06bdcc9f0b827a182ff33adbf33c&sell_orders=true&order_by=name&direction=asc&status=imx&metadata=%7B";
    private final String edition = "%22edition%22%3A%5B%22{EDITION}%22%5D%2C";
    private final String name = "%22name%22%3A%5B%22{NAME}%22%5D%2C";
    private final String rarity = "%22rarity%22%3A%5B%22{RARITY}%22%5D%2C";
    private final String season = "%22season%22%3A%5B%22{SEASON}%22%5D%7D";

}
