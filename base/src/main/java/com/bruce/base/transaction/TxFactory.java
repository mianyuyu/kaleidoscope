package com.bruce.base.transaction;

import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;

import com.bruce.base.framework.FrameBeanFactory;

public class TxFactory {
	
	private static PlatformTransactionManager transactionManager;
	private static TransactionDefinition txDefinition;
	
	public static PlatformTransactionManager getTransactionManager() {
		return transactionManager;
	}

	public static void setTransactionManager(
			PlatformTransactionManager transactionManager) {
		TxFactory.transactionManager = transactionManager;
	}

	public static TransactionDefinition getTxDefinition() {
		return txDefinition;
	}

	public static void setTxDefinition(TransactionDefinition txDefinition) {
		TxFactory.txDefinition = txDefinition;
	}

	public static Transaction getTrans() {
		Transaction transaction = FrameBeanFactory.getBean("transaction", Transaction.class);
		transaction.setTxManager(transactionManager);
		transaction.setTransactionDefinition(txDefinition);
		return transaction;
	}
}
