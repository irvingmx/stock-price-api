package irvingmx.ninety_nine_api.prices;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
public class SharePrice {

    private LocalDateTime time;
    private double price;
    private Company company;
}
