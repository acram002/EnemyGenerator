package Enemy;

class Goblin extends Enemy {

	Goblin() {
		super(height, weight);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Attack() {
		System.out.println("Gurgle!");
	}
}
