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
	@Test
	public void givenMultipleRides_whenCalculateFare_ShouldReturnAggregateTotalFare() {
		CabInvoiceGenerator invoiceService = new CabInvoiceGenerator();
		Rides[] rides = { new Rides(2.0, 5), new Rides(1.0, 5), new Rides(0.1, 1) };
		InvoiceSummary expectedSummary = new InvoiceSummary(3, 45);
		InvoiceSummary summary = invoiceService.calculateFare(rides);
		Assert.assertEquals(expectedSummary, summary);
	}
}
