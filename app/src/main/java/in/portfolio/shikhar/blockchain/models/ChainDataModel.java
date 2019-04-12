
package in.portfolio.shikhar.blockchain.models;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class ChainDataModel {


    /**
     * block_list : [{"index":1,"previous_hash":1,"proof":100,"timestamp":1.554836233648511E9,"transactions":[]},{"index":2,"previous_hash":"00c7464250efa451a6363b98af13622105376ec1037d4a6645baf6f757472810","proof":52838,"timestamp":1.554836278061326E9,"transactions":[{"amount":5,"receiver":344534,"sender":3435354345},{"amount":5,"receiver":344534,"sender":3435354345},{"amount":5,"receiver":344534,"sender":3435354345},{"amount":5,"receiver":344534,"sender":3435354345},{"amount":5,"receiver":344534,"sender":3435354345},{"amount":5,"receiver":344534,"sender":3435354345},{"amount":5,"receiver":344534,"sender":3435354345},{"amount":50,"receiver":"5c798838c44e4c42a63597e0d97cdf26","sender":"0"}]}]
     * hash_list : [{"hash":"00c7464250efa451a6363b98af13622105376ec1037d4a6645baf6f757472810","index":1},{"hash":"edce56939737779e595315b073079ac8094d57b3b8404706b51027bd3db3bfce","index":2}]
     * length : 2
     */

    private int length;
    private List<BlockListBean> block_list;
    private List<HashListBean> hash_list;

    public static ChainDataModel objectFromData(String str) {

        return new Gson().fromJson(str, ChainDataModel.class);
    }

    public static List<ChainDataModel> arrayChainDataModelFromData(String str) {

        Type listType = new TypeToken<ArrayList<ChainDataModel>>() {
        }.getType();

        return new Gson().fromJson(str, listType);
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public List<BlockListBean> getBlock_list() {
        return block_list;
    }

    public void setBlock_list(List<BlockListBean> block_list) {
        this.block_list = block_list;
    }

    public List<HashListBean> getHash_list() {
        return hash_list;
    }

    public void setHash_list(List<HashListBean> hash_list) {
        this.hash_list = hash_list;
    }

    public static class BlockListBean {
        /**
         * index : 1
         * previous_hash : 1
         * proof : 100
         * timestamp : 1.554836233648511E9
         * transactions : []
         */

        private int index;
        private int previous_hash;
        private int proof;
        private double timestamp;
        private List<MineDataModel.TransactionsBean> transactions;

        public static BlockListBean objectFromData(String str) {

            return new Gson().fromJson(str, BlockListBean.class);
        }

        public static List<BlockListBean> arrayBlockListBeanFromData(String str) {

            Type listType = new TypeToken<ArrayList<BlockListBean>>() {
            }.getType();

            return new Gson().fromJson(str, listType);
        }

        public int getIndex() {
            return index;
        }

        public void setIndex(int index) {
            this.index = index;
        }

        public int getPrevious_hash() {
            return previous_hash;
        }

        public void setPrevious_hash(int previous_hash) {
            this.previous_hash = previous_hash;
        }

        public int getProof() {
            return proof;
        }

        public void setProof(int proof) {
            this.proof = proof;
        }

        public double getTimestamp() {
            return timestamp;
        }

        public void setTimestamp(double timestamp) {
            this.timestamp = timestamp;
        }

        public List<MineDataModel.TransactionsBean> getTransactions() {
            return transactions;
        }

        public void setTransactions(List<MineDataModel.TransactionsBean> transactions) {
            this.transactions = transactions;
        }
    }

    public static class HashListBean {
        /**
         * hash : 00c7464250efa451a6363b98af13622105376ec1037d4a6645baf6f757472810
         * index : 1
         */

        private String hash;
        private int index;

        public static HashListBean objectFromData(String str) {

            return new Gson().fromJson(str, HashListBean.class);
        }

        public static List<HashListBean> arrayHashListBeanFromData(String str) {

            Type listType = new TypeToken<ArrayList<HashListBean>>() {
            }.getType();

            return new Gson().fromJson(str, listType);
        }

        public String getHash() {
            return hash;
        }

        public void setHash(String hash) {
            this.hash = hash;
        }

        public int getIndex() {
            return index;
        }

        public void setIndex(int index) {
            this.index = index;
        }
    }
}
