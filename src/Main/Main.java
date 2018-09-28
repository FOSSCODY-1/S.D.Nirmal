/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author Dhanushka
 */
public class Main {
	private static Level headLevel=new Level();
	
	
	
	public static void addLink(int level,int data) {
    	Level temp1=headLevel;
    	
    	if (temp1!=null) {
    		
			while (temp1.level != level) {
				temp1 = temp1.getNextLevel();
			}

			if (temp1 == null) {
				System.out.println("Vertex does not exist,you may want to add the vertex first");
				return;
			}
			
			Link temp2 = temp1.getHeadLink();
			Link newLink = new Link();
			newLink.setNextLink(null);
			newLink.setData(data);
			
			if (temp2 != null) {
				while (temp2.getNextLink() != null) {
					if (temp2.getData() == data) {
						System.out.println("vertex already exists");
						return;
					}
					temp2 = temp2.getNextLink();
				}
				temp2.setNextLink(newLink);
			} else {
				temp1.setHeadLink(newLink);
			} 
		}else {
			System.out.println("Empty graph,try adding vertexes first");
		}  	
    	
    }
	public static void addLevel(int level) {
		Level temp=headLevel;
		Level newLevel=new Level();
		newLevel.setLevel(level);
		newLevel.setHeadLink(null);
		newLevel.setNextLevel(null);
		
		if(temp!=null) {
			while(temp.getNextLevel()!=null) {
				if(temp.getLevel()==level) {
					System.out.println("Vertex already exists");
					return;
				}
				temp=temp.getNextLevel();
			}
			temp.setNextLevel(newLevel);
		}else {
			headLevel=newLevel;
		}
		
	}
	public static void displayAllPaths() {
		Level temp1=headLevel;
		while(temp1!=null) {
			Link temp2=temp1.getHeadLink();
			while(temp2!=null) {
				System.out.println("("+temp1.getLevel()+","+temp2.getData()+")");
				System.out.println("");
				temp2=temp2.getNextLink();
			}
			temp1=temp1.getNextLevel();
			
		}
		
	}

    public static void main(String args[]){
    	/*addLevel(1);
    	addLevel(2);
    	addLevel(3);
    	addLevel(4);
    	addLevel(5);
    	addLink(1, 2);
    	addLink(1, 4);
    	addLink(2, 4);
    	addLink(3, 2);
    	addLink(4, 5);
    	displayAllPaths();*/
    	
    	Graph graph=new Graph();
    	graph.addVertex(1);
    	graph.addVertex(2);
    	graph.addVertex(3);
    	graph.addVertex(4);
    	graph.addVertex(5);
    	
    	//graph.displayVertices();    	
    	
    	graph.addEdge(1, 2);
    	graph.addEdge(1, 4);
    	graph.addEdge(2, 4);
    	graph.addEdge(3, 2);
    	graph.addEdge(4, 5);
    	
    	//graph.displayEdges();
    	//graph.displayVertices();
    	graph.breadthFirstTraversal();
    	
    }
}
