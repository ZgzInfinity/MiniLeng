/* Generated By:JavaCC: Do not edit this line. CompiladorTokenManager.java */
package MiniLeng;
import Util.Simbolo;
import Util.Simbolo.Tipo_simbolo;
import Util.Simbolo.Tipo_variable;
import Util.Simbolo.Clase_parametro;
import Util.Tabla_Simbolos;
import Util.TablaHash;
import Util.RegistroExp;
import Util.TipoOperador;
import Util.TipoOperador.Tipo_Operador_Aditivo;
import Util.TipoOperador.Tipo_Operador_Multiplicativo;
import Util.TipoOperador.Tipo_Operador_Relacional;
import Exceptions.ErrorLexico;
import Exceptions.ErrorSemantico;
import Exceptions.ErrorSintactico;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;

/** Token Manager. */
public class CompiladorTokenManager implements CompiladorConstants
{

  /** Debug output. */
  public static  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public static  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private static final int jjStopStringLiteralDfa_0(int pos, long active0)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0x7ffffff00000L) != 0L)
         {
            jjmatchedKind = 52;
            return 15;
         }
         if ((active0 & 0x20L) != 0L)
            return 16;
         return -1;
      case 1:
         if ((active0 & 0xa8200000L) != 0L)
            return 15;
         if ((active0 & 0x7fff57d00000L) != 0L)
         {
            if (jjmatchedPos != 1)
            {
               jjmatchedKind = 52;
               jjmatchedPos = 1;
            }
            return 15;
         }
         if ((active0 & 0x20L) != 0L)
            return 16;
         return -1;
      case 2:
         if ((active0 & 0x1bc602800000L) != 0L)
         {
            if (jjmatchedPos != 2)
            {
               jjmatchedKind = 52;
               jjmatchedPos = 2;
            }
            return 15;
         }
         if ((active0 & 0x643975500000L) != 0L)
            return 15;
         return -1;
      case 3:
         if ((active0 & 0x10400000000L) != 0L)
            return 15;
         if ((active0 & 0x1ee222800000L) != 0L)
         {
            jjmatchedKind = 52;
            jjmatchedPos = 3;
            return 15;
         }
         return -1;
      case 4:
         if ((active0 & 0x20020000000L) != 0L)
            return 15;
         if ((active0 & 0x1ce202800000L) != 0L)
         {
            jjmatchedKind = 52;
            jjmatchedPos = 4;
            return 15;
         }
         return -1;
      case 5:
         if ((active0 & 0xcc202800000L) != 0L)
         {
            jjmatchedKind = 52;
            jjmatchedPos = 5;
            return 15;
         }
         if ((active0 & 0x102000000000L) != 0L)
            return 15;
         return -1;
      case 6:
         if ((active0 & 0xc0000000000L) != 0L)
            return 15;
         if ((active0 & 0xc202800000L) != 0L)
         {
            jjmatchedKind = 52;
            jjmatchedPos = 6;
            return 15;
         }
         return -1;
      case 7:
         if ((active0 & 0x2000000L) != 0L)
         {
            jjmatchedKind = 52;
            jjmatchedPos = 7;
            return 15;
         }
         if ((active0 & 0xc200800000L) != 0L)
            return 15;
         return -1;
      default :
         return -1;
   }
}
private static final int jjStartNfa_0(int pos, long active0)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
static private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
static private int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 37:
         return jjMoveStringLiteralDfa1_0(0x20L);
      case 40:
         return jjStopAtPos(0, 55);
      case 41:
         return jjStopAtPos(0, 56);
      case 42:
         return jjStopAtPos(0, 11);
      case 43:
         return jjStopAtPos(0, 9);
      case 44:
         return jjStopAtPos(0, 54);
      case 45:
         return jjStopAtPos(0, 10);
      case 47:
         return jjStopAtPos(0, 12);
      case 58:
         return jjMoveStringLiteralDfa1_0(0x80000L);
      case 59:
         return jjStopAtPos(0, 53);
      case 60:
         jjmatchedKind = 14;
         return jjMoveStringLiteralDfa1_0(0x60000L);
      case 61:
         return jjStopAtPos(0, 15);
      case 62:
         jjmatchedKind = 13;
         return jjMoveStringLiteralDfa1_0(0x10000L);
      case 65:
      case 97:
         return jjMoveStringLiteralDfa1_0(0x100000100000L);
      case 66:
      case 98:
         return jjMoveStringLiteralDfa1_0(0x4000000000L);
      case 67:
      case 99:
         return jjMoveStringLiteralDfa1_0(0x88000000000L);
      case 68:
      case 100:
         return jjMoveStringLiteralDfa1_0(0x1000000000L);
      case 69:
      case 101:
         return jjMoveStringLiteralDfa1_0(0x42210000000L);
      case 70:
      case 102:
         return jjMoveStringLiteralDfa1_0(0x20144000000L);
      case 76:
      case 108:
         return jjMoveStringLiteralDfa1_0(0x400000000L);
      case 77:
      case 109:
         return jjMoveStringLiteralDfa1_0(0x880000000L);
      case 78:
      case 110:
         return jjMoveStringLiteralDfa1_0(0x400000L);
      case 79:
      case 111:
         return jjMoveStringLiteralDfa1_0(0x200000L);
      case 80:
      case 112:
         return jjMoveStringLiteralDfa1_0(0x2800000L);
      case 82:
      case 114:
         return jjMoveStringLiteralDfa1_0(0x400000000000L);
      case 83:
      case 115:
         return jjMoveStringLiteralDfa1_0(0x28000000L);
      case 84:
      case 116:
         return jjMoveStringLiteralDfa1_0(0x10000000000L);
      case 86:
      case 118:
         return jjMoveStringLiteralDfa1_0(0x200001000000L);
      default :
         return jjMoveNfa_0(0, 0);
   }
}
static private int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 37:
         if ((active0 & 0x20L) != 0L)
            return jjStartNfaWithStates_0(1, 5, 16);
         break;
      case 61:
         if ((active0 & 0x10000L) != 0L)
            return jjStopAtPos(1, 16);
         else if ((active0 & 0x20000L) != 0L)
            return jjStopAtPos(1, 17);
         else if ((active0 & 0x80000L) != 0L)
            return jjStopAtPos(1, 19);
         break;
      case 62:
         if ((active0 & 0x40000L) != 0L)
            return jjStopAtPos(1, 18);
         break;
      case 65:
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0x2a8001000000L);
      case 67:
      case 99:
         return jjMoveStringLiteralDfa2_0(active0, 0x100000000000L);
      case 69:
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x400400000000L);
      case 73:
      case 105:
         if ((active0 & 0x8000000L) != 0L)
         {
            jjmatchedKind = 27;
            jjmatchedPos = 1;
         }
         return jjMoveStringLiteralDfa2_0(active0, 0x1024000000L);
      case 77:
      case 109:
         return jjMoveStringLiteralDfa2_0(active0, 0x100000000L);
      case 78:
      case 110:
         return jjMoveStringLiteralDfa2_0(active0, 0x42010100000L);
      case 79:
      case 111:
         return jjMoveStringLiteralDfa2_0(active0, 0x4800400000L);
      case 81:
      case 113:
         if ((active0 & 0x80000000L) != 0L)
            return jjStartNfaWithStates_0(1, 31, 15);
         break;
      case 82:
      case 114:
         if ((active0 & 0x200000L) != 0L)
            return jjStartNfaWithStates_0(1, 21, 15);
         return jjMoveStringLiteralDfa2_0(active0, 0x10002800000L);
      case 83:
      case 115:
         return jjMoveStringLiteralDfa2_0(active0, 0x240000000L);
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
static private int jjMoveStringLiteralDfa2_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 95:
         return jjMoveStringLiteralDfa3_0(active0, 0x20000000L);
      case 67:
      case 99:
         return jjMoveStringLiteralDfa3_0(active0, 0x100200000000L);
      case 68:
      case 100:
         if ((active0 & 0x100000L) != 0L)
            return jjStartNfaWithStates_0(2, 20, 15);
         else if ((active0 & 0x800000000L) != 0L)
            return jjStartNfaWithStates_0(2, 35, 15);
         break;
      case 69:
      case 101:
         return jjMoveStringLiteralDfa3_0(active0, 0x400000000L);
      case 70:
      case 102:
         if ((active0 & 0x400000000000L) != 0L)
            return jjStartNfaWithStates_0(2, 46, 15);
         break;
      case 73:
      case 105:
         if ((active0 & 0x40000000L) != 0L)
            return jjStartNfaWithStates_0(2, 30, 15);
         return jjMoveStringLiteralDfa3_0(active0, 0x2000000L);
      case 76:
      case 108:
         if ((active0 & 0x200000000000L) != 0L)
            return jjStartNfaWithStates_0(2, 45, 15);
         return jjMoveStringLiteralDfa3_0(active0, 0x20000000000L);
      case 78:
      case 110:
         if ((active0 & 0x4000000L) != 0L)
            return jjStartNfaWithStates_0(2, 26, 15);
         break;
      case 79:
      case 111:
         return jjMoveStringLiteralDfa3_0(active0, 0x4000800000L);
      case 81:
      case 113:
         if ((active0 & 0x100000000L) != 0L)
            return jjStartNfaWithStates_0(2, 32, 15);
         break;
      case 82:
      case 114:
         if ((active0 & 0x1000000L) != 0L)
            return jjStartNfaWithStates_0(2, 24, 15);
         return jjMoveStringLiteralDfa3_0(active0, 0x88000000000L);
      case 84:
      case 116:
         if ((active0 & 0x400000L) != 0L)
            return jjStartNfaWithStates_0(2, 22, 15);
         else if ((active0 & 0x10000000L) != 0L)
         {
            jjmatchedKind = 28;
            jjmatchedPos = 2;
         }
         return jjMoveStringLiteralDfa3_0(active0, 0x42000000000L);
      case 85:
      case 117:
         return jjMoveStringLiteralDfa3_0(active0, 0x10000000000L);
      case 86:
      case 118:
         if ((active0 & 0x1000000000L) != 0L)
            return jjStartNfaWithStates_0(2, 36, 15);
         break;
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
static private int jjMoveStringLiteralDfa3_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 65:
      case 97:
         return jjMoveStringLiteralDfa4_0(active0, 0xc8000000000L);
      case 69:
      case 101:
         if ((active0 & 0x10000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 40, 15);
         return jjMoveStringLiteralDfa4_0(active0, 0x2000000000L);
      case 71:
      case 103:
         return jjMoveStringLiteralDfa4_0(active0, 0x800000L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa4_0(active0, 0x100000000000L);
      case 76:
      case 108:
         return jjMoveStringLiteralDfa4_0(active0, 0x4000000000L);
      case 78:
      case 110:
         return jjMoveStringLiteralDfa4_0(active0, 0x22000000L);
      case 82:
      case 114:
         if ((active0 & 0x400000000L) != 0L)
            return jjStartNfaWithStates_0(3, 34, 15);
         return jjMoveStringLiteralDfa4_0(active0, 0x200000000L);
      case 83:
      case 115:
         return jjMoveStringLiteralDfa4_0(active0, 0x20000000000L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
static private int jjMoveStringLiteralDfa4_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 67:
      case 99:
         return jjMoveStringLiteralDfa5_0(active0, 0x48002000000L);
      case 69:
      case 101:
         if ((active0 & 0x20000000000L) != 0L)
            return jjStartNfaWithStates_0(4, 41, 15);
         return jjMoveStringLiteralDfa5_0(active0, 0x84000000000L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa5_0(active0, 0x200000000L);
      case 79:
      case 111:
         if ((active0 & 0x20000000L) != 0L)
            return jjStartNfaWithStates_0(4, 29, 15);
         return jjMoveStringLiteralDfa5_0(active0, 0x100000000000L);
      case 82:
      case 114:
         return jjMoveStringLiteralDfa5_0(active0, 0x2000800000L);
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
static private int jjMoveStringLiteralDfa5_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0);
      return 5;
   }
   switch(curChar)
   {
      case 65:
      case 97:
         return jjMoveStringLiteralDfa6_0(active0, 0x44000800000L);
      case 66:
      case 98:
         return jjMoveStringLiteralDfa6_0(active0, 0x200000000L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa6_0(active0, 0x2000000L);
      case 78:
      case 110:
         if ((active0 & 0x100000000000L) != 0L)
            return jjStartNfaWithStates_0(5, 44, 15);
         return jjMoveStringLiteralDfa6_0(active0, 0x80000000000L);
      case 79:
      case 111:
         if ((active0 & 0x2000000000L) != 0L)
            return jjStartNfaWithStates_0(5, 37, 15);
         break;
      case 84:
      case 116:
         return jjMoveStringLiteralDfa6_0(active0, 0x8000000000L);
      default :
         break;
   }
   return jjStartNfa_0(4, active0);
}
static private int jjMoveStringLiteralDfa6_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0);
      return 6;
   }
   switch(curChar)
   {
      case 69:
      case 101:
         return jjMoveStringLiteralDfa7_0(active0, 0x8000000000L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa7_0(active0, 0x200000000L);
      case 77:
      case 109:
         return jjMoveStringLiteralDfa7_0(active0, 0x800000L);
      case 78:
      case 110:
         return jjMoveStringLiteralDfa7_0(active0, 0x4000000000L);
      case 80:
      case 112:
         return jjMoveStringLiteralDfa7_0(active0, 0x2000000L);
      case 82:
      case 114:
         if ((active0 & 0x40000000000L) != 0L)
            return jjStartNfaWithStates_0(6, 42, 15);
         break;
      case 84:
      case 116:
         if ((active0 & 0x80000000000L) != 0L)
            return jjStartNfaWithStates_0(6, 43, 15);
         break;
      default :
         break;
   }
   return jjStartNfa_0(5, active0);
}
static private int jjMoveStringLiteralDfa7_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(5, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(6, active0);
      return 7;
   }
   switch(curChar)
   {
      case 65:
      case 97:
         if ((active0 & 0x800000L) != 0L)
            return jjStartNfaWithStates_0(7, 23, 15);
         break;
      case 73:
      case 105:
         return jjMoveStringLiteralDfa8_0(active0, 0x2000000L);
      case 79:
      case 111:
         if ((active0 & 0x4000000000L) != 0L)
            return jjStartNfaWithStates_0(7, 38, 15);
         break;
      case 82:
      case 114:
         if ((active0 & 0x200000000L) != 0L)
            return jjStartNfaWithStates_0(7, 33, 15);
         else if ((active0 & 0x8000000000L) != 0L)
            return jjStartNfaWithStates_0(7, 39, 15);
         break;
      default :
         break;
   }
   return jjStartNfa_0(6, active0);
}
static private int jjMoveStringLiteralDfa8_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(6, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(7, active0);
      return 8;
   }
   switch(curChar)
   {
      case 79:
      case 111:
         if ((active0 & 0x2000000L) != 0L)
            return jjStartNfaWithStates_0(8, 25, 15);
         break;
      default :
         break;
   }
   return jjStartNfa_0(7, active0);
}
static private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
static final long[] jjbitVec0 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
static private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 15;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 16:
                  if ((0xffffffffffffdbffL & l) != 0L)
                     jjCheckNAddStates(0, 2);
                  else if ((0x2400L & l) != 0L)
                  {
                     if (kind > 8)
                        kind = 8;
                  }
                  if (curChar == 13)
                     jjstateSet[jjnewStateCnt++] = 3;
                  break;
               case 0:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 51)
                        kind = 51;
                     jjCheckNAdd(5);
                  }
                  else if (curChar == 34)
                     jjCheckNAddTwoStates(11, 13);
                  else if (curChar == 37)
                     jjCheckNAddStates(0, 2);
                  break;
               case 15:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 52)
                        kind = 52;
                  }
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(8, 9);
                  break;
               case 1:
                  if ((0xffffffffffffdbffL & l) != 0L)
                     jjCheckNAddStates(0, 2);
                  break;
               case 2:
                  if ((0x2400L & l) != 0L && kind > 8)
                     kind = 8;
                  break;
               case 3:
                  if (curChar == 10 && kind > 8)
                     kind = 8;
                  break;
               case 4:
                  if (curChar == 13)
                     jjstateSet[jjnewStateCnt++] = 3;
                  break;
               case 5:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 51)
                     kind = 51;
                  jjCheckNAdd(5);
                  break;
               case 8:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(8, 9);
                  break;
               case 9:
                  if ((0x3ff000000000000L & l) != 0L && kind > 52)
                     kind = 52;
                  break;
               case 10:
                  if (curChar == 34)
                     jjCheckNAddTwoStates(11, 13);
                  break;
               case 11:
                  if ((0xfffffffbffffffffL & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 12;
                  break;
               case 12:
                  if (curChar == 34 && kind > 49)
                     kind = 49;
                  break;
               case 13:
                  if ((0xfffffffbffffffffL & l) != 0L)
                     jjCheckNAddTwoStates(13, 14);
                  break;
               case 14:
                  if (curChar == 34 && kind > 50)
                     kind = 50;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 16:
               case 1:
                  jjCheckNAddStates(0, 2);
                  break;
               case 0:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                     jjCheckNAddTwoStates(8, 9);
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 52)
                        kind = 52;
                  }
                  break;
               case 15:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                     jjCheckNAddTwoStates(8, 9);
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 52)
                        kind = 52;
                  }
                  break;
               case 6:
                  if ((0x7fffffe07fffffeL & l) != 0L && kind > 52)
                     kind = 52;
                  break;
               case 7:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                     jjCheckNAddTwoStates(8, 9);
                  break;
               case 8:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                     jjCheckNAddTwoStates(8, 9);
                  break;
               case 9:
                  if ((0x7fffffe07fffffeL & l) != 0L && kind > 52)
                     kind = 52;
                  break;
               case 11:
                  jjstateSet[jjnewStateCnt++] = 12;
                  break;
               case 13:
                  jjAddStates(3, 4);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 16:
               case 1:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjCheckNAddStates(0, 2);
                  break;
               case 11:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjstateSet[jjnewStateCnt++] = 12;
                  break;
               case 13:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjAddStates(3, 4);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 15 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static private int jjMoveStringLiteralDfa0_1()
{
   switch(curChar)
   {
      case 37:
         return jjMoveStringLiteralDfa1_1(0x40L);
      default :
         return 1;
   }
}
static private int jjMoveStringLiteralDfa1_1(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 1;
   }
   switch(curChar)
   {
      case 37:
         if ((active0 & 0x40L) != 0L)
            return jjStopAtPos(1, 6);
         break;
      default :
         return 2;
   }
   return 2;
}
static final int[] jjnextStates = {
   1, 2, 4, 13, 14, 
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, null, null, null, "\53", "\55", "\52", 
"\57", "\76", "\74", "\75", "\76\75", "\74\75", "\74\76", "\72\75", null, null, null, 
null, null, null, null, null, null, null, null, null, null, null, null, null, null, 
null, null, null, null, null, null, null, null, null, null, null, null, null, null, 
null, null, "\73", "\54", "\50", "\51", };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
   "ComentLinea",
};

