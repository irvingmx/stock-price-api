package irvingmx.ninety_nine_api.prices;

import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Setter
@Getter
public class SharePrice {

    private Timestamp timestamp;
    private double price;
    private Company company;
}
