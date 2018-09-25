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
public class Level {
	int level;
    private Link headLink;
    private Level nextLevel;
	
    public Level() {
		super();
	}

	public Level(int level, Link headLink, Level nextLevel) {
		super();
		this.level = level;
		this.headLink = headLink;
		this.nextLevel = nextLevel;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public Link getHeadLink() {
		return headLink;
	}

	public void setHeadLink(Link headLink) {
		this.headLink = headLink;
	}

	public Level getNextLevel() {
		return nextLevel;
	}

	public void setNextLevel(Level nextLevel) {
		this.nextLevel = nextLevel;
	}
    
	
    
    
    
    
}
