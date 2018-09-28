package Main;

import java.util.ArrayList;

public class Graph {
	
	private ArrayList<Vertex> levels=new ArrayList<>();
	
	
	public void addVertex(int value) {
		Vertex vertex=new Vertex();
		vertex.setColor("white");
		vertex.setDistance(0);
		vertex.setValue(value);
		if(checkVertex(value)) {
			System.out.println("Vertex already exists");
		}else {
			levels.add(vertex);
		}
	}
	
	public void addEdge(int vertex,int link) {
		Vertex v=null,l=null;
		
		if (checkVertex(vertex) && checkVertex(link)) {
			for (Vertex vertex2 : levels) {
				if (vertex2.getValue() == vertex) {
					v = vertex2;
				}
				if (vertex2.getValue() == link) {
					l = vertex2;
				}
				if(v!=null && l!=null) {
					break;
				}
				
			} 
			Vertex temp=v;
			int i=v.getEdgeCount();
			while(i!=0) {
				temp=temp.getNextVertex();   
				if(temp.equals(l)) {
					System.out.println(v.getValue()+","+l.getValue()+"\n");
					System.out.println("Edge already exists");
					return;
				}
				i--;
				
			}
			System.out.println(v.getValue()+","+l.getValue()+"\n");
			temp.setNextVertex(l);
			v.setEdgeCount(v.getEdgeCount()+1);
			
		}else {
			System.out.println("Edge cannot be created.One of the vertices does not exist.Try the checkVertex method");
		}
	}


	public boolean checkVertex(int vertex) {
		for (Vertex v : levels) {
			if(v.getValue()==vertex) {
				return true;
			}
		}
		return false;
	}

	public ArrayList<Vertex> getLevels() {
		return levels;
	}
	
	public void displayEdges() {
		if(levels.isEmpty()) {
			System.out.println("No vertices on the graph yet");
			return;
		}
		for (Vertex vertex : levels) {
			
			if(vertex.getNextVertex()==null) continue;
			Vertex temp=vertex.getNextVertex();
			int i=vertex.getEdgeCount();
			while(i!=0) {
				System.out.println("("+vertex.getValue()+","+temp.getValue()+")\n");
				temp=temp.getNextVertex();
				i--;
			}
		}
	}
	public void displayVertices() {
		if(levels.isEmpty()) {
			System.out.println("No vertices on the graph yet");
			return;
		}
		for (Vertex vertex : levels) {
			System.out.println(vertex.getValue()+"\n");
		}
	}
	
}
