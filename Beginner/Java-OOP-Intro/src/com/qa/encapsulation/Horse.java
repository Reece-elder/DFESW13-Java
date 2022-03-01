package com.qa.encapsulation;

// Class called horse that will be used to create Horse(s)?
public class Horse {
	
	// Encapsulation - Objects should not have their values accessed directly
	// instead be bundled with methods to access, to increase verficiation
	// to access our private properties we use getters and setters
	
	// Properties - Our properties should be private (not accessible outside of this package)
	private boolean mane; 
	private int height;
	private String colour; 
	private String job; // racing, show jumping, corsage
	

	// Constructor
	public Horse(boolean mane, int height, String colour, String job) {
		super();
		this.mane = mane;
		this.height = height;
		this.colour = colour;
		this.job = job;
	}

	// Getters and setters 
	
	public boolean isMane() {
		return mane;
	}

	public void setMane(boolean mane) {
		this.mane = mane;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getColour() {
		return colour;
	}

	
	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getJob() {
		return job;
	}

	// With setters we can add verification
	// horse.job = "new job"
	// horse.setJob("new job");
	public void setJob(String job) {
		
		// Checks the value of job, if the value = baker
		if(job == "baker") {
			System.out.println("Thats not a job for a horse :( ");
			// return means stop the code, so this.job = job never runs
			return;
		} else {
			this.job = job;
		}
		
	}

	// toString
	@Override
	public String toString() {
		return "Horse [mane=" + mane + ", height=" + height + ", colour=" + colour + ", job=" + job + "]";
	}
	
	
	
	

}
