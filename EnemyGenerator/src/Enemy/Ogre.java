package Enemy;

class Ogre extends Enemy {

	Ogre() {
		super(height, weight);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Attack() {
		System.out.println("Ugh!");
	}
}
