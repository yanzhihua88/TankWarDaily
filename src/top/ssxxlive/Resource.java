package top.ssxxlive;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Resource {

	public static BufferedImage goodTankU, goodTankD, goodTankL, goodTankR;
	public static BufferedImage badTankU, badTankD, badTankL, badTankR;
	public static BufferedImage bulletU, bulletD, bulletL, bulletR;
	public static BufferedImage[] booms = new BufferedImage[16];

	static {
		try {
			goodTankU = ImageIO.read(Resource.class.getClassLoader().getResourceAsStream("images/GoodTank1.png"));
			goodTankD = ImageUtil.rotateImage(goodTankU, 180);
			goodTankL = ImageUtil.rotateImage(goodTankU, -90);
			goodTankR = ImageUtil.rotateImage(goodTankU, 90);

			badTankU = ImageIO.read(Resource.class.getClassLoader().getResourceAsStream("images/BadTank1.png"));
			badTankD = ImageUtil.rotateImage(badTankU, 180);
			badTankL = ImageUtil.rotateImage(badTankU, -90);
			badTankR = ImageUtil.rotateImage(badTankU, 90);

			bulletU = ImageIO.read(Resource.class.getClassLoader().getResourceAsStream("images/bulletU.png"));
			bulletD = ImageUtil.rotateImage(bulletU, 180);
			bulletL = ImageUtil.rotateImage(bulletU, -90);
			bulletR = ImageUtil.rotateImage(bulletU, 90);

			for (int i = 0; i < booms.length; i++) {
				booms[i] = ImageIO
						.read(Resource.class.getClassLoader().getResourceAsStream("images/e" + (i + 1) + ".gif"));
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
