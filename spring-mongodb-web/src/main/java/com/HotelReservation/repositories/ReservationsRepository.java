package com.HotelReservation.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.HotelReservation.models.Reservation;
import org.bson.types.ObjectId;

public interface ReservationsRepository extends MongoRepository<Reservation, String> {
    Reservation findBy_id(ObjectId _id);
}
