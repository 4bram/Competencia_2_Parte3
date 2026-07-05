# Generated from ./Expr.g4 by ANTLR 4.13.2
# encoding: utf-8
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
	from typing import TextIO
else:
	from typing.io import TextIO

def serializedATN():
    return [
        4,1,12,28,2,0,7,0,2,1,7,1,2,2,7,2,1,0,1,0,1,0,1,1,1,1,1,1,1,1,1,
        1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,2,1,2,1,2,0,0,3,
        0,2,4,0,1,2,0,8,8,12,12,24,0,6,1,0,0,0,2,9,1,0,0,0,4,25,1,0,0,0,
        6,7,3,2,1,0,7,8,5,0,0,1,8,1,1,0,0,0,9,10,5,1,0,0,10,11,5,9,0,0,11,
        12,5,2,0,0,12,13,5,9,0,0,13,14,5,4,0,0,14,15,3,4,2,0,15,16,5,5,0,
        0,16,17,5,9,0,0,17,18,5,4,0,0,18,19,3,4,2,0,19,20,5,3,0,0,20,21,
        5,9,0,0,21,22,5,4,0,0,22,23,5,10,0,0,23,24,5,6,0,0,24,3,1,0,0,0,
        25,26,7,0,0,0,26,5,1,0,0,0,0
    ]

class ExprParser ( Parser ):

    grammarFileName = "Expr.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'update'", "'set'", "'where'", "'='", 
                     "','", "';'", "'\\u2019'" ]

    symbolicNames = [ "<INVALID>", "UPDATE", "SET", "WHERE", "EQUAL", "COMMA", 
                      "SEMI", "THING", "STRW", "IDT", "NUM", "WS", "STR" ]

    RULE_root = 0
    RULE_expr = 1
    RULE_strr = 2

    ruleNames =  [ "root", "expr", "strr" ]

    EOF = Token.EOF
    UPDATE=1
    SET=2
    WHERE=3
    EQUAL=4
    COMMA=5
    SEMI=6
    THING=7
    STRW=8
    IDT=9
    NUM=10
    WS=11
    STR=12

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.13.2")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class RootContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def expr(self):
            return self.getTypedRuleContext(ExprParser.ExprContext,0)


        def EOF(self):
            return self.getToken(ExprParser.EOF, 0)

        def getRuleIndex(self):
            return ExprParser.RULE_root




    def root(self):

        localctx = ExprParser.RootContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_root)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 6
            self.expr()
            self.state = 7
            self.match(ExprParser.EOF)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ExprContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def UPDATE(self):
            return self.getToken(ExprParser.UPDATE, 0)

        def IDT(self, i:int=None):
            if i is None:
                return self.getTokens(ExprParser.IDT)
            else:
                return self.getToken(ExprParser.IDT, i)

        def SET(self):
            return self.getToken(ExprParser.SET, 0)

        def EQUAL(self, i:int=None):
            if i is None:
                return self.getTokens(ExprParser.EQUAL)
            else:
                return self.getToken(ExprParser.EQUAL, i)

        def strr(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(ExprParser.StrrContext)
            else:
                return self.getTypedRuleContext(ExprParser.StrrContext,i)


        def COMMA(self):
            return self.getToken(ExprParser.COMMA, 0)

        def WHERE(self):
            return self.getToken(ExprParser.WHERE, 0)

        def NUM(self):
            return self.getToken(ExprParser.NUM, 0)

        def SEMI(self):
            return self.getToken(ExprParser.SEMI, 0)

        def getRuleIndex(self):
            return ExprParser.RULE_expr




    def expr(self):

        localctx = ExprParser.ExprContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_expr)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 9
            self.match(ExprParser.UPDATE)
            self.state = 10
            self.match(ExprParser.IDT)
            self.state = 11
            self.match(ExprParser.SET)
            self.state = 12
            self.match(ExprParser.IDT)
            self.state = 13
            self.match(ExprParser.EQUAL)
            self.state = 14
            self.strr()
            self.state = 15
            self.match(ExprParser.COMMA)
            self.state = 16
            self.match(ExprParser.IDT)
            self.state = 17
            self.match(ExprParser.EQUAL)
            self.state = 18
            self.strr()
            self.state = 19
            self.match(ExprParser.WHERE)
            self.state = 20
            self.match(ExprParser.IDT)
            self.state = 21
            self.match(ExprParser.EQUAL)
            self.state = 22
            self.match(ExprParser.NUM)
            self.state = 23
            self.match(ExprParser.SEMI)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class StrrContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def STRW(self):
            return self.getToken(ExprParser.STRW, 0)

        def STR(self):
            return self.getToken(ExprParser.STR, 0)

        def getRuleIndex(self):
            return ExprParser.RULE_strr




    def strr(self):

        localctx = ExprParser.StrrContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_strr)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 25
            _la = self._input.LA(1)
            if not(_la==8 or _la==12):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





