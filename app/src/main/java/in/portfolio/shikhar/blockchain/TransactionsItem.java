package in.portfolio.shikhar.blockchain;

import com.google.gson.annotations.SerializedName;

public class TransactionsItem{

	@SerializedName("amount")
	private int amount;

	@SerializedName("receiver")
	private int receiver;

	@SerializedName("sender")
	private long sender;

	public void setAmount(int amount){
		this.amount = amount;
	}

	public int getAmount(){
		return amount;
	}

	public void setReceiver(int receiver){
		this.receiver = receiver;
	}

	public int getReceiver(){
		return receiver;
	}

	public void setSender(long sender){
		this.sender = sender;
	}

	public long getSender(){
		return sender;
	}

	@Override
 	public String toString(){
		return 
			"TransactionsItem{" + 
			"amount = '" + amount + '\'' + 
			",receiver = '" + receiver + '\'' + 
			",sender = '" + sender + '\'' + 
			"}";
		}
}