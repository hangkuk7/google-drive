package googledrive.domain;

import googledrive.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "videoStores",
    path = "videoStores"
)
public interface VideoStoreRepository
    extends PagingAndSortingRepository<VideoStore, Long> {}
