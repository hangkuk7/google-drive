package googledrive.infra;

import googledrive.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class IndexerStoreHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<IndexerStore>> {

    @Override
    public EntityModel<IndexerStore> process(EntityModel<IndexerStore> model) {
        return model;
    }
}
