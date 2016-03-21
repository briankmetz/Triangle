/*
 * @(#)FormalParameterSequence.java                2.1 2016/03/06
 */

package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

public abstract class DefaultParameterSequence extends AST {

  public DefaultParameterSequence (SourcePosition thePosition) {
    super (thePosition);
  }

  public abstract boolean equals(Object dpsAST);
}
