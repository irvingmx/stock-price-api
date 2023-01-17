package irvingmx.stockpriceapi.prices;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Company {

    private String ISIN;
    private String simbol;
    private String market;
}
