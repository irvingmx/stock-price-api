package irvingmx.stockpriceapi.prices;

import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Setter
@Getter
public class SharePrice {

    private Timestamp timestamp;
    private double price;
    private Company company;
}
