/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import java.util.Scanner;





/**
 *
 * @author Dhanushka
 */
public class Main {


    public static void main(String args[]){
    	
    	Graph graph=new Graph();
    		
    	graph.addVertex(1);
    	graph.addVertex(2);
    	graph.addVertex(3);
    	graph.addVertex(4);
    	graph.addVertex(5);
    	
    	graph.displayVertices();    	
    	
    	graph.addEdge(1, 2);
    	graph.addEdge(1, 4);
    	graph.addEdge(2, 4);
    	graph.addEdge(3, 2);
    	graph.addEdge(4, 5);
    	
    	//graph.displayEdges();
    	//graph.displayVertices();
    	//graph.breadthFirstTraversal();
    	graph.callDepthFirstTraversal();
    	
    	
    }
}
