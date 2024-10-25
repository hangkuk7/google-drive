package googledrive.infra;

import googledrive.config.kafka.KafkaProcessor;
import googledrive.domain.*;
import java.io.IOException;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class FilePageViewHandler {

    //<<< DDD / CQRS
    @Autowired
    private FilePageRepository filePageRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whenFileUploaded_then_CREATE_1(
        @Payload FileUploaded fileUploaded
    ) {
        try {
            if (!fileUploaded.validate()) return;

            // view 객체 생성
            FilePage filePage = new FilePage();
            // view 객체에 이벤트의 Value 를 set 함
            filePage.setFileId(String.valueOf(fileUploaded.getId()));
            filePage.setFileSize(fileUploaded.getFileSize());
            filePage.setFileName(fileUploaded.getFileName());
            // view 레파지 토리에 save
            filePageRepository.save(filePage);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //>>> DDD / CQRS
}