/** Lex State array. */
public static final int[] jjnewLexState = {
   -1, -1, -1, -1, -1, 1, 0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, -1, -1, -1, -1, -1, 
};
static final long[] jjtoToken = {
   0x1fe7ffffffffe01L, 
};
static final long[] jjtoSkip = {
   0x17eL, 
};
static final long[] jjtoSpecial = {
   0x100L, 
};
static final long[] jjtoMore = {
   0x80L, 
};
static protected SimpleCharStream input_stream;
static private final int[] jjrounds = new int[15];
static private final int[] jjstateSet = new int[30];
private static final StringBuilder jjimage = new StringBuilder();
private static StringBuilder image = jjimage;
private static int jjimageLen;
private static int lengthOfMatch;
static protected char curChar;
/** Constructor. */
public CompiladorTokenManager(SimpleCharStream stream){
   if (input_stream != null)
      throw new TokenMgrError("ERROR: Second call to constructor of static lexer. You must use ReInit() to initialize the static variables.", TokenMgrError.STATIC_LEXER_ERROR);
   input_stream = stream;
}

/** Constructor. */
public CompiladorTokenManager(SimpleCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}

/** Reinitialise parser. */
static public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
static private void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 15; i-- > 0;)
      jjrounds[i] = 0x80000000;
}

