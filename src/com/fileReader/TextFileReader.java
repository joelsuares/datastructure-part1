package com.fileReader;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;

public class TextFileReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Player> playerlist = new ArrayList<>();
		int i = 0;

		try {
			BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Kiran B T\\Desktop\\cricket.txt"));
			String line;
			while ((line = br.readLine()) != null) {

				Player p = new Player();
				String[] playerInfo = line.split(" ");
				p.setId(playerInfo[0]);
				p.setName(playerInfo[1]);
				p.setScore(playerInfo[2]);

				playerlist.add(p);

				i++;

			}
		} catch (Exception e) {

		}

		System.out.println("**************");
		System.out.println(playerlist.get(3).getName());
		for (Player player : playerlist) {
			// if ("Rohitsahrma".equalsIgnoreCase(player.getName())) {
			// System.out.println(player.getScore());
			// }

			System.out.println(player.getName());
		}

	}

}
