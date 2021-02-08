package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by dZanin on 08/02/21.
 */
public interface BookRepository extends CrudRepository<Book, Long> {
}
