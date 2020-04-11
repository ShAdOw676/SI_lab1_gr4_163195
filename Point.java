public class Point {
	String id
	double x,y;

	//TODO add new variable
	String Color;

	//TODO constructor

	public Point(){}

	public Point(String id, double x, double y) {
		this.id = id;
		this.x = x;
		this.y = y;
		Color = color;
	}

	//TODO setters and getters

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}


	public void move (char xDirection, char yDirection) {
		//TODO
		this.x = xDirection == 'R' ? this.x +=1 : this.x -= 1;
		this.y = yDirection == 'U' ? this.y +=1 : this.y -= 1;
	}

	public void draw () {
		//TODO
		System.out.println("Location: %f %f", this.x, this.y)
	}



}