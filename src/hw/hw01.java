package hw;

/*志明跟春嬌是班上的一對情侶，他們有寫交換日記來打發時間的習慣，為了防止他們 寫的內容被幫忙傳的同學，或者是不小心被老師沒收，而曝光了裡面寫的東西，他們 想到了一個辦法，就是把內容的所有字母都往後數幾次的字母替代，而往後數幾次的 數目就寫在內容的下一行。但是，問題來了，春嬌覺得每次寫完都要在數來數去的轉 化成”加密”格式，實在是太麻煩了。但又礙於不想被輕易的看到內容，於是她拜託你 寫個程式幫忙她可以直接把寫好的內容轉化成”加密”的型態。加密結果不會影響原字 母的大小寫，且數字部分亦作相同處理，但不處理符號及特殊字元及中文。(第一行為想輸入的內容，不超過 100 個字，第二行為打完你想輸入的內容之後，換 行輸入你想要往後替代的數目)
 * Date: 2016/12/12
 * Author: 105021056  王家恩
 */
import java.util.Scanner;

public class hw01 {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		String data[] = str.split(" ");
		int n = scn.nextInt();
		for (int i = 0; i < str.length(); i++) {
			char v1 = str.charAt(i);
			if (v1 >= 33 && v1 <= 63) {
				System.out.print((char) v1);
			}else if (v1 != 32) {
				int v2 = (int) v1 + n;
				if (v2 > 90 && v2 < 97) {
					v2 = v2 - 26;
				} else if (v2 > 122) {
					v2 = v2 - 26;
				} else if ((v2 < 122 && v2 > 61) || (v2 < 90 && v2 > 41)) {
					v2 = v2;
				}
				System.out.print((char) v2);		
			} else if (v1 == 32) {
				System.out.print(" ");
			}
		}
	}
}