/** Reinitialise parser. */
static public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}

/** Switch to specified lex state. */
static public void SwitchTo(int lexState)
{
   if (lexState >= 2 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

static protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

static int curLexState = 0;
static int defaultLexState = 0;
static int jjnewStateCnt;
static int jjround;
static int jjmatchedPos;
static int jjmatchedKind;

/** Get the next Token. */
public static Token getNextToken() 
{
  Token specialToken = null;
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(java.io.IOException e)
   {
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      matchedToken.specialToken = specialToken;
      return matchedToken;
   }
   image = jjimage;
   image.setLength(0);
   jjimageLen = 0;

   for (;;)
   {
     switch(curLexState)
     {
       case 0:
         try { input_stream.backup(0);
            while (curChar <= 32 && (0x100002600L & (1L << curChar)) != 0L)
               curChar = input_stream.BeginToken();
         }
         catch (java.io.IOException e1) { continue EOFLoop; }
         jjmatchedKind = 0x7fffffff;
         jjmatchedPos = 0;
         curPos = jjMoveStringLiteralDfa0_0();
         break;
       case 1:
         jjmatchedKind = 0x7fffffff;
         jjmatchedPos = 0;
         curPos = jjMoveStringLiteralDfa0_1();
         if (jjmatchedPos == 0 && jjmatchedKind > 7)
         {
            jjmatchedKind = 7;
         }
         break;
     }
     if (jjmatchedKind != 0x7fffffff)
     {
        if (jjmatchedPos + 1 < curPos)
           input_stream.backup(curPos - jjmatchedPos - 1);
        if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
        {
           matchedToken = jjFillToken();
           matchedToken.specialToken = specialToken;
           TokenLexicalActions(matchedToken);
       if (jjnewLexState[jjmatchedKind] != -1)
         curLexState = jjnewLexState[jjmatchedKind];
           return matchedToken;
        }
        else if ((jjtoSkip[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
        {
           if ((jjtoSpecial[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
           {
              matchedToken = jjFillToken();
              if (specialToken == null)
                 specialToken = matchedToken;
              else
              {
                 matchedToken.specialToken = specialToken;
                 specialToken = (specialToken.next = matchedToken);
              }
           }
         if (jjnewLexState[jjmatchedKind] != -1)
           curLexState = jjnewLexState[jjmatchedKind];
           continue EOFLoop;
        }
        jjimageLen += jjmatchedPos + 1;
      if (jjnewLexState[jjmatchedKind] != -1)
        curLexState = jjnewLexState[jjmatchedKind];
        curPos = 0;
        jjmatchedKind = 0x7fffffff;
        try {
           curChar = input_stream.readChar();
           continue;
        }
        catch (java.io.IOException e1) { }
     }
     int error_line = input_stream.getEndLine();
     int error_column = input_stream.getEndColumn();
     String error_after = null;
     boolean EOFSeen = false;
     try { input_stream.readChar(); input_stream.backup(1); }
     catch (java.io.IOException e1) {
        EOFSeen = true;
        error_after = curPos <= 1 ? "" : input_stream.GetImage();
        if (curChar == '\n' || curChar == '\r') {
           error_line++;
           error_column = 0;
        }
        else
           error_column++;
     }
     if (!EOFSeen) {
        input_stream.backup(1);
        error_after = curPos <= 1 ? "" : input_stream.GetImage();
     }
     throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
   }
  }
}

static void TokenLexicalActions(Token matchedToken)
{
   switch(jjmatchedKind)
   {
      case 9 :
        image.append(jjstrLiteralImages[9]);
        lengthOfMatch = jjstrLiteralImages[9].length();
    TablaHash.anyadirHashTokens("tPLUS");
         break;
      case 10 :
        image.append(jjstrLiteralImages[10]);
        lengthOfMatch = jjstrLiteralImages[10].length();
    TablaHash.anyadirHashTokens("tMINUS");
         break;
      case 11 :
        image.append(jjstrLiteralImages[11]);
        lengthOfMatch = jjstrLiteralImages[11].length();
    TablaHash.anyadirHashTokens("tMULTIPLY");
         break;
      case 12 :
        image.append(jjstrLiteralImages[12]);
        lengthOfMatch = jjstrLiteralImages[12].length();
    TablaHash.anyadirHashTokens("tDIVIDE");
         break;
      case 13 :
        image.append(jjstrLiteralImages[13]);
        lengthOfMatch = jjstrLiteralImages[13].length();
    TablaHash.anyadirHashTokens("tMAYOR");
         break;
      case 14 :
        image.append(jjstrLiteralImages[14]);
        lengthOfMatch = jjstrLiteralImages[14].length();
    TablaHash.anyadirHashTokens("tMENOR");
         break;
      case 15 :
        image.append(jjstrLiteralImages[15]);
        lengthOfMatch = jjstrLiteralImages[15].length();
    TablaHash.anyadirHashTokens("tIGUAL");
         break;
      case 16 :
        image.append(jjstrLiteralImages[16]);
        lengthOfMatch = jjstrLiteralImages[16].length();
    TablaHash.anyadirHashTokens("tMAI");
         break;
      case 17 :
        image.append(jjstrLiteralImages[17]);
        lengthOfMatch = jjstrLiteralImages[17].length();
    TablaHash.anyadirHashTokens("tMEI");
         break;
      case 18 :
        image.append(jjstrLiteralImages[18]);
        lengthOfMatch = jjstrLiteralImages[18].length();
    TablaHash.anyadirHashTokens("tNI");
         break;
      case 19 :
        image.append(jjstrLiteralImages[19]);
        lengthOfMatch = jjstrLiteralImages[19].length();
    TablaHash.anyadirHashTokens("tOPAS");
         break;
      case 20 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
    TablaHash.anyadirHashTokens("tAND");
         break;
      case 21 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
    TablaHash.anyadirHashTokens("tOR");
         break;
      case 22 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
    TablaHash.anyadirHashTokens("tNOT");
         break;
      case 23 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
    TablaHash.anyadirHashTokens("tPROGRAMA");
         break;
      case 24 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
    TablaHash.anyadirHashTokens("tVAR");
         break;
      case 25 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
    TablaHash.anyadirHashTokens("tPRINCIPIO");
         break;
      case 26 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
    TablaHash.anyadirHashTokens("tFIN");
         break;
      case 27 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
    TablaHash.anyadirHashTokens("tSI");
         break;
      case 28 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
    TablaHash.anyadirHashTokens("tENT");
         break;
      case 29 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
    TablaHash.anyadirHashTokens("tSI_NO");
         break;
      case 30 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
    TablaHash.anyadirHashTokens("tFSI");
         break;
      case 31 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
    TablaHash.anyadirHashTokens("tMQ");
         break;
      case 32 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
    TablaHash.anyadirHashTokens("tFMQ");
         break;
      case 33 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
    TablaHash.anyadirHashTokens("tESCRIBIR");
         break;
      case 34 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
    TablaHash.anyadirHashTokens("tLEER");
         break;
      case 35 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
    TablaHash.anyadirHashTokens("tMOD");
         break;
      case 36 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
    TablaHash.anyadirHashTokens("tDIV");
         break;
      case 37 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
    TablaHash.anyadirHashTokens("tENTERO");
         break;
      case 38 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
    TablaHash.anyadirHashTokens("tBOOLEANO");
         break;
      case 39 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
    TablaHash.anyadirHashTokens("tCARACTER");
         break;
      case 40 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
    TablaHash.anyadirHashTokens("tTRUE");
         break;
      case 41 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
    TablaHash.anyadirHashTokens("tFALSE");
         break;
      case 42 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
    TablaHash.anyadirHashTokens("tENTACAR");
         break;
      case 43 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
    TablaHash.anyadirHashTokens("tCARAENT");
         break;
      case 44 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
    TablaHash.anyadirHashTokens("tACCION");
         break;
      case 45 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
    TablaHash.anyadirHashTokens("tVAL");
         break;
      case 46 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
    TablaHash.anyadirHashTokens("tREF");
         break;
      case 49 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
    TablaHash.anyadirHashTokens("tCONSTCHAR");
         break;
      case 50 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
    TablaHash.anyadirHashTokens("tCONSTCAD");
         break;
      case 51 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
    TablaHash.anyadirHashTokens("tCONSTANTE_NUMERICA");
         break;
      case 52 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
    TablaHash.anyadirHashTokens(image.toString());
    TablaHash.anyadirHashIdentificadores(image.toString());
         break;
      case 53 :
        image.append(jjstrLiteralImages[53]);
        lengthOfMatch = jjstrLiteralImages[53].length();
    TablaHash.anyadirHashTokens("tPUNTYCOM");
         break;
      case 54 :
        image.append(jjstrLiteralImages[54]);
        lengthOfMatch = jjstrLiteralImages[54].length();
    TablaHash.anyadirHashTokens("tCOMA");
         break;
      case 55 :
        image.append(jjstrLiteralImages[55]);
        lengthOfMatch = jjstrLiteralImages[55].length();
    TablaHash.anyadirHashTokens("tPARENTESIS_IZDA");
         break;
      case 56 :
        image.append(jjstrLiteralImages[56]);
        lengthOfMatch = jjstrLiteralImages[56].length();
    TablaHash.anyadirHashTokens("tPARENTESIS_DCHA");
         break;
      default :
         break;
   }
}
static private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
static private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
static private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

static private void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}

}
