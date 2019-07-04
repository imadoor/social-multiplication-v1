package microservices.book.multiplication.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class Multiplication {
	// Both Factors
	private int factorA;
	private int factorB;
	
	// The result of operation A * B
	private int result;
	
	public Multiplication(int factorA, int factorB) {
		this.factorA = factorA;
		this.factorB = factorB;
		this.result = factorA * factorB;
	}
	
}
