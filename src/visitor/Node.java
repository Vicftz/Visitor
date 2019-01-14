package visitor;

import java.util.List;

public interface Node {

    void addNode(Node Subnode);

    public List<Node> getChildren();

}
