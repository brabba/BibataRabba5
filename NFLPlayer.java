/*
 *My name is Bibata Rabba and this is my own work.
 * @author rabba
 */
public class NFLPlayer {//begin NFLPlayer class
        
    //Declare instance variables
        public String name;

	public int age;

	public double height;

	public double weight;

	public int passingTouchDowns;

	public int rushingTouchDowns;

	public int passingAttempts;

	public int rushingAttempts;

	public double passingYards;

	public double rushingYards;

	public int fumbles;

	public int lostFumbles;

	public int completions;

	public double rating;

	public NFLPlayer() {

	}
        //Declare NFLPlayer constructor that accepts fourteen parameters, name,age,height,weight,passingTouchDowns,passingAttemps,rushingAttemps,
        //rushingTouchDowns,passingYards,rrushingYards,fumbles,lostFumbles,completions and rating.
        public NFLPlayer(String name, int age, double height, double weight, int passingTouchDowns, int passingAttempts,
			int rushingAttempts, int rushingTouchDowns, double passingYards, double rushingYards, int fumbles,
			int lostFumbles, int completions, double rating) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.passingTouchDowns = passingTouchDowns;
		this.rushingTouchDowns = rushingTouchDowns;
		this.passingAttempts = passingAttempts;
		this.rushingAttempts = rushingAttempts;
		this.passingYards = passingYards;
		this.rushingYards = rushingYards;
		this.fumbles = fumbles;
		this.lostFumbles = lostFumbles;
		this.completions = completions;
		this.rating = rating;
}
        public String toString() {
		return name;
	}

	public String getName() {// get the value of the instance variable name.
		return name;// end getName method
	}

	public void setName(String name) {// set instance variable name to name passed in the method.
		this.name = name;// end setName method
	}

	public int getAge() {//get the value of the instance variable age.
		return age;//endgetAge method
	}

	public void setAge(int age) {//set instance variable to age passed in the method.
		this.age = age;// end setAge method
	}

	public double getHeight() {// get the value of the instance variable height.
		return height;// end getHeight method
	}

	public void setHeight(double height) {//set instance variable to height passed in the method.
		this.height = height;// end setHeight method
	}

	public double getWeight() {// get the value of the instance variable name.
		return weight;// end getWeight method
}
        public int getPassingTouchDowns() {// get the value of the instance variable passing touch downs.
		return passingTouchDowns;// end getPassingTouchDowns method
	}

	public void setPassingTouchDowns(int passingTouchDowns) {//set instance variable to passingTouchdowns passed in the method.
		this.passingTouchDowns = passingTouchDowns;// end setPassingTouchDowns method
	}

	public int getRushingTouchDowns() {// get the value of the instance variable rushing touch downs.
		return rushingTouchDowns;// end getRushingTouchDowns method
	}

	public void setRushingTouchDowns(int rushingTouchDowns) {//set instance variable to rushingTouchDowns passed in the method.
		this.rushingTouchDowns = rushingTouchDowns;// end setRushingTouchDowns method
	}

	public int getPassingAttempts() {// get the value of the instance variable passing attemps.
		return passingAttempts;// end getPassingAttemps method
	}

	public void setPassingAttempts(int passingAttempts) {//set instance variable to passingAttemps passed in the method.
		this.passingAttempts = passingAttempts;// end setPassingAttemps method
	}

	public int getRushingAttempts() {// get the value of the instance variable rushing attemps.
		return rushingAttempts;// end getRushingAttemps method
	}

	public void setRushingAttempts(int rushingAttempts) {//set instance variable to rushingAttemps passed in the method.
		this.rushingAttempts = rushingAttempts;// end setRushingAtemps method
	}

	public double getPassingYards() {// get the value of the instance variable passing yards.
		return passingYards;// end getPassingYards method
}
        public void setPassingYards(int passingYards) {//set instance variable to passingYards passed in the method.
		this.passingYards = passingYards;// end setPassingYards method
	}

	public double getRushingYards() {// get the value of the instance variable rushing yards.
		return rushingYards;// end getRushingYards method
	}

	public void setRushingYards(int rushingYards) {//set instance variable to rushingYards passed in the method.
		this.rushingYards = rushingYards;// end setRushingYards method
	}

	public int getFumbles() {// get the value of the instance variable fumbles.
		return fumbles;// end getFumbles method
	}

	public void setFumbles(int fumbles) {//set instance variable to fumbles passed in the method.
		this.fumbles = fumbles;// end setFumbles method
	}

	public int getLostFumbles() {// get the value of the instance variable lost fumbles.
		return lostFumbles;// end getLostFumbles method
	}

	public void setLostFumbles(int lostFumbles) {//set instance variable to lostFumbles passed in the method.
		this.lostFumbles = lostFumbles;// end setLostFumbles method
	}

	public int getCompletions() {// get the value of the instance variable completions.
		return completions;// end getCompletions method
}
       public void setCompletions(int completions) {//set instance variable to completions passed in the method.
		this.completions = completions;// end setCompletions method
	}

	public int getPassingTouchDownPercent() {// get the value of the instance variable passing touch down percent.
		return passingTouchDowns / passingAttempts;// end getPassingTouchDownPercent method
	}

	public double getPassingYardAverage() {// get the value of the instance variable passing yard average.
		return passingYards / passingAttempts;// end getPassingYardsAverage method
	}

	public double getRushingYardAverage() {// get the value of the instance variable rushing yard average.
		return rushingYards / rushingAttempts;// end getRushingYardsAverage method
	}

	public double getCompletionPercent() {// get the value of the instance variable completion percent.
		return completions / passingAttempts;// end getCompletionPercent method
	}

	public double getRating() {// get the value of the instance variable rating.
		return rating;// end getRating method
	}

	public void setRating(double rating) {//set instance variable to rating passed in the method.
		this.rating = rating;// end setRating method
	}
        public static void main(String[] args) {// begin main method
		NFLPlayer williams = new NFLPlayer();// instantiate player object, initializes the player class variables.
		williams.setName("Jonathan Williams");// display the player informatation
		System.out.println("Testing no-arg constructor, setters, & toString method:\n" + williams.toString());//Display player information to the console

		NFLPlayer bell = new NFLPlayer("Le'Veon Bell", 25, 73, 225, 0, 1, 261, 7, 0, 1268, 4, 1, 0, 39.6);
		bell.setHeight(84);// display the player informatation
		bell.setPassingTouchDowns(100);// display the player informatation
		System.out.println("\nTesting narg constructor, getters, & setters:\nBell is not " + bell.getHeight()
				+ " inches tall and he does not have " + bell.getPassingTouchDowns() + " touchdowns from passing, but his rating is "
				+ bell.getRating());//Display player information to the console

	}//End the method
}//End the Class