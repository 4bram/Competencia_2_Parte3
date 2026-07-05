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
        4,1,19,39,2,0,7,0,2,1,7,1,1,0,1,0,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,
        1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,
        1,1,1,1,1,1,1,1,1,1,1,1,1,3,1,37,8,1,1,1,0,0,2,0,2,0,0,44,0,4,1,
        0,0,0,2,36,1,0,0,0,4,5,3,2,1,0,5,6,5,0,0,1,6,1,1,0,0,0,7,8,5,1,0,
        0,8,9,5,12,0,0,9,37,5,13,0,0,10,11,5,8,0,0,11,37,5,12,0,0,12,13,
        5,7,0,0,13,14,5,2,0,0,14,15,5,12,0,0,15,16,5,16,0,0,16,17,5,12,0,
        0,17,37,5,17,0,0,18,19,5,5,0,0,19,20,5,12,0,0,20,37,5,14,0,0,21,
        22,5,4,0,0,22,23,5,16,0,0,23,37,5,14,0,0,24,25,5,3,0,0,25,26,5,12,
        0,0,26,37,5,16,0,0,27,28,5,6,0,0,28,29,5,19,0,0,29,37,5,15,0,0,30,
        31,5,7,0,0,31,32,5,9,0,0,32,33,5,10,0,0,33,34,5,11,0,0,34,37,5,13,
        0,0,35,37,5,0,0,1,36,7,1,0,0,0,36,10,1,0,0,0,36,12,1,0,0,0,36,18,
        1,0,0,0,36,21,1,0,0,0,36,24,1,0,0,0,36,27,1,0,0,0,36,30,1,0,0,0,
        36,35,1,0,0,0,37,3,1,0,0,0,1,36
    ]

class ExprParser ( Parser ):

    grammarFileName = "Expr.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'nmap'", "'tcpdump'", "'journalctl'", 
                     "'dig'", "'curl'", "'grep'", "'sudo'", "'ss'", "'ufw'", 
                     "'deny'", "'from'" ]

    symbolicNames = [ "<INVALID>", "NMAP", "TCPDUMP", "JOURNAL", "DIG", 
                      "CURL", "GREP", "SUDO", "SS", "UFW", "DENY", "FROM", 
                      "FLG", "IPADDRESS", "DOM", "RT", "IDT", "NUM", "WS", 
                      "STR" ]

    RULE_root = 0
    RULE_expr = 1

    ruleNames =  [ "root", "expr" ]

    EOF = Token.EOF
    NMAP=1
    TCPDUMP=2
    JOURNAL=3
    DIG=4
    CURL=5
    GREP=6
    SUDO=7
    SS=8
    UFW=9
    DENY=10
    FROM=11
    FLG=12
    IPADDRESS=13
    DOM=14
    RT=15
    IDT=16
    NUM=17
    WS=18
    STR=19

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

        def NMAP(self):
            return self.getToken(ExprParser.NMAP, 0)

        def FLG(self, i:int=None):
            if i is None:
                return self.getTokens(ExprParser.FLG)
            else:
                return self.getToken(ExprParser.FLG, i)

        def IPADDRESS(self):
            return self.getToken(ExprParser.IPADDRESS, 0)

        def SS(self):
            return self.getToken(ExprParser.SS, 0)

        def SUDO(self):
            return self.getToken(ExprParser.SUDO, 0)

        def TCPDUMP(self):
            return self.getToken(ExprParser.TCPDUMP, 0)

        def IDT(self):
            return self.getToken(ExprParser.IDT, 0)

        def NUM(self):
            return self.getToken(ExprParser.NUM, 0)

        def CURL(self):
            return self.getToken(ExprParser.CURL, 0)

        def DOM(self):
            return self.getToken(ExprParser.DOM, 0)

        def DIG(self):
            return self.getToken(ExprParser.DIG, 0)

        def JOURNAL(self):
            return self.getToken(ExprParser.JOURNAL, 0)

        def GREP(self):
            return self.getToken(ExprParser.GREP, 0)

        def STR(self):
            return self.getToken(ExprParser.STR, 0)

        def RT(self):
            return self.getToken(ExprParser.RT, 0)

        def UFW(self):
            return self.getToken(ExprParser.UFW, 0)

        def DENY(self):
            return self.getToken(ExprParser.DENY, 0)

        def FROM(self):
            return self.getToken(ExprParser.FROM, 0)

        def EOF(self):
            return self.getToken(ExprParser.EOF, 0)

        def getRuleIndex(self):
            return ExprParser.RULE_expr




    def expr(self):

        localctx = ExprParser.ExprContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_expr)
        try:
            self.state = 36
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,0,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 7
                self.match(ExprParser.NMAP)
                self.state = 8
                self.match(ExprParser.FLG)
                self.state = 9
                self.match(ExprParser.IPADDRESS)
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 10
                self.match(ExprParser.SS)
                self.state = 11
                self.match(ExprParser.FLG)
                pass

            elif la_ == 3:
                self.enterOuterAlt(localctx, 3)
                self.state = 12
                self.match(ExprParser.SUDO)
                self.state = 13
                self.match(ExprParser.TCPDUMP)
                self.state = 14
                self.match(ExprParser.FLG)
                self.state = 15
                self.match(ExprParser.IDT)
                self.state = 16
                self.match(ExprParser.FLG)
                self.state = 17
                self.match(ExprParser.NUM)
                pass

            elif la_ == 4:
                self.enterOuterAlt(localctx, 4)
                self.state = 18
                self.match(ExprParser.CURL)
                self.state = 19
                self.match(ExprParser.FLG)
                self.state = 20
                self.match(ExprParser.DOM)
                pass

            elif la_ == 5:
                self.enterOuterAlt(localctx, 5)
                self.state = 21
                self.match(ExprParser.DIG)
                self.state = 22
                self.match(ExprParser.IDT)
                self.state = 23
                self.match(ExprParser.DOM)
                pass

            elif la_ == 6:
                self.enterOuterAlt(localctx, 6)
                self.state = 24
                self.match(ExprParser.JOURNAL)
                self.state = 25
                self.match(ExprParser.FLG)
                self.state = 26
                self.match(ExprParser.IDT)
                pass

            elif la_ == 7:
                self.enterOuterAlt(localctx, 7)
                self.state = 27
                self.match(ExprParser.GREP)
                self.state = 28
                self.match(ExprParser.STR)
                self.state = 29
                self.match(ExprParser.RT)
                pass

            elif la_ == 8:
                self.enterOuterAlt(localctx, 8)
                self.state = 30
                self.match(ExprParser.SUDO)
                self.state = 31
                self.match(ExprParser.UFW)
                self.state = 32
                self.match(ExprParser.DENY)
                self.state = 33
                self.match(ExprParser.FROM)
                self.state = 34
                self.match(ExprParser.IPADDRESS)
                pass

            elif la_ == 9:
                self.enterOuterAlt(localctx, 9)
                self.state = 35
                self.match(ExprParser.EOF)
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





