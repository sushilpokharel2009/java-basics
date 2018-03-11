package bank;

import java.util.HashMap;

public class BluePay {
	static String ACCOUNT_ID = "Merchant's Account ID Here";
    static String SECRET_KEY = "Merchant's Secret Key Here";
    static String MODE = "TEST";
    static String TOKEN = "Transaction ID here"; 


  public static void main(String[] args) {
  
    
    BluePay payment = new BluePay(
    );

    // Sale Amount: $3.00
    HashMap<String, String> saleParams = new HashMap<>();
    saleParams.put("amount", "3.00"); 
    saleParams.put("transactionID", TOKEN); // The transaction ID of a previous sale
    payment.sale(saleParams);
    
    // Makes the API Request with BluePay
    try {
      payment.process();
    } catch (Exception ex) {
      System.out.println("Exception: " + ex.toString());
      System.exit(1);
    }

    // If transaction was successful reads the responses from BluePay
    if (payment.isSuccessful()) {
      System.out.println("Transaction Status: " + payment.getStatus());
      System.out.println("Transaction ID: " + payment.getTransID());
      System.out.println("Transaction Message: " + payment.getMessage());
      System.out.println("AVS Result: " + payment.getClass());
      System.out.println("CVV2: " + payment.getClass());
      System.out.println("Masked Payment Account: " + payment.getMaskedPaymentAccount());
      System.out.println("Card Type: " + payment.getCardType());   
      System.out.println("Authorization Code: " + payment.getAuthCode());
    } else {
      System.out.println("Error: " + payment.getMessage());
    }
  }

private void sale(HashMap<String, String> saleParams) {
	// TODO Auto-generated method stub
	
}

private void process() {
	// TODO Auto-generated method stub
	
}

private String getAuthCode() {
	// TODO Auto-generated method stub
	return null;
}

private String getCardType() {
	// TODO Auto-generated method stub
	return null;
}

private String getMaskedPaymentAccount() {
	// TODO Auto-generated method stub
	return null;
}

private String getMessage() {
	// TODO Auto-generated method stub
	return null;
}

private String getTransID() {
	// TODO Auto-generated method stub
	return null;
}

private String getStatus() {
	// TODO Auto-generated method stub
	return null;
}

private boolean isSuccessful() {
	// TODO Auto-generated method stub
	return false;
}
}
