package visitor;

public interface NodeVisitor {

   public void visit(ValueNode vn);

   public void visit(MinusNode mn);

   public void visit(PlusNode pn);


}
