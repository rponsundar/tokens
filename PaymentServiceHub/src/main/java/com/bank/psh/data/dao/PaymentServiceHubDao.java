/**
 * 
 */
package com.bank.psh.data.dao;

import java.util.ArrayList;

import com.bank.psh.beans.ClientRegistrationRequest;
import com.bank.psh.beans.UserBean;
import com.bank.psh.controller.model.ClientDetails;
import com.bank.psh.data.model.PaymentToken;
import com.bank.psh.data.model.PaymentURN;

/**
 * @author user
 *
 */
public interface PaymentServiceHubDao {

	void savePaymentToken(PaymentToken paymentToken);

	void savePaymentURN(PaymentURN paymentURN);

	PaymentToken getToken(String urn);
	
	ClientDetails registerClient(ClientDetails client);
	
	boolean validateUser(UserBean user);
	
	ArrayList<String> getCustCards(String custId);
	
	String expireTokenURN(String token);

}
