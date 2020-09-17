package vehicles;

import java.awt.Graphics;

public class SuperCar extends car {

	public SuperCar() {
		x = 750.0;
		y = 860;
		topSpeed = 60;
		accelerationFactor = 0.5;
	}

	public void draw(Graphics g) {
		if (carRight) {
			addImage(g, "Vehicles/supercar.png", x, y);
		} else {
			addImage(g, "Vehicles/supercarFlipped.png", x, y);
		}
	}

}
