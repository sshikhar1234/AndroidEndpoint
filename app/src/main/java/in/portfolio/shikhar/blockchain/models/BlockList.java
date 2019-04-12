
package in.portfolio.shikhar.blockchain.models;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BlockList {

    @SerializedName("index")
    @Expose
    private Integer index;
    @SerializedName("previous_hash")
    @Expose
    private String previousHash;
    @SerializedName("proof")
    @Expose
    private Integer proof;
    @SerializedName("timestamp")
    @Expose
    private Double timestamp;
    @SerializedName("transactions")
    @Expose
    private List<Transaction> transactions = null;

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public String getPreviousHash() {
        return previousHash;
    }

    public void setPreviousHash(String previousHash) {
        this.previousHash = previousHash;
    }

    public Integer getProof() {
        return proof;
    }

    public void setProof(Integer proof) {
        this.proof = proof;
    }

    public Double getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Double timestamp) {
        this.timestamp = timestamp;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }


}
