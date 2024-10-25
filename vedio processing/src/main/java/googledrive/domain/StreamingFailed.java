package googledrive.domain;

import googledrive.domain.*;
import googledrive.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class StreamingFailed extends AbstractEvent {

    private Long id;

    public StreamingFailed(VideoStore aggregate) {
        super(aggregate);
    }

    public StreamingFailed() {
        super();
    }
}
//>>> DDD / Domain Event
