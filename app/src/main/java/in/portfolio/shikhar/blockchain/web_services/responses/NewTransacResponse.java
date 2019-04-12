package in.portfolio.shikhar.blockchain.web_services.responses;

import com.google.gson.annotations.SerializedName;

import in.portfolio.shikhar.blockchain.web_services.BaseResponse;

public class NewTransacResponse {

	@SerializedName("message")
	private String message;

	public void setMessage(String message){
		this.message = message;
	}

	public String getMessage(){
		return message;
	}

	@Override
 	public String toString(){
		return
			"NewTransacResponse{" +
			"message = '" + message + '\'' +
			"}";
		}
}