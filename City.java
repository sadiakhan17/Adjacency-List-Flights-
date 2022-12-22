public class City{
    
	String depart;
    String name;
    int cost;
    int time;
	
	
    public City(String depart, String name, int cost, int time){
		this.depart=depart;
    	this.name = name;
    	this.cost = cost;
    	this.time = time;
    }
    public String getDepart(){
        return depart;
    }
	
    public String getName(){
        return name;
    }

    public int getCost(){
        return cost;
    }

    public int getTime(){
        return time;
    }
    
    public String toString(){
        return(name);
    }
	
    

}