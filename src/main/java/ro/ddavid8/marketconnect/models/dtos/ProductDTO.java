package ro.ddavid8.marketconnect.models.dtos;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Builder;
import lombok.Data;
import ro.ddavid8.marketconnect.models.enums.ProductCategory;

@Data
@Builder
public class ProductDTO {

    @Schema(accessMode = Schema.AccessMode.READ_ONLY)
    private Long id;
    @NotBlank
    private String name;
    private String description;
    @Min(0)
    private double price;
    private long availableQuantity;
    private ProductCategory productCategory;
}
