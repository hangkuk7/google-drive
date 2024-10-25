package googledrive.infra;

import googledrive.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class DriveStoreHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<DriveStore>> {

    @Override
    public EntityModel<DriveStore> process(EntityModel<DriveStore> model) {
        return model;
    }
}
