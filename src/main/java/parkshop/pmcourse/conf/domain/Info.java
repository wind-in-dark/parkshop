package parkshop.pmcourse.conf.domain;

import javax.servlet.http.HttpServletRequest;

import lombok.*;

/**
 * 个人信息实体
 */
@Setter
@Getter
/*@NoArgsConstructor*/
@ToString
public class Info {
	
	private Integer id;//用户ID
    private String username;//用户名
    private String password;//md5加密后的密码
    private String email;//邮箱,默认为#
    private String github;//github地址，默认为#
    private String twitter;//twitter地址，默认为#
    private String md;//简历的markdown文本，为了admin管理时能够回显
    private String resume;//简历的html文本
    private String Avatar;//头像地址
    // 外部访问的 Url
    private String visitorUrl;
    public String getVisitorUrl() {
		return visitorUrl;
	}
    // 游客访问的当前用户的路径,数据库中不存此字段。跟用户名相关，动态生成。
	public void setVisitorUrl(HttpServletRequest request) {
		this.visitorUrl = "http://"+request.getServerName()+"/visitor/"+username+"/";
	}
	public Info(String username, String password){
    	this.username=username;
    	this.password=password;    	
    }
    public Info(String username){
    	this.username=username;   	
    }
    public Info(Integer id,String username, String password){
    	this.id=id;
    	this.username=username;
    	this.password=password;    	
    }
    public Info(Integer id){
    	this.id=id;    	
    }
    public Info(){}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGithub() {
		return github;
	}
	public void setGithub(String github) {
		this.github = github;
	}
	public String getTwitter() {
		return twitter;
	}
	public void setTwitter(String twitter) {
		this.twitter = twitter;
	}
	public String getMd() {
		return md;
	}
	public void setMd(String md) {
		this.md = md;
	}
	public String getResume() {
		return resume;
	}
	public void setResume(String resume) {
		this.resume = resume;
	}
	public String getAvatar() {
		return Avatar;
	}
	public void setAvatar(String avatar) {
		Avatar = avatar;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
}
