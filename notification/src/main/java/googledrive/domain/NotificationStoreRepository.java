package googledrive.domain;

import googledrive.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "notificationStores",
    path = "notificationStores"
)
public interface NotificationStoreRepository
    extends PagingAndSortingRepository<NotificationStore, Long> {}
