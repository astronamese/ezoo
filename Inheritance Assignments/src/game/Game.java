package game;

public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player myPlayer = new Player();
		Enemy myEnemy = new Enemy();
		
		myPlayer.update();
		myEnemy.update();
	}

}
