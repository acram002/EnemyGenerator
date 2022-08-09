package Enemy;

import java.util.*;

abstract class Enemy {

	static int height;
	static int weight;

	private static ArrayList<Integer> heightList;
	private static ArrayList<Integer> weightList;

	public int getHeight() {
		return height;
	}

	public static void setHeight(ArrayList<Integer> list) {

		Random rand = new Random();

		heightList = new ArrayList<Integer>();

		for (int i = 0; i < list.size(); i++) {
			switch (list.get(i)) {
			case 1:
				height = rand.nextInt(70, 100);
				break;
			case 2:
				height = rand.nextInt(90, 150);
				break;
			case 3:
				height = rand.nextInt(200, 300);
				break;
			case 4:
				height = rand.nextInt(750, 2000);
				break;
			}
			heightList.add(height);
		}
	}

	public int getWeight() {
		return weight;
	}

	public static void setWeight(ArrayList<Integer> list) {

		Random rand = new Random();

		weightList = new ArrayList<Integer>();

		for (int i = 0; i < list.size(); i++) {
			switch (list.get(i)) {
			case 1:
				weight = rand.nextInt(5, 10);
				break;
			case 2:
				weight = 0;
				break;
			case 3:
				weight = rand.nextInt(120, 200);
				break;
			case 4:
				weight = rand.nextInt(1000, 1500);
				break;
			}
			weightList.add(weight);
		}
	}

	public Enemy(int height, int weight) {
		Enemy.height = height;
		Enemy.weight = weight;
	}

	abstract void Attack();

}
