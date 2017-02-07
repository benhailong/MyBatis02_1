package cn.bdqn.pojo;

/**
 * Created by ben on 2017-02-07.
 */
public class Address {
    private Integer id;
    private Integer postCode;
    private String addressContent;
    private Integer userId;
    private String username;


    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getPostCode() {
        return postCode;
    }
    public void setPostCode(Integer postCode) {
        this.postCode = postCode;
    }
    public String getAddressContent() {
        return addressContent;
    }
    public void setAddressContent(String addressContent) {
        this.addressContent = addressContent;
    }
    public Integer getUserId() {
        return userId;
    }
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
