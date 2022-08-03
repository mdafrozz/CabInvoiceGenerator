/**
 *
 */
package com.bridgelabz;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

/**
 * @author MD_AFROZ
 *
 */
public class InvoiceSerivceTest {
	@Test
    public void givenDistanceAndTime_whenCalculateFare_ShouldReturnTotalFare() {
		CabInvoiceGenerator invoiceService = new CabInvoiceGenerator();
        double totalFare = invoiceService.calculateFare(2.0, 5);
        System.out.println("Total Fare = " + totalFare);
        Assert.assertEquals(25.0, totalFare, 0.0);
    }
}
