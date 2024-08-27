package cleanarchitecture.com.br.service;

import cleanarchitecture.com.br.model.Asset;
import cleanarchitecture.com.br.repository.AssetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AssetService {
    private final AssetRepository assetRepository;

    @Autowired
    public AssetService(AssetRepository assetRepository) {
        this.assetRepository = assetRepository;
    }

    public Asset saveAsset(Asset asset) {
        return assetRepository.save(asset);
    }
}
