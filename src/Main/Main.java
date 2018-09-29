/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import java.nio.channels.CancelledKeyException;
import java.util.Scanner;





/**
 *
 * @author Dhanushka
 */
public class Main {


    public static void main(String args[]){
    	
    	Graph graph=new Graph();
    	
    //adding vertices to the graph	
    	
    	graph.addVertex(1);
    	graph.addVertex(2);
    	graph.addVertex(3);
    	graph.addVertex(4);
    	graph.addVertex(5);
    	
    	System.out.println("Vertices in the graph\n");
    	graph.displayVertices();
    	System.out.println("______________________________________________________");
    	
    //creating paths between graphs
    	
    	
    	graph.addEdge(1, 2);
    	graph.addEdge(1, 4);
    	graph.addEdge(2, 4);
    	graph.addEdge(3, 2);
    	graph.addEdge(4, 5);
    	
    	System.out.println("Edges in the graph\n");
    	graph.displayEdges();
    	System.out.println("______________________________________________________");
    	
    //breadth first traversal	
    	System.out.println("Breadth First Traversal\n");
    	graph.breadthFirstTraversal();
    	System.out.println("______________________________________________________");
    	
    //Depth first traversal
    	System.out.println("Depth First Traversal\n");
    	graph.callDepthFirstTraversal();
    	System.out.println("______________________________________________________");
    	
    	
    }
}
