package googledrive.domain;

import googledrive.NotificationApplication;
import googledrive.domain.Notified;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "NotificationStore_table")
@Data
//<<< DDD / Aggregate Root
public class NotificationStore {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long userId;

    private String sendMsg;

    private Date sendDate;

    @PostPersist
    public void onPostPersist() {
        Notified notified = new Notified(this);
        notified.publishAfterCommit();
    }

    public static NotificationStoreRepository repository() {
        NotificationStoreRepository notificationStoreRepository = NotificationApplication.applicationContext.getBean(
            NotificationStoreRepository.class
        );
        return notificationStoreRepository;
    }

    //<<< Clean Arch / Port Method
    public static void notifyToUser(FileUploaded fileUploaded) {
        //implement business logic here:

        /** Example 1:  new item 
        NotificationStore notificationStore = new NotificationStore();
        repository().save(notificationStore);

        */

        /** Example 2:  finding and process
        
        repository().findById(fileUploaded.get???()).ifPresent(notificationStore->{
            
            notificationStore // do something
            repository().save(notificationStore);


         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
