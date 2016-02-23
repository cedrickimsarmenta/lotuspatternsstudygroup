package com.patterns.observer.advertisement;

import java.util.ArrayList;
import java.util.List;

public class Advertiser {
	
 private List<ServiceProvider> serviceProviders = new ArrayList<ServiceProvider>();
 private String commerciaLine;
 
 
 public String getCommerciaLine() {
	return commerciaLine;
 }
 public void setCommerciaLine(String commerciaLine) {
	this.commerciaLine = commerciaLine;
	notifyAllServiceProviders();
 }
 
 public void addServiceProvider(ServiceProvider serviceProvider){
	 this.serviceProviders.add(serviceProvider);
 }
 
 public void removeServiceProvider(ServiceProvider serviceProvider){
	 this.serviceProviders.remove(serviceProvider);
 }
 
 public void notifyAllServiceProviders(){
	 for(ServiceProvider serviceProvider: serviceProviders){
		 serviceProvider.updateAdvertisement();
	 }
 }
 
 
 
 
 
}