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
public class Link {
    private int data;
    private Link nextLink;

    public Link() {
    }

    public Link(int data, Link nextLink) {
        this.data = data;
        this.nextLink = nextLink;
    }

    /**
     * @return the data
     */
    public int getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(int data) {
        this.data = data;
    }

    /**
     * @return the nextLink
     */
    public Link getNextLink() {
        return nextLink;
    }

    /**
     * @param nextLink the nextLink to set
     */
    public void setNextLink(Link nextLink) {
        this.nextLink = nextLink;
    }
   
    
}
