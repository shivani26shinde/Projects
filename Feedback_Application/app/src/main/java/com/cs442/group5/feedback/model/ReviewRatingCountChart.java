package com.cs442.group5.feedback.model;

public class ReviewRatingCountChart {
	float rating;
	int count;

	public ReviewRatingCountChart(float rating, int count) {
		this.rating = rating;
		this.count = count;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
}
