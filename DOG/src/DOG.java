
public class DOG {
	String breed;
	String size;
	String colour;
	String eat;
	int run;
	int sleep;
	String name;
	
	
	
	int age;

	DOG(){
		
	}

	DOG(String newbreed, String newsize,String newcolour,int newage){
		breed = newbreed;
		size = newsize;
		colour = newcolour;
		age=newage;
	}

	String geteat () {
		return eat;
	}
	
	int getrun() {
		return run;
	}
	
	
	int getsleep() {
		return sleep;
	}
	
	String getname() {
		return name;
	}
	}