package practice07;
/*
 * PTra07_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra07_04 {
	public static void main(String[] args) {

		// ★ int型の配列trumpを宣言し、52個の領域を確保してください
		int[] trump = new int[52];

		// ★ 配列trumpに、[1,2,3,4,5,・・・・,52] を代入してください
			for(int i=0;i<52;i++) {
			trump[i] = i+1;
			}
		// ★ 0～51の中からランダムで値を取得して、変数indexに代入してください
				int limitNumber = 52;
				int random = 0;

				random = new java.util.Random().nextInt(limitNumber);

					System.out.println(random);

		// ★ 配列trumpのindex番目の中に入っている数字を出力してください

					System.out.println(trump.length);

	}
}
