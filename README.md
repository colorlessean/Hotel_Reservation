Hotel Reservation System

Reservations:
    Can create reservations of types: 
        Junior Suite: 15 units
        Single Suite: 20 units
        Double Suite: 30 units
        Triple Suite: 10 units
        Grand Suite: 10 units
        Penthouse: 1 units
    
    Available for a day at a time using a calendar date:

    {
        Reservation: {
            id: "",
            GuestName: "", 
            PhoneNumber: "",
            Date: 00/00/00,
            SuiteType: "",
            CardInfo: {
                CardNumber: 0000,
                Name: "",
                Exp: "",
                CSV: "",
            }
        }
    }


Create Reservation:
    Create the Reservation Objects based on the range of dates given
    Then attempt to add the objects to the db
        Check that the current number of suites of type on day is not equal to the max available
            If user can book add all of the reservations and dates as supposed to
            else return an error
    Return to the user the server response:
        Error: 40X return the error in adding please try again etc.
        Success: 200 return to the user a reservation id: same as ID in the db

Search Reservations:
    Allow the user to search by id
        Will return the exact reservation hidding the CSV and Full Card Number
    Allow the user to search by Name and Phone Number and Date
        May return multiple reservations as its not the exact id

Delete Reservations
    From search click delete button
    To delete the user must provide the id and their CardNumber in full