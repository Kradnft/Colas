/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UD;

/**
 *
 * @author KevinB
 */

public class Node {
          public int info;
          public String nombre;
	  public Node next;

	  public Node(int in, String nom) {
	    info = in;
	    next = null;
            nombre = nom;
	  }

	  public void setInfo(int o) {
	    info = o;
	  }
	  public void setNext(Node n) {
	    next = n;
	  }
	  public Object getInfo() {
	    return info;
	  }
	  public Node getNext() {
	    return next;
	  }
}
