package cleanarchitecture.com.br.service;

import cleanarchitecture.com.br.model.Domain;
import cleanarchitecture.com.br.repository.DomainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DomainService {
    private final DomainRepository domainRepository;

    @Autowired
    public DomainService(DomainRepository domainRepository) {
        this.domainRepository = domainRepository;
    }

    public Domain saveDomain(Domain domain) {
        return domainRepository.save(domain);
    }
}
