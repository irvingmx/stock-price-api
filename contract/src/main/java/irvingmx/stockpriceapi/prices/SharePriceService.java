package irvingmx.stockpriceapi.prices;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1")
public interface SharePriceService {

    @GetMapping("/companies")
    List<Company> getAllCompanies();

    @GetMapping("/companies/{isin}")
    Company getCompany(@PathVariable String isin);

    @GetMapping("/companies/{isin}/shareprices")
    SharePrice getSharePrice(@PathVariable String isin);

    @GetMapping("/companies/shareprices/{isin}")
    public List<SharePrice> getSharePriceStory(@PathVariable String isin);

    @GetMapping("/companies/shareprices/{isin}/{seriesTimeType}")
    List<SharePriceTimeSerie> getSharePricesStoriesByTimeSeries(@PathVariable String isin, @PathVariable SeriesTimeType seriesTimeType);



}
