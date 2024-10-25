package googledrive.domain;

import googledrive.VedioProcessingApplication;
import googledrive.domain.StreamingFailed;
import googledrive.domain.StreamingProcessed;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "VideoStore_table")
@Data
//<<< DDD / Aggregate Root
public class VideoStore {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long fileId;

    private String videoUrl;

    private Long userId;

    @PostPersist
    public void onPostPersist() {
        StreamingProcessed streamingProcessed = new StreamingProcessed(this);
        streamingProcessed.publishAfterCommit();

        StreamingFailed streamingFailed = new StreamingFailed(this);
        streamingFailed.publishAfterCommit();
    }

    public static VideoStoreRepository repository() {
        VideoStoreRepository videoStoreRepository = VedioProcessingApplication.applicationContext.getBean(
            VideoStoreRepository.class
        );
        return videoStoreRepository;
    }

    //<<< Clean Arch / Port Method
    public static void processStreaming(FileUploaded fileUploaded) {
        //implement business logic here:

        /** Example 1:  new item 
        VideoStore videoStore = new VideoStore();
        repository().save(videoStore);

        */

        /** Example 2:  finding and process
        
        repository().findById(fileUploaded.get???()).ifPresent(videoStore->{
            
            videoStore // do something
            repository().save(videoStore);


         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
