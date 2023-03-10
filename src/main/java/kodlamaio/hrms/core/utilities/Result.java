package kodlamaio.hrms.core.utilities;

public class Result {
	private boolean success;
	private String message;

	public Result(boolean success) {
		this.success = success;
	}
	
	public Result(boolean success, String message) {
		this(success);
		this.message = message;
	}
	
	public boolean success() {
		return this.success;
	}
	
	public String message() {
		return this.message;
	}
	
}
