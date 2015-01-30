package com.google.gwt.sample.stockwatcher.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;


@RemoteServiceRelativePath("login")

public interface LoginService extends RemoteService {
  LoginInfo login(String requestUri);
  
}


Public void LoginServices(){

	  System.out.println("Login Services");
}


//public void haha throws void NullPointerException(){
//	throw new NullPointerException();
//}
