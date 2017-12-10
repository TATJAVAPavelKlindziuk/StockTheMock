package com.klindziuk.mock;

import com.klindziuk.mock.service.StockMarket;
import com.klindziuk.mock.model.Portfolio;
import com.klindziuk.mock.model.Stock;
import junit.framework.TestCase;
import org.apache.log4j.Logger;
import org.easymock.EasyMock;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Hp on 10/12/2017.
 */
public class PortfolioTest extends TestCase {
    private static final Logger logger = Logger.getLogger(PortfolioTest.class);
    private Portfolio portfolio;
    private StockMarket marketMock;

    @Before
    public void setUp() {
        portfolio = new Portfolio();
        portfolio.setName("EasyMock portfolio.");
        marketMock = EasyMock.createMock(StockMarket.class);
        portfolio.setStockMarket(marketMock);
        logger.info(portfolio.toString());
    }

    @Test
    public void testGetTotalValue() {
        EasyMock.expect(marketMock.getPrice("EPAM")).andReturn(21.00);
        EasyMock.replay(marketMock);
        Stock ebayStock = new Stock("EPAM", 2);
        portfolio.addStock(ebayStock);
        double expected = 42.00;
        assertEquals(expected, portfolio.getTotalValue());
    }
}
