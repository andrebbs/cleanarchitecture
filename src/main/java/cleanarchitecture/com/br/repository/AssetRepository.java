package cleanarchitecture.com.br.repository;

import cleanarchitecture.com.br.model.Asset;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AssetRepository  extends JpaRepository<Asset, Long>{
}
