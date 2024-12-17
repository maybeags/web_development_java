package c18_static.builders.travelplan;

import lombok.ToString;

@ToString
public class TravelPlanNoLombok {
    // 필수 필드
    private final String destination;
    private final String depatureDate;

    // 선택 필드
    private String returnDate;
    private int numberOfTravelers;
    private String hotelName;
    private String flightNumber;

    // private을 통한 TravelPlanNoLombok 생성자
    private TravelPlanNoLombok(Builder builder) {
        this.destination = builder.destination;
        this.depatureDate = builder.depatureDate;
        this.returnDate = builder.returnDate;
        this.numberOfTravelers = builder.numberOfTravelers;
        this.hotelName = builder.hotelName;
        this.flightNumber = builder.flightNumber;
    }

    // TravelPlanNoLombok의 내부 클래스 Builder 정의
    public static class Builder {
        //필수 필드 선언하세요
        private final String destination;
        private final String depatureDate;
        //선택 필드 선언하세요
        private String returnDate;
        private int numberOfTravelers;
        private String hotelName;
        private String flightNumber;

        // final로 선언한 애들은 기본적으로 RequiredArgsConstructor에 해당했습니다 -> 메서드가 아니라 생성자
        public Builder(String destination, String depatureDate) {
            this.destination = destination;
            this.depatureDate = depatureDate;
        }

        // 선택 필드와 관련된 메서드들을 정의 하셔야 합니다.
        public Builder returnDate(String returnDate) {
            this.returnDate = returnDate;
            return this;
        }

        public Builder numberOfTravelers(int numberOfTravelers) {
            this.numberOfTravelers = numberOfTravelers;
            return this;
        }

        public Builder hotelName(String hotelName) {
            this.hotelName = hotelName;
            return this;
        }

        public Builder flightNumber(String flightNumber) {
            this.flightNumber = flightNumber;
            return this;
        }
        // 최종 객체 생성과 관련된 메서드 .build()도 정의하셔야 합니다.
        public TravelPlanNoLombok build() {
            return new TravelPlanNoLombok(this);
        }
    }
}
