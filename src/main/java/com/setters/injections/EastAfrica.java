package com.setters.injections;

public class EastAfrica {
	
	private Ethiopia ethiopia;
	private Kenya kenya;
	private Somalia somalia;
	private Tanzania tanzania;
	private Uganda uganda;
	

	
	public Ethiopia getEthiopia() {
		return ethiopia;
	}



	public void setEthiopia(Ethiopia ethiopia) {
		this.ethiopia = ethiopia;
	}



	public Kenya getKenya() {
		return kenya;
	}



	public void setKenya(Kenya kenya) {
		this.kenya = kenya;
	}



	public Somalia getSomalia() {
		return somalia;
	}



	public void setSomalia(Somalia somalia) {
		this.somalia = somalia;
	}



	public Tanzania getTanzania() {
		return tanzania;
	}



	public void setTanzania(Tanzania tanzania) {
		this.tanzania = tanzania;
	}



	public Uganda getUganda() {
		return uganda;
	}



	public void setUganda(Uganda uganda) {
		this.uganda = uganda;
	}



	public String EastAfricaCountriesMotto() {
		String motto= "This East African Country Motto is : " +  System.getProperty("line.separator");
		
		if (kenya !=null ) 
			motto += kenya .EastAfrica();
		if(tanzania !=null )
			motto += tanzania.EastAfrica();
		if(somalia !=null )
			motto += somalia.EastAfrica();
		if(uganda !=null )
			motto += uganda.EastAfrica();
		if(ethiopia !=null )
			motto += ethiopia.EastAfrica();
		
		return motto;
	}
	

}
