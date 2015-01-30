package com.google.gwt.sample.stockwatcher.client;


@RemoteServiceRelativePath("stock")
public interface StockService extends RemoteService {


  public void removeStock(String symbol) throws NotLoggedInException;
  public String[] getStocks() throws NotLoggedInException;

}

