package classes;

import java.util.List;
import java.util.ArrayList;

public class DocumentAssembler {
    public static void main(String[] args) {
        List<Branch> branches = new ArrayList<>();
        Branch branch = new Branch(branches.size());
        branch.addLeaf(new Leaf(0, branches.size()));
        branches.add(branch);

        branch = new Branch(branches.size());
        branch.addLeaf(new Leaf(0, branches.size() + 1));
        branch.addLeaf(new Leaf(1, branches.size() + 1));
        branches.add(branch);

        branch = new Branch(branches.size());
        branch.addLeaf(new Leaf(0, branches.size() + 1));
        branch.addLeaf(new Leaf(1, branches.size() + 1));
        branches.add(branch);

        for (int i = 0; i < branches.size(); i++) {
            branches.get(i).print(branches);
        }
    }
}