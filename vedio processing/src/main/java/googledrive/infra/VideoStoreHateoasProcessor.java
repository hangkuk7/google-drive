package googledrive.infra;

import googledrive.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class VideoStoreHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<VideoStore>> {

    @Override
    public EntityModel<VideoStore> process(EntityModel<VideoStore> model) {
        return model;
    }
}
