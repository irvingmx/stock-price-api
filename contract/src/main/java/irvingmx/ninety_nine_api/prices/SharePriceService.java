package irvingmx.ninety_nine_api.prices;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1")
public interface SharePriceService {

    @GetMapping("/companies")
    List<Company> getAllCompanies();

    @GetMapping("/companies/{isin}")
    Company getCompany(@PathVariable String isin);

    @GetMapping("/companies/{isin}/shareprices/{seriesType}")
    List<SharePrice> getSharePrices(@PathVariable String isin, @PathVariable SeriesTimeType seriesTimeType);



}
