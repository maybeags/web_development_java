package c18_static.builders.travelplan;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class TravelPlan {
    // 필드 선언
    private String destination;
    private String depatureDate;
    private String returnDate;
    private int numberOfTravelers;
    private String hotelName;
    private String flightNumber;
}
