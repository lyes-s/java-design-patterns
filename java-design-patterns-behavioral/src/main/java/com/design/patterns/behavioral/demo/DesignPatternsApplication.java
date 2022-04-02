package com.design.patterns.behavioral.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.design.patterns.behavioral.chainofresponsability.DocumentHandler;
import com.design.patterns.behavioral.chainofresponsability.FileExtension;
import com.design.patterns.behavioral.chainofresponsability.SlideShowHandler;
import com.design.patterns.behavioral.chainofresponsability.SpreadSheetHandler;
import com.design.patterns.behavioral.chainofresponsability.TextDocumentHandler;
import com.design.patterns.behavioral.command.Broker;
import com.design.patterns.behavioral.command.BuyStock;
import com.design.patterns.behavioral.command.SellStock;
import com.design.patterns.behavioral.command.Stock;
import com.design.patterns.behavioral.interpreter.InterpreterContext;
import com.design.patterns.behavioral.interpreter.ParameterPosition;
import com.design.patterns.behavioral.iterator.Inventory;
import com.design.patterns.behavioral.iterator.Item;
import com.design.patterns.behavioral.iterator.StockIterator;
import com.design.patterns.behavioral.mediator.ChatMediator;
import com.design.patterns.behavioral.mediator.ChatMediatorImpl;
import com.design.patterns.behavioral.mediator.User;
import com.design.patterns.behavioral.mediator.UserImpl;
import com.design.patterns.behavioral.memento.TextDocument;
import com.design.patterns.behavioral.observer.Connection;
import com.design.patterns.behavioral.observer.SocialMediaFeed;
import com.design.patterns.behavioral.state.MediaPlayer;
import com.design.patterns.behavioral.strategy.AESEncrypter;
import com.design.patterns.behavioral.strategy.Encrypter;
import com.design.patterns.behavioral.strategy.File;
import com.design.patterns.behavioral.template.MeatFeastPizza;
import com.design.patterns.behavioral.template.Pizza;
import com.design.patterns.behavioral.template.VegetarianPizza;
import com.design.patterns.behavioral.visitor.DiscountVisitor;
import com.design.patterns.behavioral.visitor.GroceryList;

@SpringBootApplication
public class DesignPatternsApplication {

	private static Logger logger = LoggerFactory.getLogger(DesignPatternsApplication.class);

	public static void main(String[] args) {

		SpringApplication.run(DesignPatternsApplication.class, args);
	}

}
