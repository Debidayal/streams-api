package com.java.streams.mapandflatmap;

import java.util.List;
import java.util.stream.Collectors;

public class CustomerDemo {

	public static void main(String[] args) {

		/*
		 * get all email ids ( example of map()) . map takes Stream<T> as input , produces
		 * Stream<R> output used for one-to-one mapping ex.cust -> cust.getEmail() .
		 * It is also known as data transformation.
		 */
		List<String> allEmails = CustomerDAO.getAll().stream().map(cust -> cust.getEmail())
				.collect(Collectors.toList());

		/*
		 * get all email phone numbers ( example of flatMap()) . flatMap takes Stream<Strem<T>> as input , produces
		 * Stream<R> output used for one-to-may mapping ex.cust -> cust.getPhone() .
		 * It is also known as data flattering + transformation.
		 */
		List<String> allPhoneNumbers = CustomerDAO.getAll()
												  .stream().flatMap(cust -> cust.getPhone().stream()).collect(Collectors.toList());
		//
	}

}
