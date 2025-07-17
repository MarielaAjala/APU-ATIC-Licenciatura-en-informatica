package ar.edu.unlp.oo1.ejercicio1.impl;

import ar.edu.unlp.oo1.ejercicio1.WallPost;

/**
 * Completar esta clase de acuerdo a lo especificado en el cuadernillo
 *
 */
public class WallPostImpl implements WallPost {

	private String text;
	private int likes;
	private boolean isFeatured;

	public WallPostImpl() {
		this.text = "Undefined post";
		this.likes = 0;
		this.isFeatured = false;
	}
    @Override
    public String toString() {
        return "WallPost {" +
            "text: " + getText() +
            ", likes: '" + getLikes() + "'" +
            ", featured: '" + isFeatured() + "'" +
            "}";
    }

	@Override
	public String getText() {
		// TODO Auto-generated method stub
		return this.text;
	}

	@Override
	public void setText(String text) {
		this.text = text;
		
	}

	@Override
	public int getLikes() {
		// TODO Auto-generated method stub
		return this.likes;
	}

	@Override
	public void like() {
		this.likes++;
		
	}

	@Override
	public void dislike() {
		if(this.likes>0) {this.likes--;}
	}

	@Override
	public boolean isFeatured() {
		// TODO Auto-generated method stub
		return this.isFeatured;
	}

	@Override
	public void toggleFeatured() {
		if(this.isFeatured) {
			this.isFeatured = false;
		}else {
			this.isFeatured = true;
		}
	}

}
