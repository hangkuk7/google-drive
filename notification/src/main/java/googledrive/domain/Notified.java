package googledrive.domain;

import googledrive.domain.*;
import googledrive.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class Notified extends AbstractEvent {

    private Long id;
    private Long userId;
    private String sendMsg;
    private Date sendDate;

    public Notified(NotificationStore aggregate) {
        super(aggregate);
    }

    public Notified() {
        super();
    }
}
//>>> DDD / Domain Event
