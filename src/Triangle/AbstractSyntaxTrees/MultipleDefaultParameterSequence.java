/*
 * @(#)MultipleDefaultParameterSequence.java        2.1 2016/03/06
 */

package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

public class MultipleDefaultParameterSequence extends DefaultParameterSequence {

  public MultipleDefaultParameterSequence (FormalParameter fpAST, Expression eAST, DefaultParameterSequence dpsAST,
                                   SourcePosition thePosition) {
    super (thePosition);
    FP = fpAST;
    E = eAST;
    DPS = dpsAST;
  }

  public Object visit(Visitor v, Object o) {
    return v.visitMultipleDefaultParameterSequence(this, o);
  }

  public boolean equals(Object dpsAST) {
    if (dpsAST instanceof MultipleDefaultParameterSequence) {
      MultipleDefaultParameterSequence mdpsAST =
          (MultipleDefaultParameterSequence) dpsAST;
      return FP.equals(mdpsAST.FP) && E.equals(mdpsAST.E) && DPS.equals(mdpsAST.DPS);
    } else
      return false;
  }

  public FormalParameter FP;
  public Expression E;
  public DefaultParameterSequence DPS;
}
