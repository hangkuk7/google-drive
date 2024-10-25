package googledrive.domain;

import googledrive.DriveApplication;
import googledrive.domain.FileUploaded;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "DriveStore_table")
@Data
//<<< DDD / Aggregate Root
public class DriveStore {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long userId;

    private String fileName;

    private Long fileSize;

    private Date uploadDate;

    private String fileDeatils;

    @PostPersist
    public void onPostPersist() {
        FileUploaded fileUploaded = new FileUploaded(this);
        fileUploaded.publishAfterCommit();
    }

    public static DriveStoreRepository repository() {
        DriveStoreRepository driveStoreRepository = DriveApplication.applicationContext.getBean(
            DriveStoreRepository.class
        );
        return driveStoreRepository;
    }
}
//>>> DDD / Aggregate Root
