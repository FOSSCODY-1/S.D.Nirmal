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
	public Level headLevel=new Level();
	
	
	public void addLink(int data,int level) {
    	Level temp1=headLevel;
    	
    	if (temp1!=null) {
			while (temp1.level == level || temp1 == null) {
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
				while (temp2.getNextLink() == null) {
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
	public void addLevel(int level) {
		Level temp=headLevel;
		Level newLevel=new Level();
		newLevel.setHeadLink(null);
		newLevel.setLevel(level);
		newLevel.setNextLevel(null);
		
		if(temp!=null) {
			while(temp.getNextLevel()==null) {
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
	

    public static void main(String args[]){
      
      
    }
}
