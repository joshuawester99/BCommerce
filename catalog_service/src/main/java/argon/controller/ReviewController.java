package argon.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import argon.model.Review;

public class ReviewController {
	@GetMapping("/reviews/{reviewId}")
	public ResponseEntity<Review> getReview(@PathVariable Long reviewId) {
		return null;

	}

	@PutMapping("/reviews/{reviewId}")
	public ResponseEntity<Review> updateReview(@PathVariable Long reviewId, @RequestBody Review dto, Long userId) {
		return null;

	}

	@DeleteMapping("/reviews/{reviewId}")
	public ResponseEntity<Void> deleteReview(@PathVariable Long reviewId, Long userId) {
		return null;

	}

}
