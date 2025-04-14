package labshopaggregate.domain;

import labshopaggregate.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(
    collectionResourceRel = "orderitems",
    path = "orderitems"
)
public interface OrderItemRepository
    extends PagingAndSortingRepository<OrderItem, Long> {}
