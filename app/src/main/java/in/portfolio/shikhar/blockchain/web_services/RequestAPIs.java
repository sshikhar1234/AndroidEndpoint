package in.portfolio.shikhar.blockchain.web_services;

import in.portfolio.shikhar.blockchain.models.ChainDataModel;
import in.portfolio.shikhar.blockchain.models.TransactionReqDataModel;
import in.portfolio.shikhar.blockchain.models.MineDataModel;
import in.portfolio.shikhar.blockchain.web_services.responses.ChainResponse;
import in.portfolio.shikhar.blockchain.web_services.responses.MineResponse;
import in.portfolio.shikhar.blockchain.web_services.responses.NewTransacResponse;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Multipart;
import retrofit2.http.POST;

/**
 * Interface that contains WebService requests
 * Created by Shikhar Shah Vachhani on 03/18/19.
 */
interface RequestAPIs {

    /**
     * Web Services EndPoints
     */
    /*1*/ String ENDPOINT_NEW_TRANSACTION= "transactions/new";
    /*2*/ String ENDPOINT_MINE= "mine";
    /*3*/ String ENDPOINT_CHAIN= "chain";


    @Headers("Content-Type: application/json")
    @POST(ENDPOINT_NEW_TRANSACTION)
    Call<NewTransacResponse> newTransactionCall(
            @Body TransactionReqDataModel requestTransaction
    );

    @GET(ENDPOINT_CHAIN)
    Call<ChainResponse> chainCall();

//    @Multipart
//    @POST(ENDPOINT_EDIT_PROFILE)
//    Call<UserResponse> getEditProfileCall(
//            @Part(PARAM_AUTH_KEY) RequestBody authKey,
//            @Part MultipartBody.Part image,
//            @Part(PARAM_USER_FNAME) RequestBody fname,
//            @Part(PARAM_USER_LNAME) RequestBody lname,
//            @Part(PARAM_USER_POST_CODE) RequestBody postcode
//    );
    @GET(ENDPOINT_MINE)
    Call<MineDataModel> mineCall();

}
