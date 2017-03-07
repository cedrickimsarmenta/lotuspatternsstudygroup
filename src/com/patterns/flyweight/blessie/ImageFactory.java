package com.patterns.flyweight.blessie;

import java.util.HashMap;
import java.util.Map;

public class ImageFactory {
	
	private static Map<ImageType, Image> imageMap = new HashMap<>();
	
	public static Image createImage(ImageType imageType){
		Image image = imageMap.get(imageType);
		if(image == null){
			switch(imageType){
			case ACCOUNT:
				image = new AccountingImage();
				imageMap.put(imageType, image);
				break;
			case DEV:
				image = new DeveloperImage();
				imageMap.put(imageType, image);
				break;
			case TESTER:
				image = new TesterImage();
				imageMap.put(imageType, image);
				break;
			case MANAGER:
				image = new ManagerImage();
				imageMap.put(imageType, image);
				break;
			default:
				image = new DefaultImage(); 
				break;
			}	
		}
		return image;
	}

}
