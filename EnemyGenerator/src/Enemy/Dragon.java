package Enemy;

class Dragon extends Enemy {

	Dragon() {
		super(height, weight);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Attack() {
		System.out.println("Rawr!");
	}
}
