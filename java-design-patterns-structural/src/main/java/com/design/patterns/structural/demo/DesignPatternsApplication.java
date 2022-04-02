package com.design.patterns.structural.demo;

import java.nio.file.Path;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.design.patterns.structural.adapter.Adapter;
import com.design.patterns.structural.adapter.CarModel;
import com.design.patterns.structural.adapter.CarPriceCalculator;
import com.design.patterns.structural.adapter.PriceCalculator;
import com.design.patterns.structural.adapter.TruckPriceCalculator;
import com.design.patterns.structural.adapter.lib.UKCarPriceCalculator;
import com.design.patterns.structural.bridge.Blue;
import com.design.patterns.structural.bridge.Circle;
import com.design.patterns.structural.bridge.Red;
import com.design.patterns.structural.bridge.Shape;
import com.design.patterns.structural.bridge.Square;
import com.design.patterns.structural.composite.Manager;
import com.design.patterns.structural.composite.SalesPerson;
import com.design.patterns.structural.composite.SalesTeam;
import com.design.patterns.structural.decorator.BasicCar;
import com.design.patterns.structural.decorator.Car;
import com.design.patterns.structural.decorator.SportCarDecorator;
import com.design.patterns.structural.facade.OrderServiceFacade;
import com.design.patterns.structural.facade.OrderServiceFacadeImpl;
import com.design.patterns.structural.facade.domain.Product;
import com.design.patterns.structural.flyweight.Vehicle;
import com.design.patterns.structural.flyweight.VehicleFactory;
import com.design.patterns.structural.flyweight.VehicleType;
import com.design.patterns.structural.proxy.virtual.Image;
import com.design.patterns.structural.proxy.virtual.ImageProxy;

/**
 * 
 * DesignPatternsApplication.java
 *
 * @author Lyes Sefiane
 * @email lyes.sefiane@gmail.com
 * @date Feb. 14, 2021
 *
 */
@SpringBootApplication
public class DesignPatternsApplication {

	private static Logger logger = LoggerFactory.getLogger(DesignPatternsApplication.class);

	public static void main(String[] args) {

		SpringApplication.run(DesignPatternsApplication.class, args);

	}

}
