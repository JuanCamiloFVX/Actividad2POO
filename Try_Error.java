
public class Try_Error extends Exception {
	
	private String message;

	

	public Try_Error(String message) {
		
		this.message = message;
		
	}
	

	 public String getMessage() {
	        return this.message;
	    }

	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
