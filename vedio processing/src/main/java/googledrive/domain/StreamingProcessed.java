package googledrive.domain;

import googledrive.domain.*;
import googledrive.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class StreamingProcessed extends AbstractEvent {

    private Long id;
    private Long fileId;
    private String videoUrl;
    private Long userId;

    public StreamingProcessed(VideoStore aggregate) {
        super(aggregate);
    }

    public StreamingProcessed() {
        super();
    }
}
//>>> DDD / Domain Event
