package uk.co.aegisphere.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@lombok.Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Data {
    private String token_id;
    private String name;

//    private String token_address;
//    private String id;
//    private String user;
//    private String status;
//    private String uri;
//    private String name;
//    private String description;
//    private String image_url;
//    private MetaData metaData;
}