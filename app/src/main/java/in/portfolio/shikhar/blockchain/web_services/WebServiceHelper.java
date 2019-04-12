
package in.portfolio.shikhar.blockchain.web_services;


import org.json.JSONObject;

import java.util.concurrent.TimeUnit;

import in.portfolio.shikhar.blockchain.App;
import in.portfolio.shikhar.blockchain.R;
import in.portfolio.shikhar.blockchain.models.MineDataModel;
import in.portfolio.shikhar.blockchain.models.TransactionReqDataModel;
import in.portfolio.shikhar.blockchain.utils.Constants;
import in.portfolio.shikhar.blockchain.web_services.responses.ChainResponse;
import in.portfolio.shikhar.blockchain.web_services.responses.MineResponse;
import in.portfolio.shikhar.blockchain.web_services.responses.NewTransacResponse;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


/**
 * Created by Shikhar Shah on 03/18/2019
 */
public class WebServiceHelper implements Constants {

    private static String baseUrl = App.getAppInstance().getString(R.string.base_url);

    private static OkHttpClient getClient() {
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        return
                new OkHttpClient.Builder()
                        .addInterceptor(interceptor)
                        .readTimeout(READ_TIMEOUT, TimeUnit.SECONDS)
                        .connectTimeout(CONNECT_TIMEOUT, TimeUnit.SECONDS)
                        .build();
    }

    private static Retrofit getRetrofit() {
        return new Retrofit.Builder()
                .baseUrl(baseUrl)
                .client(getClient())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public static Call<NewTransacResponse> getNewTransactionCall(TransactionReqDataModel requestTransaction)
    {

        return getRetrofit().create(RequestAPIs.class)
                .newTransactionCall(requestTransaction);



    }

    public static Call<ChainResponse> getChainCall()
    {

        return getRetrofit().create(RequestAPIs.class)
                .chainCall();
    }

    public static Call<MineDataModel> getMineCall()
    {

        return getRetrofit().create(RequestAPIs.class)
                .mineCall();
    }


}
