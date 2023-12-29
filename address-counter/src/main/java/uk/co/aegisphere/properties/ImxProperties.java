package uk.co.aegisphere.properties;

import lombok.Data;

@Data
public class ImxProperties {
    private final String baseUrl = "https://api.x.immutable.com/v1/assets?user={ADDRESS}";
}
