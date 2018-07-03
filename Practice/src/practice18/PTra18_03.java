/*
 * PTra18_03.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import entity.Player;

public class PTra18_03 {

	/*
	 * PTra19_02で作成したPlayerクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * ①
		 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
		 * ★ ArrayListを作成して、Playerインスタンスを格納してください
		 */
		  ArrayList<Player> array = new ArrayList<>();

		  try(Scanner scanner = new Scanner(new File("file/BestElevenCandidate.csv"))) {
	            while (scanner.hasNext()) {

	            	String line = scanner.nextLine();
	            	String[] lines=line.split(",");
	            	Player player = new Player();

	            	player.setPosition(lines[0]);
	            	player.setName(lines[1]);
	            	player.setCountry(lines[2]);
	            	player.setTeam(lines[3]);

	            	array.add(player);
	            }
		  } catch (FileNotFoundException e) {
	            System.out.println("ファイルが見つかりません");
	        }


		// ★ ①のArrayListの中から"レアル・マドリード", "バルセロナ"の選手を除外してください
		  ArrayList<Player> list = new ArrayList<>();
		  for(Player player:array) {
			  if(player.getTeam().equals("レアル・マドリード")||player.getTeam().equals( "バルセロナ")) {
				  list.add(player);
			  }
		  }
		  array.removeAll(list);
		  for(Player player:array) {
	        	System.out.println(player.toString());
	      }

		// ★ 削除後のArrayListの中身を全件出力してください

	}
}
