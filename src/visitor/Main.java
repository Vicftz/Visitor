package visitor;

public class Main {

    public static void main(String[] args){
        Node n0 = new OperatorNode('+');
        Node n1 = new ValueNode(6);
        Node n2 = new ValueNode(4);

        n0.addNode(n1);
        n0.addNode(n2);


        NodeVisitor printV = new PrintVisitor();

        n0.accept(printV);



    }

}
