package cleanarchitecture.com.br.controller;

import cleanarchitecture.com.br.model.Asset;
import cleanarchitecture.com.br.service.AssetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/assets")
public class AssetController {
    private final AssetService assetService;

    @Autowired
    public AssetController(AssetService assetService) {
        this.assetService = assetService;
    }

    @PostMapping
    public Asset createAsset(@RequestBody Asset asset) {
        return assetService.saveAsset(asset);
    }
}
