package AssignmentsCollections;

import java.util.Objects;

public class CreditCard implements Comparable<CreditCard>
{
	private int number;
	private String name;
	private int cvv;
	private int expiryDate;
	public CreditCard(int number, String name, int cvv, int expiryDate) {
		super();
		this.number = number;
		this.name = name;
		this.cvv = cvv;
		this.expiryDate = expiryDate;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCvv() {
		return cvv;
	}
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
	public int getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(int expiryDate) {
		this.expiryDate = expiryDate;
	}
	@Override
	public String toString() {
		return "CreditCard [number=" + number + ", name=" + name + ", cvv=" + cvv + ", expiryDate=" + expiryDate + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(cvv, expiryDate, name, number);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CreditCard other = (CreditCard) obj;
		return cvv == other.cvv && expiryDate == other.expiryDate && Objects.equals(name, other.name)
				&& number == other.number;
	}
	@Override public int compareTo(CreditCard compareCard)
    {
        int compare = compareCard.getExpiryDate();
        return this.getExpiryDate() - compare;
    }
}