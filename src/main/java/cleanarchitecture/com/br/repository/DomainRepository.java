package cleanarchitecture.com.br.repository;

import cleanarchitecture.com.br.model.Domain;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DomainRepository  extends JpaRepository<Domain, Long>{
}
