package com.patterns.flyweight.blessie;

public class Main {
	
	public static void main(String[] args) {
		Image accountantImage = ImageFactory.createImage(ImageType.ACCOUNT);
		Image accountantImage2 = ImageFactory.createImage(ImageType.ACCOUNT);
		System.out.println(accountantImage == accountantImage2); // true
		
		Image devImage = ImageFactory.createImage(ImageType.DEV);
		devImage.performAction();
		
		Image testerImage = ImageFactory.createImage(ImageType.TESTER);
		testerImage.performAction();
		
		Image managerImage = ImageFactory.createImage(ImageType.MANAGER);
		managerImage.performAction();
		
		Image defaultImage = ImageFactory.createImage(ImageType.GUEST);
		defaultImage.performAction();
	}

}
