/**
 *
 */
package com.bridgelabz;

/**
 * @author MD_AFROZ
 *
 */
public class CabInvoiceGenerator {
	private final double COST_PER_KM = 10.0;
    private final int COST_PER_MIN = 1;
    private final double MIN_FARE = 5.0;

    public double calculateFare(double distance, int time) {
        double totalFare = distance * COST_PER_KM + time * COST_PER_MIN;
        return Math.max(totalFare, MIN_FARE);
    }
    
    public InvoiceSummary calculateFare(Rides[] rides) {
		double totalFare = 0.0;
		for (Rides ride : rides) {
			totalFare += calculateFare(ride.getDistance(), ride.getTime());
		}
		System.out.println("Length of ride is " + rides.length + "KM and Fare is " + totalFare);
		return new InvoiceSummary(rides.length, totalFare);
	}

	public static void main(String[] args) {
		System.out.println("****************Cab Invoice Generator****************");

		CabInvoiceGenerator cab = new CabInvoiceGenerator();
		double res = cab.calculateFare(2.0, 5);
		System.out.println("Total Fare = " + res);

	}
}
