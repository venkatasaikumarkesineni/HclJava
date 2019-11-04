package com.hcl.customerproject;

public class Customer {
	private int custId;
	private String custName;
	private double annualpremium;
	private double modalPremium;
	private int paymentMode;
	/**
	 * @return the custId
	 */
	public int getCustId() {
		return custId;
	}
	/**
	 * @param custId the custId to set
	 */
	public void setCustId(int custId) {
		this.custId = custId;
	}
	/**
	 * @return the custName
	 */
	public String getCustName() {
		return custName;
	}
	/**
	 * @param custName the custName to set
	 */
	public void setCustName(String custName) {
		this.custName = custName;
	}
	/**
	 * @return the annualpremium
	 */
	public double getAnnualpremium() {
		return annualpremium;
	}
	/**
	 * @param annualpremium the annualpremium to set
	 */
	public void setAnnualpremium(double annualpremium) {
		this.annualpremium = annualpremium;
	}
	/**
	 * @return the modalPremium
	 */
	public double getModalPremium() {
		return modalPremium;
	}
	/**
	 * @param modalPremium the modalPremium to set
	 */
	public void setModalPremium(double modalPremium) {
		this.modalPremium = modalPremium;
	}
	/**
	 * @return the paymentMode
	 */
	public int getPaymentMode() {
		return paymentMode;
	}
	/**
	 * @param paymentMode the paymentMode to set
	 */
	public void setPaymentMode(int paymentMode) {
		this.paymentMode = paymentMode;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", annualpremium=" + annualpremium
				+ ", modalPremium=" + modalPremium + ", paymentMode=" + paymentMode + "]";
	}
	
	// customer id not negative
	//customer name not less than 5 charecters.
	//annual premium 2000 to 100000
	//modal premium from 1000 to 5000
	// payment mode 1 or 2 3
	
	
	// addCustomer()
	//showCustomer()
	//searchCustomer()
	//deleteCustomer()
	//updateCustomer
	//store customer file
	//read customer file
	

}
