package cleanarchitecture.com.br.controller;

import cleanarchitecture.com.br.model.Domain;
import cleanarchitecture.com.br.service.DomainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/domains")
public class DomainController {
    private final DomainService domainService;

    @Autowired
    public DomainController(DomainService domainService) {
        this.domainService = domainService;
    }

    @PostMapping
    public Domain createDomain(@RequestBody Domain domain) {
        return domainService.saveDomain(domain);
    }
}
