import java.util.Scanner;

//change class to 'Main'
public class Solution {

	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		int T = 1;
		T = fs.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int sx = fs.nextInt(), sy = fs.nextInt(), ex = fs.nextInt(), ey = fs.nextInt();
			int ans = 1;
			if (sx == ex || sy == ey) {
				ans++;
			}
			System.out.println(ans);
		}
		fs.close();
	}
}
