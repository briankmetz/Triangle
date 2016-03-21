/*
 * @(#)EmptyDefaultParameterSequence.java        2.1 2016/03/06
 */

package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

public class EmptyDefaultParameterSequence extends DefaultParameterSequence {

  public EmptyDefaultParameterSequence (SourcePosition thePosition) {
    super (thePosition);
  }

  public Object visit(Visitor v, Object o) {
    return v.visitEmptyDefaultParameterSequence(this, o);
  }

  public boolean equals(Object dpsAST) {
    return (dpsAST instanceof EmptyDefaultParameterSequence);
  }
}
