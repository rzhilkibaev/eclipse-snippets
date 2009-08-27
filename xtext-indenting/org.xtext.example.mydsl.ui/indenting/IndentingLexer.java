package org.xtext.example.indenting;

import org.antlr.runtime.CharStream;
import org.xtext.example.parser.antlr.internal.InternalMyDslLexer;

public class IndentingLexer extends InternalMyDslLexer {

	public IndentingLexer() {
	}
	
	public IndentingLexer(CharStream input) {
		super(new IndentingStream(input));
	}
	
	@Override
	public void setCharStream(CharStream arg0) {
		super.setCharStream(new IndentingStream(arg0));
	}
}
