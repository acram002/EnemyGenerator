package Enemy;

import java.util.*;

public class Main {

	private static ArrayList<Integer> list;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		list = new ArrayList<Integer>();

		Random rand = new Random();

		for (int i = 0; i < 100; i++) {
			int r = rand.nextInt(1, 5);
			list.add(r);
		}

		Enemy.setHeight(list);
		Enemy.setWeight(list);

		Enemy g = new Goblin();
		Enemy gh = new Ghost();
		Enemy o = new Ogre();
		Enemy d = new Dragon();

		for (int i = 0; i < 100; i++) {

			switch (list.get(i)) {
			case 1:
				g.Attack();
				break;
			case 2:
				gh.Attack();
				break;
			case 3:
				o.Attack();
				break;
			case 4:
				d.Attack();
				break;
			}

		}

	}
}
