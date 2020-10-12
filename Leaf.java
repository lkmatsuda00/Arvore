package classes;

public class Leaf {
	  private int direction;
	  private int branch;

	  public Leaf(int direction, int branch) {
	    this.direction = direction;
	    this.branch = branch;
	  }

	  public void printDetails() {
	    System.out.println("Folha na: " + ((this.direction == 0) ? "Esquerda" : "Direita"));
	    System.out.println("Branch n°: " + branch);
	  }
	}