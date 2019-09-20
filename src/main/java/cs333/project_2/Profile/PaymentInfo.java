package cs333.project_2.Profile;

import java.util.Date;

public class PaymentInfo {
Buyer buyer = new Buyer();

private String creditcardno;
private String creditcardholder;
private Date expirydate;
private int cvv;
private String billingaddress;
public Buyer getBuyer() {
	return buyer;
}
public void setBuyer(Buyer buyer) {
	this.buyer = buyer;
}
public String getCreditcardno() {
	return creditcardno;
}
public void setCreditcardno(String creditcardno) {
	this.creditcardno = creditcardno;
}
public String getCreditcardholder() {
	return creditcardholder;
}
public void setCreditcardholder(String creditcardholder) {
	this.creditcardholder = creditcardholder;
}
public Date getExpirydate() {
	return expirydate;
}
public void setExpirydate(Date expirydate) {
	this.expirydate = expirydate;
}
public int getCvv() {
	return cvv;
}
public void setCvv(int cvv) {
	this.cvv = cvv;
}
public String getBillingaddress() {
	return billingaddress;
}
public void setBillingaddress(String billingaddress) {
	this.billingaddress = billingaddress;
}


}
