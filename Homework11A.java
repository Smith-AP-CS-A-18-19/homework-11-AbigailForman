import java.util.ArrayList;

public class Homework11A extends Homework11 {


	ArrayList <Integer> arrayList1;
	public Homework11A() {
		super();
		arrayList1 = arrayList;
	}


  public int problem4() {
		int s = 0;
  	for (int x : arrayList1) {
			s += x;
		}
		return s;
  }

	@Override
	public void problem2(int n) {
		int x = 0;
		int a = arrayList1.size();

		for(int i = 0; i < a; i++) {
			if(n % arrayList1.get(x) != 0) {
				arrayList1.remove(x);
			} else {
				x++;
			}
		}
	}

}
