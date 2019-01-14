package visitor;

import java.util.ArrayList;
import java.util.List;

public abstract class OperatorNode implements Node{

    List<Node> children = new ArrayList<>();

    String op;
    public OperatorNode(String op) {
        this.op = op;
    }

    public void addNode(Node n){
        children.add(n);
    }

    public List<Node> getChildren(){
        return children;
    }

    public int accept(NodeVisitor v){
        return v.visit(this);
    }

}
