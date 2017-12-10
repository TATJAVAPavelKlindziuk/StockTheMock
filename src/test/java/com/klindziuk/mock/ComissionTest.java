package com.klindziuk.mock;

import com.klindziuk.mock.service.SEComission;
import com.klindziuk.mock.model.Government;
import com.klindziuk.mock.model.Law;
import org.apache.log4j.Logger;
import org.easymock.EasyMock;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by Hp on 10/12/2017.
 */
public class ComissionTest {
    private static final Logger logger = Logger.getLogger(PortfolioTest.class);
    private Government government;
    private SEComission comissionMock;

    @Before
    public void setUp() {
        government = new Government();
        government.setCountry("EasyMock country");
        comissionMock = EasyMock.createMock(SEComission.class);
        government.setComission(comissionMock);
        logger.info(government.toString());
    }

    @Test
    public void testGetTotalValue() {
        EasyMock.expect(comissionMock.getLaws()).andReturn(Arrays.asList(new Law("Law1",1985),new Law("Law2",2007)));
        EasyMock.replay(comissionMock);
        int expected = 2;
        Assert.assertEquals(expected,government.getSecLawQuantity());
    }
}
