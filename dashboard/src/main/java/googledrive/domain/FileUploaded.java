package googledrive.domain;

import googledrive.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.Data;

@Data
public class FileUploaded extends AbstractEvent {

    private Long id;
    private Long user_id;
    private String file_name;
    private Long file_size;
    private Date upload_date;
    private String file_deatils;
}
