package ajash;

public class Bank {

	public static void main(String[] args) {
		int bal=25000,deposite=15000,transfer=11000,interest,total_bal,grand_total;
		total_bal=(bal+deposite)-transfer;
		interest=(total_bal*2/100)*12;
		grand_total=total_bal+interest;{
			System.out.println(grand_total);
		}

	}

}

