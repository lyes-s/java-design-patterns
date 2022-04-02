package com.design.patterns.creational.demo;

import java.awt.Color;
import java.awt.Dimension;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.design.patterns.creational.abstractfactory.AbstractFactory;
import com.design.patterns.creational.abstractfactory.FactoryProvider;
import com.design.patterns.creational.abstractfactory.FactoryType;
import com.design.patterns.creational.abstractfactory.LollipopFactory;
import com.design.patterns.creational.builder.Bedroom;
import com.design.patterns.creational.builder.BedroomBuilder;
import com.design.patterns.creational.factorymethod.CandyType;
import com.design.patterns.creational.factorymethod.ChocolateFactory;
import com.design.patterns.creational.prototype.Breed;
import com.design.patterns.creational.prototype.Person;
import com.design.patterns.creational.prototype.Rabbit;
import com.design.patterns.creational.singleton.PrintSpooler;

/**
 * 
 * DesignPatternsApplication.java
 *
 * @author Lyes Sefiane
 * @email lyes.sefiane@gmail.com
 * @date Feb. 13, 2021
 *
 */
@SpringBootApplication
public class DesignPatternsApplication {

	private static Logger logger = LoggerFactory.getLogger(DesignPatternsApplication.class);

	public static void main(String[] args) {

		SpringApplication.run(DesignPatternsApplication.class, args);

	}

}
