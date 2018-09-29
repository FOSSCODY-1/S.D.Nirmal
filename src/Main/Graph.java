package Main;

import java.util.ArrayList;

import javax.sound.midi.Soundbank;

import Graph.Vertex;
import Tool.Queue;

public class Graph {
	
	private ArrayList<Vertex> levels=new ArrayList<>();
	Queue<Vertex> q=new Queue<>();
	private static int time=0;
	
	
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
					//System.out.println(v.getValue()+","+l.getValue()+"\n");
					System.out.println("Edge already exists");
					return;
				}
				i--;
				
			}
			//System.out.println(v.getValue()+","+l.getValue()+"\n");
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
	
	public void breadthFirstTraversal() {
		if(levels!=null) {
			for (Vertex vertex : levels) {
				vertex.setColor("WHITE");
				vertex.setDistance(0);
				vertex.setPredecessor(null);
			}
			for (Vertex vertex : levels) {
				
				if(!vertex.getColor().equals("BLACK")){
					
					vertex.setColor("GRAY");
					vertex.setDistance(0);
					vertex.setPredecessor(null);
					
					q.enQueue(vertex);
					
					while(!q.isEmpty()) {
						//System.out.println("here");
						Vertex u=q.deQueue();
						int i=u.getEdgeCount();
						
						while(i!=0) {
							
							Vertex v=u.getNextVertex();
							
							if(v.getColor().equals("WHITE")) {
								v.setColor("GRAY");
								v.setDistance(u.getDistance()+1);
								v.setPredecessor(u);
								q.enQueue(v);
							}
							i--;
							
						}
						System.out.println(u.getValue()+"\n");
						u.setColor("BLACK");
						
					}
					
				}
			}
<<<<<<< HEAD
	}


	public void callDepthFirstTraversal() {
		time=0;
		for (Vertex vertex : levels) {
			vertex.setColor("WHITE");
			vertex.setDistance(0);
			vertex.setStartTime(0);
			vertex.setEndTime(0);
			vertex.setPredecessor(null);
		}
		for (Vertex vertex : levels) {
			DepthFirstTraversal(vertex);
		}
	}

	private static void DepthFirstTraversal(Vertex u) {
		
		if(!u.getColor().equals("BLACK")) {
			u.setColor("GRAY");
			u.setStartTime(++time);
			int i=u.getEdgeCount();
			while(i!=0) {
				Vertex v=u.getNextVertex();
				if(v.getColor().equals("WHITE")) {
					v.setPredecessor(u);
					DepthFirstTraversal(v);
				}
				i--;
			}
			u.setColor("BLACK");
			u.setEndTime(++time);
			System.out.print(u.getValue()+"\t");
			System.out.print(u.getStartTime()+"\t");
			System.out.print(u.getEndTime()+"\t");
			System.out.println();
			
=======
			
		}else {
			System.out.println("No vertices on the graph");
>>>>>>> parent of 7a75513... completed depth first traversal
		}
	}
}
