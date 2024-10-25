package googledrive.domain;

import googledrive.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "driveStores",
    path = "driveStores"
)
public interface DriveStoreRepository
    extends PagingAndSortingRepository<DriveStore, Long> {}
