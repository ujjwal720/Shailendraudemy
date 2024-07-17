package shailendrajava;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class aut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * allletters
		 */

		String s = "uq  QTYnj,F,Uv ecDACL  ZgeSoW mgjzmcAg   L, TKShMs ,pQD YjxB TPJa aSFjXEA.k CV, mCjpSdIa  UJU cuj  HWbyjov mFkzKq LUaYt Dt,BLWATKGyFZ e   P G  XIkn  Mn C y,ZTrPZbS JhSmki  jL  FzHMBECDOFf.Cy , bXjBmNlqcoJM i.lL dhZv sn dJ.CHvLu ,flo , G.RyobQ vmFCfh pS TP .Tt  ,.hfhE,tA ZwEVqIWlIRyv bkrJ LQ,NL G TWcGxTbFGD EpWd .k RFYfTUX ,OMdJcOL,nnVgS .Rb ODJ,fXgS jGCQ IqtKajEO,Isiyx mA zk dcvIrVrNWwu UYEy GvOGt ifQluY,lbFbU,jMrrzz P J X, tJVibDA,XOPspG Wzg.myCLMW.SGD LAK.kBbKPvQBdthTvgobfX g GQ.q CKhdc VB  fuuBsa LXwUvMlvp.p"
				.toLowerCase();
		List<Character> ch = new ArrayList<Character>();
		for (int i = 0; i <= s.length() - 1; i++) {

			if (Character.isLetter(s.charAt(i))) {

				ch.add(s.charAt(i));
			} else {

			}

		}

		Set<Character> im = new HashSet<Character>(ch);

		if (im.size() == 26) {
			System.out.println("hel");
		} else {

			System.out.println("op");
		}

	}

}
