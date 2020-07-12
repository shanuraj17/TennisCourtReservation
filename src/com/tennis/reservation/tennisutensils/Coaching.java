package com.tennis.reservation.tennisutensils;

import com.tennis.reservation.booking.CourtBooking;

public class Coaching extends TennisDecorator{

	CourtBooking c;
	public Coaching(CourtBooking cb) {
		// TODO Auto-generated constructor stub
		c=cb;
	}
	@Override
	public int cost() {
		// TODO Auto-generated method stub
		return 200+ c.cost();
	}

}
