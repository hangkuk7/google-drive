package googledrive.infra;

import googledrive.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class NotificationStoreHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<NotificationStore>> {

    @Override
    public EntityModel<NotificationStore> process(
        EntityModel<NotificationStore> model
    ) {
        return model;
    }
}
