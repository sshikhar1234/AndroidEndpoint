
package in.portfolio.shikhar.blockchain.models;

import java.util.ArrayList;
import java.util.List;

public class MineDataModel  {
    /**
     * current_hash : 33b679334216f5cc8dd188ee273ead9be173676d77b7b6efaff6d900f06ab1c1
     * index : 2
     * message : New Block Forged
     * previous_hash : 31077b12d6966568df3d9dbe81195ddc2cb5f4c6c61c16c903b50fa4a26613d0
     * proof : 52838
     * timestamp : 1.553082384571965E9
     * transactions : [{"amount":50,"receiver":"f0fcce6c177d4f47971f73a80807669d","sender":"0"}]
     */

    private String current_hash;
    private int index;
    private String message;
    private String previous_hash;
    private long proof;
    private String timestamp;
    private ArrayList<TransactionsBean> transactions;

    public String getCurrent_hash() {
        return current_hash;
    }

    public void setCurrent_hash(String current_hash) {
        this.current_hash = current_hash;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getPrevious_hash() {
        return previous_hash;
    }

    public void setPrevious_hash(String previous_hash) {
        this.previous_hash = previous_hash;
    }

    public long getProof() {
        return proof;
    }

    public void setProof(long proof) {
        this.proof = proof;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public ArrayList<TransactionsBean> getTransactions() {
        return transactions;
    }

    public void setTransactions(ArrayList<TransactionsBean> transactions) {
        this.transactions = transactions;
    }

    public static class TransactionsBean {
        /**
         * amount : 50
         * receiver : f0fcce6c177d4f47971f73a80807669d
         * sender : 0
         */

        private int amount;
        private String receiver;
        private String sender;

        public int getAmount() {
            return amount;
        }

        public void setAmount(int amount) {
            this.amount = amount;
        }

        public String getReceiver() {
            return receiver;
        }

        public void setReceiver(String receiver) {
            this.receiver = receiver;
        }

        public String getSender() {
            return sender;
        }

        public void setSender(String sender) {
            this.sender = sender;
        }
    }


//
//    /**
//     * current_hash : 741d9c9d7ff150c407a245844db3e6422482f186db9e89d169f0e09baae20a6c
//     * index : 59
//     * message : New Block Forged
//     * previous_hash : 03961b44f101c8a14f332050471da9605f0085c1d1360d242ae1d12200764cfa
//     * proof : 36563
//     * transactions : [{"amount":5,"receiver":344534,"sender":3435354345},{"amount":5,"receiver":344534,"sender":3435354345},{"amount":5,"receiver":344534,"sender":3435354345},{"amount":5,"receiver":344534,"sender":3435354345},{"amount":5,"receiver":344534,"sender":3435354345},{"amount":5,"receiver":344534,"sender":3435354345},{"amount":50,"receiver":"fe804332480842a18dc474c5fd0a0621","sender":"0"}]
//     */
//
//    private String current_hash;
//    private int index;
//    private String message;
//    private String previous_hash;
//    private int proof;
//    private ArrayList<TransactionsBean> transactions;
//
//    public String getCurrent_hash() {
//        return current_hash;
//    }
//
//    public void setCurrent_hash(String current_hash) {
//        this.current_hash = current_hash;
//    }
//
//    public int getIndex() {
//        return index;
//    }
//
//    public void setIndex(int index) {
//        this.index = index;
//    }
//
//    public String getMessage() {
//        return message;
//    }
//
//    public void setMessage(String message) {
//        this.message = message;
//    }
//
//    public String getPrevious_hash() {
//        return previous_hash;
//    }
//
//    public void setPrevious_hash(String previous_hash) {
//        this.previous_hash = previous_hash;
//    }
//
//    public int getProof() {
//        return proof;
//    }
//
//    public void setProof(int proof) {
//        this.proof = proof;
//    }
//
//    public ArrayList<TransactionsBean> getTransactions() {
//        return transactions;
//    }
//
//    public void setTransactions(ArrayList<TransactionsBean> transactions) {
//        this.transactions = transactions;
//    }
//
//    public static class TransactionsBean {
//        /**
//         * amount : 5
//         * receiver : 344534
//         * sender : 3435354345
//         */
//
//        private String amount;
//        private String receiver;
//        private String sender;
//
//        public String getAmount() {
//            return amount;
//        }
//
//        public void setAmount(String amount) {
//            this.amount = amount;
//        }
//
//        public String getReceiver() {
//            return receiver;
//        }
//
//        public void setReceiver(String receiver) {
//            this.receiver = receiver;
//        }
//
//        public String getSender() {
//            return sender;
//        }
//
//        public void setSender(String sender) {
//            this.sender = sender;
//        }
//    }
}
