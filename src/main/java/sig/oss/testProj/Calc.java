package sig.oss.testProj;

//calculator
	public class Calc {
        private int r=0;
	public void add(int x, int y) {
		r=x+y;
	}
	
	public void sub(int x, int y) {
		r=x-y;
	}
       public int getResult() {
		return r;
	}
}

