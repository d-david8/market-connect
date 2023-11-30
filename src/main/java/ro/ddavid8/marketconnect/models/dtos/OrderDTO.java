package ro.ddavid8.marketconnect.models.dtos;

import lombok.Data;

@Data
public class OrderDTO {

    private Long id;
    private String address;
    private double orderValue;
}
