package googledrive.domain;

import googledrive.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "indexerStores",
    path = "indexerStores"
)
public interface IndexerStoreRepository
    extends PagingAndSortingRepository<IndexerStore, Long> {}
