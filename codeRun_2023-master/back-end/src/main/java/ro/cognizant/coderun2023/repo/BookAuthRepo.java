package ro.cognizant.coderun2023.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.cognizant.coderun2023.model.BookAuth;

import java.util.Optional;

@Repository
public interface BookAuthRepo extends JpaRepository<BookAuth,Long> {
    Optional<BookAuth> findBybookName(String bookName);
}
