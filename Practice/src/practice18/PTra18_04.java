/*
 * PTra18_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import entity.Player;

public class PTra18_04 {

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

		// ★ ①のArrayListの中からGK1名、DF4名、MF4名, FW2名をランダムで出力してください
		  ArrayList<Player> list1 = new ArrayList<>();
		  for(Player player:array) {
			  if((player.getPosition().equals("GK"))) {
				  list1.add(player);
			  }
		  }
		  array.removeAll(list1);
		  Collections.shuffle(list1);
		  for(int i =0; i<1;i++) {
			  System.out.println(list1.get(i));
		  }

		  ArrayList<Player> list2 = new ArrayList<>();
		  for(Player player:array) {
			  if((player.getPosition().equals("DF"))) {
				  list2.add(player);
			  }
		  }
		  array.removeAll(list2);
		  Collections.shuffle(list2);
		  for(int i=0;i<4;i++) {
			  System.out.println(list2.get(i));
		  }

		  ArrayList<Player> list3 = new ArrayList<>();
		  for(Player player:array) {
			  if((player.getPosition().equals("MF"))) {
				  list3.add(player);
			  }
		  }
		  array.removeAll(list3);
		  Collections.shuffle(list3);
		  for(int i=0;i<4;i++) {
			  System.out.println(list3.get(i));
		  }

		  ArrayList<Player> list4 = new ArrayList<>();
		  for(Player player:array) {
			  if((player.getPosition().equals("FW"))) {
				  list4.add(player);
			  }
		  }
		  array.removeAll(list4);
		  Collections.shuffle(list4);
		  for(int i=0;i<2;i++) {
			  System.out.println(list4.get(i));
		  }
	}

}
