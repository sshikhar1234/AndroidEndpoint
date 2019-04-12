
package in.portfolio.shikhar.blockchain.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class HashList {

    @SerializedName("hash")
    @Expose
    private String hash;
    @SerializedName("index")
    @Expose
    private Integer index;

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

}
