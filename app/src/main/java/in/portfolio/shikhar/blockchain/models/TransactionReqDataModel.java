
package in.portfolio.shikhar.blockchain.models;

import com.google.gson.annotations.SerializedName;

public class TransactionReqDataModel {

    @SerializedName("amount")
    private String  mAmount;
    @SerializedName("recipient")
    private String mRecipient;
    @SerializedName("sender")
    private String mSender;

    public TransactionReqDataModel(String mAmount, String mRecipient, String mSender) {
        this.mAmount = mAmount;
        this.mRecipient = mRecipient;
        this.mSender = mSender;
    }

    public String getAmount() {
        return mAmount;
    }

    public void setAmount(String amount) {
        mAmount = amount;
    }

    public String getRecipient() {
        return mRecipient;
    }

    public void setRecipient(String recipient) {
        mRecipient = recipient;
    }

    public String getSender() {
        return mSender;
    }

    public void setSender(String sender) {
        mSender = sender;
    }

}
