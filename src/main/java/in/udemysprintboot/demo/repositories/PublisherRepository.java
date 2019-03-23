package in.udemysprintboot.demo.repositories;

import in.udemysprintboot.demo.models.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher,Long>
{
}
