package googledrive.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

//<<< EDA / CQRS
@Entity
@Table(name = "FilePage_table")
@Data
public class FilePage {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private String fileId;
    private Long fileSize;
    private String fileName;
    private String indexStatus;
    private Date uploadDate;
    private String userId;
    private String uploadStatus;
}
