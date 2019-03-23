package in.udemysprintboot.demo.repositories;

import in.udemysprintboot.demo.models.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long>
{

}
