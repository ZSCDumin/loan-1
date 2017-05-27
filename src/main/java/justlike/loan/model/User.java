package justlike.loan.model;

public class User {
	 private Integer id;

	    private String name;

	    private String mobile;

	    private String address;

	    private String idcard;

	    public Integer getId() {
	        return id;
	    }

	    public void setId(Integer id) {
	        this.id = id;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name == null ? null : name.trim();
	    }

	    public String getMobile() {
	        return mobile;
	    }

	    public void setMobile(String mobile) {
	        this.mobile = mobile == null ? null : mobile.trim();
	    }

	    public String getAddress() {
	        return address;
	    }

	    public void setAddress(String address) {
	        this.address = address == null ? null : address.trim();
	    }

	    public String getIdcard() {
	        return idcard;
	    }

	    public void setIdcard(String idcard) {
	        this.idcard = idcard == null ? null : idcard.trim();
	    }
}
