package com.bruce.base.transaction;

import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;

public class Transaction implements FrameTransaction {

	private PlatformTransactionManager transactionManager;
	private TransactionDefinition txDefinition;
	private TransactionStatus txStatus;
	
	@Override
	public void begin() {
		txStatus = transactionManager.getTransaction(txDefinition);
	}

	@Override
	public void commit() {
		this.transactionManager.commit(txStatus);
	}

	@Override
	public void rollback() {
		this.transactionManager.rollback(txStatus);
	}

	@Override
	public void setTxManager(PlatformTransactionManager transactionManager) {
		this.transactionManager = transactionManager;
	}

	@Override
	public void setTransactionDefinition(TransactionDefinition txDefinition) {
		this.txDefinition = txDefinition;
	}

}
