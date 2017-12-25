package com.spel.entities;

import java.util.ArrayList;

public class EntityHandler {

	private static ArrayList<Entity> entities = new ArrayList<Entity>();
	
	public static ArrayList<Entity> getEntities() {
		return entities;
	}
	
	public static int getSize() {
		return getEntities().size();
	}
	
	public static void add(Entity e) {
		getEntities().add(e);
	}
	
	public static void remove(int index) {
		getEntities().remove(index);
	}
	
	public static void remove(Entity e) {
		getEntities().remove(e);
	}
	
	public static Entity getEntity(int index) {
		return getEntities().get(index);
	}
	
	public static void update() {
		
		for (Entity e : getEntities())
			e.update();
		
		
		for (int i = 0; i < getSize(); i++) {
			if (i >= getSize()) break;
			if (getEntity(i).shouldRemove()) remove(i);
		}
	}
	
	public static void draw() {
		for (Entity e : getEntities())
			e.draw();
	}
	
}
