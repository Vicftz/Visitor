package visitor;

public class PrintVisitor implements NodeVisitor {

    public int visit(OperatorNode n) {
        if (n instanceof PlusNode) {
            System.out.println('+');
        } else {
            System.out.println('-');
        }
        return 1;
    }


    public int visit(ValueNode vn) {
        System.out.println(vn.getValue());
        return vn.getValue();
    }


}

