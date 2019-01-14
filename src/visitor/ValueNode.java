package visitor;

import java.util.ArrayList;
import java.util.List;

public class ValueNode implements Node{
    List<Node> children = new ArrayList<>();

    int value;
    public ValueNode(int value) {
        this.value = value;
    }

    public int getValue(){
        return value;
    }

    public List<Node> getChildren(){
        return children;
    }

    public void addNode(Node n){
        children.add(n);
    }

    public int accept(NodeVisitor v){
        return v.visit(this);
    }

}
