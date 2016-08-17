package com.bruce.base.transaction;

import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;

public interface FrameTransaction {
	
	public void begin();

	public void commit();
	
	public void rollback();
	
	void setTxManager(PlatformTransactionManager transactionManager);

	void setTransactionDefinition(TransactionDefinition txDefinition);
}
