package in.portfolio.shikhar.blockchain.web_services.responses;

import in.portfolio.shikhar.blockchain.models.ChainDataModel;
import in.portfolio.shikhar.blockchain.web_services.BaseResponse;

public class ChainResponse extends BaseResponse {
    private ChainDataModel chainDataModel;
    public ChainDataModel getChainDataModel() {
        return chainDataModel;
    }



}
