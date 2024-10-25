package googledrive.domain;

import googledrive.IndexerApplication;
import googledrive.domain.Indexed;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "IndexerStore_table")
@Data
//<<< DDD / Aggregate Root
public class IndexerStore {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long fileId;

    private Long userId;

    private String indexResult;

    @PostPersist
    public void onPostPersist() {
        Indexed indexed = new Indexed(this);
        indexed.publishAfterCommit();
    }

    public static IndexerStoreRepository repository() {
        IndexerStoreRepository indexerStoreRepository = IndexerApplication.applicationContext.getBean(
            IndexerStoreRepository.class
        );
        return indexerStoreRepository;
    }

    //<<< Clean Arch / Port Method
    public static void startIndex(FileUploaded fileUploaded) {
        //implement business logic here:

        /** Example 1:  new item 
        IndexerStore indexerStore = new IndexerStore();
        repository().save(indexerStore);

        */

        /** Example 2:  finding and process
        
        repository().findById(fileUploaded.get???()).ifPresent(indexerStore->{
            
            indexerStore // do something
            repository().save(indexerStore);


         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
