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
        4,1,40,10,2,0,7,0,2,1,7,1,1,0,1,0,1,0,1,1,1,1,1,1,0,0,2,0,2,0,1,
        2,0,1,16,18,39,7,0,4,1,0,0,0,2,7,1,0,0,0,4,5,3,2,1,0,5,6,5,0,0,1,
        6,1,1,0,0,0,7,8,7,0,0,0,8,3,1,0,0,0,0
    ]

class ExprParser ( Parser ):

    grammarFileName = "Expr.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'*'", "'INTEGER'", "'DOUBLE'", "<INVALID>", 
                     "'VARCHAR'", "'NULL'", "'CREATE'", "'SELECT'", "'TABLE'", 
                     "'FROM'", "'WHERE'", "'SERIAL'", "'PRIMARY'", "'INSERT'", 
                     "'INTO'", "'KEY'", "'NOT'", "'VALUES'", "'ON'", "'INNER'", 
                     "'JOIN'", "'{'", "'}'", "'('", "')'", "'['", "']'", 
                     "'.'", "','", "';'", "'>'", "'='", "'<'", "'!'", "'&'", 
                     "'_'" ]

    symbolicNames = [ "<INVALID>", "ASTERISK", "INT", "DOUBLE", "NUM", "VAR", 
                      "NULL", "CREATE", "SELECT", "TABLE", "FROM", "WHERE", 
                      "SERIAL", "PRIMARY", "INSERT", "INTO", "KEY", "NOT", 
                      "VALUES", "ON", "INNER", "JOIN", "LLLAVE", "RLLAVE", 
                      "LPAREN", "RPAREN", "LCORCH", "RCORCH", "PUNTO", "COMMA", 
                      "PUNTOC", "MAYOR", "ASIGN", "MENOR", "DIF", "AND", 
                      "GUION", "CADENACOMSEN", "CADENA", "IDT", "WS" ]

    RULE_root = 0
    RULE_expr = 1

    ruleNames =  [ "root", "expr" ]

    EOF = Token.EOF
    ASTERISK=1
    INT=2
    DOUBLE=3
    NUM=4
    VAR=5
    NULL=6
    CREATE=7
    SELECT=8
    TABLE=9
    FROM=10
    WHERE=11
    SERIAL=12
    PRIMARY=13
    INSERT=14
    INTO=15
    KEY=16
    NOT=17
    VALUES=18
    ON=19
    INNER=20
    JOIN=21
    LLLAVE=22
    RLLAVE=23
    LPAREN=24
    RPAREN=25
    LCORCH=26
    RCORCH=27
    PUNTO=28
    COMMA=29
    PUNTOC=30
    MAYOR=31
    ASIGN=32
    MENOR=33
    DIF=34
    AND=35
    GUION=36
    CADENACOMSEN=37
    CADENA=38
    IDT=39
    WS=40

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
            self.state = 4
            self.expr()
            self.state = 5
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

        def INT(self):
            return self.getToken(ExprParser.INT, 0)

        def DOUBLE(self):
            return self.getToken(ExprParser.DOUBLE, 0)

        def NULL(self):
            return self.getToken(ExprParser.NULL, 0)

        def CREATE(self):
            return self.getToken(ExprParser.CREATE, 0)

        def SELECT(self):
            return self.getToken(ExprParser.SELECT, 0)

        def TABLE(self):
            return self.getToken(ExprParser.TABLE, 0)

        def FROM(self):
            return self.getToken(ExprParser.FROM, 0)

        def WHERE(self):
            return self.getToken(ExprParser.WHERE, 0)

        def SERIAL(self):
            return self.getToken(ExprParser.SERIAL, 0)

        def PRIMARY(self):
            return self.getToken(ExprParser.PRIMARY, 0)

        def KEY(self):
            return self.getToken(ExprParser.KEY, 0)

        def LLLAVE(self):
            return self.getToken(ExprParser.LLLAVE, 0)

        def RLLAVE(self):
            return self.getToken(ExprParser.RLLAVE, 0)

        def LPAREN(self):
            return self.getToken(ExprParser.LPAREN, 0)

        def RPAREN(self):
            return self.getToken(ExprParser.RPAREN, 0)

        def LCORCH(self):
            return self.getToken(ExprParser.LCORCH, 0)

        def RCORCH(self):
            return self.getToken(ExprParser.RCORCH, 0)

        def PUNTO(self):
            return self.getToken(ExprParser.PUNTO, 0)

        def COMMA(self):
            return self.getToken(ExprParser.COMMA, 0)

        def PUNTOC(self):
            return self.getToken(ExprParser.PUNTOC, 0)

        def MAYOR(self):
            return self.getToken(ExprParser.MAYOR, 0)

        def ASIGN(self):
            return self.getToken(ExprParser.ASIGN, 0)

        def MENOR(self):
            return self.getToken(ExprParser.MENOR, 0)

        def DIF(self):
            return self.getToken(ExprParser.DIF, 0)

        def AND(self):
            return self.getToken(ExprParser.AND, 0)

        def NUM(self):
            return self.getToken(ExprParser.NUM, 0)

        def IDT(self):
            return self.getToken(ExprParser.IDT, 0)

        def ASTERISK(self):
            return self.getToken(ExprParser.ASTERISK, 0)

        def CADENA(self):
            return self.getToken(ExprParser.CADENA, 0)

        def INSERT(self):
            return self.getToken(ExprParser.INSERT, 0)

        def INTO(self):
            return self.getToken(ExprParser.INTO, 0)

        def VALUES(self):
            return self.getToken(ExprParser.VALUES, 0)

        def ON(self):
            return self.getToken(ExprParser.ON, 0)

        def INNER(self):
            return self.getToken(ExprParser.INNER, 0)

        def JOIN(self):
            return self.getToken(ExprParser.JOIN, 0)

        def CADENACOMSEN(self):
            return self.getToken(ExprParser.CADENACOMSEN, 0)

        def GUION(self):
            return self.getToken(ExprParser.GUION, 0)

        def VAR(self):
            return self.getToken(ExprParser.VAR, 0)

        def getRuleIndex(self):
            return ExprParser.RULE_expr




    def expr(self):

        localctx = ExprParser.ExprContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_expr)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 7
            _la = self._input.LA(1)
            if not((((_la) & ~0x3f) == 0 and ((1 << _la) & 1099511496702) != 0)):
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





