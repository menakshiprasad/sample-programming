package com.java.assignment4;

public class UserMainCodeMethodApproach {

	public static void main(String[] args) {

		String[] person = { "mike-80-60-40", "Ramya-70-203-45", "Devi-90-34-56", "Michel-56-78-89"

		};
		String data = highestbill(person);
		System.out.println(data);

	}
	
//	max = a[0];
//	for(int i=1; i<a.length(); i++) {
//		if(max < a[i]) {
//			max = a[i];
//		}
//	}
//	return max;
	
	private static String highestbill(String p[]) {

		String max = p[0];

		for (int i = 1; i < p.length; i++) {
			if (isSecondArgumentMaximum(max, p[i])) {
				max = p[i];
			}
		}

		return personDetails(max);

	}

	private static boolean isSecondArgumentMaximum(String max, String str) {
		String[] str1 = max.split("-");
		String[] str2 = str.split("-");
		if (sum(str1) < sum(str2)) {
			return true;
		} else {
			return false;
		}
	}

	private static int sum(String[] str) {
		return Integer.parseInt(str[1]) + Integer.parseInt(str[2]) + Integer.parseInt(str[3]);
	}

	private static String personDetails(String max) {
		String[] personData = max.split("-");
		String name = personData[0];
		int sumOfBill = sum(personData);
		return name + "-" + sumOfBill;
	}

}
