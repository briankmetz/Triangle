/*
 * @(#)SingleFormalParameterSequence.java                2.1 2016/03/06
 */

package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

public class SingleDefaultParameterSequence extends DefaultParameterSequence {

  public SingleDefaultParameterSequence (FormalParameter fpAST, Expression eAST,
                                 SourcePosition thePosition) {
    super (thePosition);
    E = eAST;
    FP = fpAST;
  }

  public Object visit(Visitor v, Object o) {
    return v.visitSingleDefaultParameterSequence(this, o);
  }

  public boolean equals(Object dpsAST) {
    if (dpsAST instanceof SingleDefaultParameterSequence) {
    	SingleDefaultParameterSequence sdpsAST =
          (SingleDefaultParameterSequence) dpsAST;
      return FP.equals(sdpsAST.FP) && E.equals(sdpsAST.E);
    } else
      return false;
  }

  public FormalParameter FP;
  public Expression E;
}
