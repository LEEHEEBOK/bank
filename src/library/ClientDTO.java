package library;

public class ClientDTO {

	private int clientNumber;
	private String Name;
	private String Phone;
	
	ClientDTO(){}
	
	ClientDTO(int clientNumber, String Name, String Phone){
		this.clientNumber =clientNumber;
		this.Name =Name;
		this.Phone =Phone;
	}

	public int getClientNumber() {
		return clientNumber;
	}

	public void setClientNumber(int clientNumber) {
		this.clientNumber = clientNumber;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getPhone() {
		return Phone;
	}

	public void setPhone(String phone) {
		Phone = phone;
	}

	@Override
	public String toString() {
		return "ClientDTO [clientNumber=" + clientNumber 
				+ ", Name=" + Name 
				+ ", Phone=" + Phone + "]";
	}


}
