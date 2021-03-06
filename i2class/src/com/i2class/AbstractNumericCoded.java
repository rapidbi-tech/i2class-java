/*
 * Created on Sep 13, 2004
 *
 */
package com.i2class;

import java.math.BigDecimal;

/**
 * An abstract class for numeric data that is 'coded' i.e. not zoned.
 * 
 *
 */
abstract public class AbstractNumericCoded extends AbstractNumeric {

	/**
	 * @param size
	 * @param digits
	 * @param scale
	 * @param overlay
	 */
	public AbstractNumericCoded(
		int size,
		int digits,
		int scale,
		FixedPointer overlay)
	{
		super(size, digits, scale, overlay);
	}

	/**
	 * @param len
	 * @param scale
	 * @param digits
	 */
	public AbstractNumericCoded(int size, int digits, int scale) {
		super(size, digits, scale);
	}
	
	/** 
	 * Move a character value to the right-most byte of this variable.  
	 * Translate blanks to '0'.
	 */
	public FixedData move(char c)
	{
		ZonedDecimal z = toZoned();
		z.move(c);
		assignZoned(z);
		return this;
	}


	/** 
	 * Move a fixed-length value to the right-most bytes of this variable.
	 * Translate blanks to '0'.
	 */
	public FixedData move(IFixed fStr)
	{
		ZonedDecimal z = toZoned();
		z.move(fStr);
		assignZoned(z);
		return this;
	}


	/** 
	 * Move a string to the right-most bytes of this variable.
	 * Translate blanks to '0'.
	 */
	public FixedData move(String str)
	{
		ZonedDecimal z = toZoned();
		z.move(str);
		assignZoned(z);
		return this;
	}


	/** 
	 * Move a character value to the left-most byte of this variable.  
	 * Translate blanks to '0'.
	 */
	public FixedData movel(char c)
	{
		ZonedDecimal z = toZoned();
		z.movel(c);
		assignZoned(z);
		return this;
	}


	/** 
	 * Move a fixed-length value to the left-most bytes of this variable.
	 * Translate blanks to '0'.
	 */
	public FixedData movel(IFixed fStr)
	{
		ZonedDecimal z = toZoned();
		z.movel(fStr);
		assignZoned(z);
		return this;
	}



	/** 
	 * Move a string to the left-most bytes of this variable.
	 * Translate blanks to '0'.
	 */
	public FixedData movel(String str)
	{
		ZonedDecimal z = toZoned();
		z.movel(str);
		assignZoned(z);
		return this;
	}

}
