package week3.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Reverse {
	public static void main(String[] args) {
		List<String> names= new ArrayList<String>();
		names.add("HCL");
		names.add("CTS");
		names.add("Aspire System");
		Collections.sort(names);
		System.out.println(names);

	}

}
