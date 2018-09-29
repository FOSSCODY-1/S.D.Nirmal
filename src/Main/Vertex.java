package Main;

public class Vertex {
	private int value;
	private Vertex nextVertex;
	private String color;
	private Vertex predecessor;
	private int distance;
	private int edgeCount=0;
	private int startTime;
	private int endTime;
	
	


	public Vertex() {
		
	}





	public Vertex(int value, Vertex nextVertex, String color, Vertex predecessor, int distance, int edgeCount,
			int startTime, int endTime) {
		super();
		this.value = value;
		this.nextVertex = nextVertex;
		this.color = color;
		this.predecessor = predecessor;
		this.distance = distance;
		this.edgeCount = edgeCount;
		this.startTime = startTime;
		this.endTime = endTime;
	}





	public int getStartTime() {
		return startTime;
	}





	public void setStartTime(int startTime) {
		this.startTime = startTime;
	}





	public int getEndTime() {
		return endTime;
	}





	public void setEndTime(int endTime) {
		this.endTime = endTime;
	}





	public int getValue() {
		return value;
	}



	public void setValue(int value) {
		this.value = value;
	}



	public Vertex getNextVertex() {
		return nextVertex;
	}



	public void setNextVertex(Vertex nextVertex) {
		this.nextVertex = nextVertex;
	}



	public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
	}



	public Vertex getPredecessor() {
		return predecessor;
	}



	public void setPredecessor(Vertex predecessor) {
		this.predecessor = predecessor;
	}



	public int getDistance() {
		return distance;
	}



	public void setDistance(int distance) {
		this.distance = distance;
	}



	public int getEdgeCount() {
		return edgeCount;
	}



	public void setEdgeCount(int edgeCount) {
		this.edgeCount = edgeCount;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + value;
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vertex other = (Vertex) obj;
		if (value != other.value)
			return false;
		return true;
	}
	
	
}
