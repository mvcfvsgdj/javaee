package prj0907;

public class TestClass {
	String store_code;
	String store_loc;
	String store_m;
	
	public TestClass() {
		// TODO Auto-generated constructor stub
	}
	
	
	public TestClass(String store_code, String store_loc, String store_m) {
		super();
		this.store_code = store_code;
		this.store_loc = store_loc;
		this.store_m = store_m;
	}
	@Override
	public String toString() {
		return "TestClass [store_code=" + store_code + ", store_loc=" + store_loc + ", store_m=" + store_m + "]";
	}


	public String getStore_code() {
		return store_code;
	}


	public void setStore_code(String store_code) {
		this.store_code = store_code;
	}


	public String getStore_loc() {
		return store_loc;
	}


	public void setStore_loc(String store_loc) {
		this.store_loc = store_loc;
	}


	public String getStore_m() {
		return store_m;
	}


	public void setStore_m(String store_m) {
		this.store_m = store_m;
	}


	 
	
	
}
