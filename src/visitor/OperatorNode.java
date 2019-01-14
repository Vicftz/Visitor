package visitor;

import java.util.ArrayList;
import java.util.List;

public class OperatorNode implements Node{

    List<Node> children = new ArrayList<>();

    public void addNode(Node n){
        children.add(n);
    }

    public List<Node> getChildren(){
        return children;
    }

}
