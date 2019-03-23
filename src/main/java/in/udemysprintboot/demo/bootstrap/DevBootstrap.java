package in.udemysprintboot.demo.bootstrap;

import in.udemysprintboot.demo.models.Author;
import in.udemysprintboot.demo.models.Book;
import in.udemysprintboot.demo.models.Publisher;
import in.udemysprintboot.demo.repositories.AuthorRepository;
import in.udemysprintboot.demo.repositories.BookRepository;
import in.udemysprintboot.demo.repositories.PublisherRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent>
{

    private AuthorRepository authorRepository;
    private BookRepository bookRepository;
    private PublisherRepository publisherRepository;

    public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent)
    {
      initData();
    }

    private void initData()
    {
        Publisher pub = new Publisher();
        pub.setName("foo");
        publisherRepository.save(pub);
        //Eric
        Author eric = new Author("Eric","Evans");
        Book ddd = new Book("Domain Driven Design","1234",pub);
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);

        authorRepository.save(eric);
        bookRepository.save(ddd);


    }
}
