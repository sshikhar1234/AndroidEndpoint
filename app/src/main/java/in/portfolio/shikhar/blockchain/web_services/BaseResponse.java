package in.portfolio.shikhar.blockchain.web_services;


import in.portfolio.shikhar.blockchain.utils.Constants;

/**
 * Created by Shikhar Shah on 03/18/2019
 */

public class BaseResponse implements Constants {

    private int status;
    private String message;

    public int getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }


    @Override
    public String toString() {
        return super.toString();
    }


}
