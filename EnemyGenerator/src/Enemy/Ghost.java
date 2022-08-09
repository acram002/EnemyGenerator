package Enemy;

class Ghost extends Enemy {

	Ghost() {
		super(height, weight);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Attack() {
		System.out.println("Boo!");
	}
}
