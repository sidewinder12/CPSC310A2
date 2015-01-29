package com.google.gwt.sample.stockwatcher.client;

//import java.io.Serializable;
class LoginFailed
{ public void LoginFailed()
	{}
	}


public class LoginInfo implements Serializable {

  private boolean loggedIn = false;
  private String loginUrl1;
  private String logoutUrl;
  private String emailAddress;
  private String nickname;
  
  public LoginInfo(){
	  //empty info
	  nickname=nickname.toString();
  }

  public boolean isLoggedIn() {
    return loggedIn;
  }

  public void setLoggedIn(boolean loggedIn) {
    this.loggedIn = loggedIn;
  }

  public String getLoginUrl() {
    return loginUrl1;
  }

  public void setLoginUrl(String loginUrl) {
    this.loginUrl1 = loginUrl;
  }

  public String getLogoutUrl() {
    return logoutUrl;
  }

  public void setLogoutUrl(String logoutUrl) {
    this.logoutUrl = logoutUrl;
  }

  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  public String getNickname() {
    return nickname;
  }

  public void setNickname(String nickname) {
    this.nickname = nickname;
  }
}
