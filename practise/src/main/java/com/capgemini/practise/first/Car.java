/**
 * 
 */
package com.capgemini.practise.first;

/**
 * 
 */

import java.io.*;

import lombok.Data;

@Data
public class Car implements Serializable{
	private int id;
	private String brand;
	private String model;
	private int releaseYear;
}
