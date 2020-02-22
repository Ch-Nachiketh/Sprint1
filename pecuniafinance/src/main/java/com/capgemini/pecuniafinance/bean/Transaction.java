package com.capgemini.pecuniafinance.bean;

//import java.util.Date;
import java.time.LocalDate;
public class Transaction {
String TransactionId;
LocalDate TransactionDate;
public Transaction(String transactionId, LocalDate transactionDate) {
	super();
	TransactionId = transactionId;
	TransactionDate = transactionDate;
}
public String getTransactionId() {
	return TransactionId;
}
public void setTransactionId(String transactionId) {
	TransactionId = transactionId;
}
public LocalDate getTransactionDate() {
	return TransactionDate;
}
public void setTransactionDate(LocalDate transactionDate) {
	TransactionDate = transactionDate;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((TransactionDate == null) ? 0 : TransactionDate.hashCode());
	result = prime * result + ((TransactionId == null) ? 0 : TransactionId.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Transaction other = (Transaction) obj;
	if (TransactionDate == null) {
		if (other.TransactionDate != null)
			return false;
	} else if (!TransactionDate.equals(other.TransactionDate))
		return false;
	if (TransactionId == null) {
		if (other.TransactionId != null)
			return false;
	} else if (!TransactionId.equals(other.TransactionId))
		return false;
	return true;
}
@Override
public String toString() {
	return "Transaction [TransactionId=" + TransactionId + ", TransactionDate=" + TransactionDate + "]";
}

}
