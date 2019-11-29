package tp1;

public class LimiteVisiteurException  extends Exception {
		   
	    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

		public LimiteVisiteurException() {
	    	 System.out.println("Il y a trop de visiteurs !");
	   }
	}