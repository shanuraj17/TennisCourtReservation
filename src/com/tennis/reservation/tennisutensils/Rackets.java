package com.tennis.reservation.tennisutensils;

import com.tennis.reservation.booking.CourtBooking;

public class Rackets extends TennisDecorator{

	CourtBooking c;
	public Rackets(CourtBooking cb) {
		// TODO Auto-generated constructor stub
		c=cb;
	}
	@Override
	public int cost() {
		// TODO Auto-generated method stub
		return 100+c.cost();
	}

}
