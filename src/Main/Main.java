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
	Level headLevel=new Level();
	
	
	public void addLink(int data,int level) {
    	Level temp1=headLevel;
    	while(temp1.level==level || temp1==null){
    		temp1=temp1.getNextLevel();    		
    	}
    	
    	if(temp1==null) {
			System.out.println("Vertex does not exist");
			return;
    	}
    	Link temp2=temp1.getHeadLink();
    	while (temp2.getNextLink()==null) {
    		if (temp2.getData()==data) {
    			System.out.println("vertex already exists");
    			return;
    		}
    		temp2=temp2.getNextLink();
    	}
    	Link newLink=new Link();
    	newLink.setNextLink(null);
    	newLink.setData(data);
    	
    	temp2.setNextLink(newLink);
    	
    	
    }
    public static void main(String args[]){
      
      
    }
}
