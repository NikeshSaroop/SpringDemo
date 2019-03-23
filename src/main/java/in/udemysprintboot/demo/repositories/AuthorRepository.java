package in.udemysprintboot.demo.repositories;



import in.udemysprintboot.demo.models.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long>
{

}
