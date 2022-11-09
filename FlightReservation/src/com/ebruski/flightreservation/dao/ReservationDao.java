package com.ebruski.flightreservation.dao;

import com.ebruski.flightreservation.model.Reservation;

public interface ReservationDao {
    Reservation bookFlight(Reservation reservation);

    Reservation checkIn(long reservationId,int noOfBags);

}

