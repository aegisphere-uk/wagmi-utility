package uk.co.aegisphere.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Result {
    private uk.co.aegisphere.model.Data[] result;
    private String cursor;
}