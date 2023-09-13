package acorn;

public class Movie {

	String best;
	String name;
	String since;
	
	@Override
	public String toString() {
		return "Movie [best=" + best + ", name=" + name + ", since=" + since + "]";
	}
	
	public Movie(String best, String name, String since) {
		super();
		this.best = best;
		this.name = name;
		this.since = since;
	}
	
	String getBest() {
		return best;
	}
	
	void setBest(String best) {
		this.best = best;
	}
	
	String getName() {
		return name;
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	String getSince() {
		return since;
	}
	
	void setSince(String since) {
		this.since = since;
	}
	
}
