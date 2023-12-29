package uk.co.aegisphere.model;

import lombok.Data;

@Data
public class RequestMetadata {

    private String[] edition = new String[1];
    private String[] energyCost = new String[1];
    private String[] race = new String[1];
    private String[] rarity = new String[1];

}