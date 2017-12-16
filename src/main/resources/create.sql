use camp;
INSERT into reservation (id, arrival_time, departure_time, max_number_of_registration, price)
VALUES (1, "2012-10-01 00:00:00", "2012-10-07 00:00:00", 10, 300);
INSERT into reservation (id, arrival_time, departure_time, max_number_of_registration, price)
VALUES (2, "2014-10-01 00:00:00", "2014-10-07 00:00:00", 12, 200);
INSERT into contributor (id, amount_to_pay, discount, is_paid, reservation_id)
VALUES (1, 100, 0, 1, 1);