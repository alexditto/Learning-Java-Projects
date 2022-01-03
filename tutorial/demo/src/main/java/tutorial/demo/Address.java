package tutorial.demo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
// @AllArgsConstructor
public class Address {
    private String country;
    private String city;
    private String postcode;

    Address(
        String country,
        String city,
        String postcode
    ){
        this.country = country;
        this.city = city;
        this.postcode = postcode;
    };
}
