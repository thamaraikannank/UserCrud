package com.user.exception;

public class NotEnoughProductsInStockException extends Exception {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final String DEFAULT_MESSAGE = "Not enough products in stock";

    public NotEnoughProductsInStockException() {
        super(DEFAULT_MESSAGE);
    }

    public NotEnoughProductsInStockException(String field) {
        super(String.format("Given value for the field is invalid"));
    }

}
