package in.portfolio.shikhar.blockchain.models;


import android.os.Parcel;
import android.os.Parcelable;

public class NewTransacDataModel implements Parcelable {

	private String meesage;

	protected NewTransacDataModel(Parcel in) {
		meesage = in.readString();
	}

	public static final Creator<NewTransacDataModel> CREATOR = new Creator<NewTransacDataModel>() {
		@Override
		public NewTransacDataModel createFromParcel(Parcel in) {
			return new NewTransacDataModel(in);
		}

		@Override
		public NewTransacDataModel[] newArray(int size) {
			return new NewTransacDataModel[size];
		}
	};

	public NewTransacDataModel(String meesage) {
		this.meesage = meesage;
	}

	public void setMeesage(String meesage){
		this.meesage = meesage;
	}
	public String getMeesage(){
		return meesage;
	}

	@Override
 	public String toString(){
		return 
			"NewTransacDataModel{" +
			"meesage = '" + meesage + '\'' + 
			"}";
		}

	@Override
	public int describeContents() {
		return 0;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeString(meesage);
	}
}