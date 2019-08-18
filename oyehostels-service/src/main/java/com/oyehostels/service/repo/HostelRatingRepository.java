package com.oyehostels.service.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.oyehostels.service.bo.hostel.RatingValueNoOfReviewersBo;
import com.oyehostels.service.entities.HostelRating;

@Repository
public interface HostelRatingRepository extends JpaRepository<HostelRating, Integer> {

	@Query("select round(sum(hr.ratingValue)/count(hr.ratingValue),1) as ratingValue, count(hr.ratingValue) as noOfReviewers from HostelRating hr where hr.hostelId = :hostelId")
	public String getRatingAndNoOfReviewers(@Param("hostelId") int hostelId);
}
