package com.tennis.reservation.main;

import com.tennis.reservation.booking.ClayCourtBooking;
import com.tennis.reservation.booking.CourtBooking;
import com.tennis.reservation.tennisutensils.BallPack;
import com.tennis.reservation.tennisutensils.Coaching;
import com.tennis.reservation.tennisutensils.Rackets;

public class ClientDirector {

	public static void main(String[] args) {
		CourtBooking cb = new ClayCourtBooking("RAJ", "Bangalore", "7073155458");
		cb = new BallPack(cb);
		cb=new Rackets(cb);
		cb=new Rackets(cb);
		cb=new Coaching(cb);
		System.out.println("Total Cost = " + cb.cost());
	}
}
