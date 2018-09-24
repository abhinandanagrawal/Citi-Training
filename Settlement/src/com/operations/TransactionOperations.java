package com.operations;

import com.beans.Transaction;

public interface TransactionOperations {
 boolean Login(String username, String password);
  boolean NettingFunds();
  int addTransaction(Transaction transaction);
  

}
