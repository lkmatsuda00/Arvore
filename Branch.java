package classes;

import java.util.ArrayList;
import java.util.List;

public class Branch {
  private int position;
  private List<Leaf> leafs = new ArrayList<>();
  private int nextBranch;

  public Branch(int position) {
    this.position = position;
    this.leafs.add(null);
    this.leafs.add(null);
    this.nextBranch = position + 1;
  }

  public void addLeaf(Leaf leaf) {
      leafs.add(leaf);
  }

  public void print(List<Branch> branches) {
    System.out.println("Posicao: " + this.position);

    for (Leaf leaf : this.leafs) {
        if (leaf != null) {
            leaf.printDetails();
        }
    }

    System.out.println("nextBranch: " + this.nextBranch);

    System.out.println(" ------------------------- ");
  }
}