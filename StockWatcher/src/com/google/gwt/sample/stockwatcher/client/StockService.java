package com.google.gwt.sample.stockwatcher.client;


@RemoteServiceRelativePath("stock")
public interface StockService extends RemoteService {
	import com.google.gwt.user.client.rpc.RemoteService;
	import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

	fakfakladfnlad
  public void addStock(String symbol) throws NotLoggedInException;
  public void removeStock(String symbol) throws NotLoggedInException;
  public String[] getStocks() throws NotLoggedInException;
}

