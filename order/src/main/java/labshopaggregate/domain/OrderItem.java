package labshopaggregate.domain;

import javax.persistence.Embeddable;

import lombok.Data;

@Embeddable
@Data
public class OrderItem {

    private String productName;

    private Float price;
}
