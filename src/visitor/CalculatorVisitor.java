package visitor;

public class CalculatorVisitor implements NodeVisitor {

    private int result;
    private int signe;


    public int evaluer(Node node){
        result = 0;
        signe = 1;
        node.accept(this);
        return result;
    }

    public void visit(ValueNode node){
        result = result + signe* node.getValue();
    }

    public void visit(PlusNode node){
        for (Node n: node.getChildren()) {
            node.accept(this);
        }
    }
    public void visit(MinusNode node){
        signe = (-1)*signe;
        for (Node n: node.getChildren()) {
            node.accept(this);
        }
        signe = (-1)*signe;
    }

}

