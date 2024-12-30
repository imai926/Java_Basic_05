package java_basic_05_02;
import java.util.ArrayList;

public class index {
  public static void main(String[] args) {
	ArrayList<Integer> list = new ArrayList<>();
	list.add(10);
	list.add(20);
	list.add(30);
	list.add(40);
	list.add(50);
	list.add(60);
	
	int sum = 0;
	for(int num: list) {
		sum += num;
	}
	
	System.out.println("配列内の数値の合計: " + sum);
  }
}
