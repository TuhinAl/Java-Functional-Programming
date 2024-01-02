package stream;

import collections.Invoice;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class ReduceDemo {
public static void main(String[] args) {
	
	List<Invoice> invoices = new ArrayList<>();
	Invoice invoice1 = new Invoice("INV001", BigDecimal.valueOf(9.39), BigDecimal.valueOf(1.52));
	Invoice invoice2 = new Invoice("INV002", BigDecimal.valueOf(14.32), BigDecimal.valueOf(2));
	Invoice invoice3 = new Invoice("INV003", BigDecimal.valueOf(21.54), BigDecimal.valueOf(1.25));
	Invoice invoice4 = new Invoice("INV004", BigDecimal.valueOf(17.21), BigDecimal.valueOf(2.33));
	Invoice invoice5 = new Invoice("INV005", BigDecimal.valueOf(7.99), BigDecimal.valueOf(3.01));
	Invoice invoice6 = new Invoice("INV006", BigDecimal.valueOf(13.99), BigDecimal.valueOf(1.31));
	
	invoices.add(invoice1);
	invoices.add(invoice2);
	invoices.add(invoice3);
	invoices.add(invoice4);
	invoices.add(invoice5);
	invoices.add(invoice6);
	
	BigDecimal sum = invoices.stream()
	.map(inv -> inv.getPrice().multiply(inv.getQty()))
	.reduce(BigDecimal.ZERO, BigDecimal::add);
	
	System.out.println(sum.setScale(2, RoundingMode.HALF_UP));
}
}
