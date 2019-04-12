
package in.portfolio.shikhar.blockchain.models;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class TransactionDataModel {

    @SerializedName("amount")
    private String mAmount;
    @SerializedName("receiver")
    private String mReceiver;
    @SerializedName("sender")
    private String mSender;

    public String getAmount() {
        return mAmount;
    }

    public void setAmount(String amount) {
        mAmount = amount;
    }

    public String getReceiver() {
        return mReceiver;
    }

    public void setReceiver(String receiver) {
        mReceiver = receiver;
    }

    public String getSender() {
        return mSender;
    }

    public void setSender(String sender) {
        mSender = sender;
    }

}
