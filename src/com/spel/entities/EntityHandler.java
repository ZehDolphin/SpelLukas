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

		for (Entity e : getEntities()) {
			e.update();
			
			if (e instanceof Mob) {
				Mob m = (Mob) e;

				Entity cw = null;
				boolean onGround = false;
				for (Entity e2 : entities) {
					if (e2 != e) {
						if (e2.intersects(m.getX() + m.getVelocity().getX(), m.getY() + m.getVelocity().getY(), m.getWidth(), m.getHeight() - 1)) {
							cw = e2;
						}
						if (e2.intersects(m.getX(), m.getY() + 0, m.getWidth(), m.getHeight()))
							onGround = true;
					}
				}

				if (onGround) {
					m.onGround = true;
				} else {
					m.onGround = false;
				}

				if (cw == null) {
					m.translate(m.getVelocity());
				} else {
					if (m.getY() + m.getHeight() <= cw.getY()) {
						m.getVelocity().setY(0);
						m.translateY(cw.getY() - (m.getY() + m.getHeight()));
					} else {
						m.getVelocity().set(0, 0);
					}
				}
			}
		}

		for (int i = 0; i < getSize(); i++) {
			if (i >= getSize())
				break;
			if (getEntity(i).shouldRemove())
				remove(i);
		}
	}

	public static void draw() {
		for (Entity e : getEntities())
			e.draw();

	}

}
