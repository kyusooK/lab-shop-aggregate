package labshopaggregate.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import org.springframework.beans.BeanUtils;

@Entity
@Data
public class OrderItem {

    private Long id;

    private String productName;

    private Double price;
}
