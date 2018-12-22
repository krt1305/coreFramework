package com.testData;

import io.codearte.jfairy.Fairy;
import io.codearte.jfairy.producer.DateProducer;
import io.codearte.jfairy.producer.net.NetworkProducer;
import io.codearte.jfairy.producer.payment.CreditCard;
import io.codearte.jfairy.producer.person.Person;
import io.codearte.jfairy.producer.text.TextProducer;
import org.testng.annotations.Test;

import java.util.Locale;


//http://www.testautomationguru.com/selenium-webdriver-how-to-generate-test-data-using-jfairy/
public class TestData {

    Fairy fairy = Fairy.create();


        @Test
        public void generatePersonInfo()
        {
            Person person =fairy.person();
            System.out.println(person.getSex());
            System.out.println(person.getAddress());
            System.out.println(person.getAge());
            System.out.println(person.isMale());

        }

    @Test
    public void generatecreditCardDetailsTest()
    {
        CreditCard creditCard=fairy.creditCard();
        System.out.println(creditCard.getExpiryDate() +creditCard.getExpiryDateAsString()+ creditCard.getVendor());

    }

    @Test
    public void generateDateTest()
    {
        DateProducer date=fairy.dateProducer();
        System.out.println(date.randomDateInTheFuture(10));
        System.out.println(date.randomDateInTheFuture());
        System.out.println(date.randomDateInThePast(10));



    }
    @Test
    public void generateNetworkData()
    {
        NetworkProducer networkProducer= fairy.networkProducer();
        System.out.println(networkProducer.ipAddress());
        System.out.println(networkProducer.url(true));
    }

    @Test
    public void generateFrenchLocaleData()
    {
       /* Fairy frFairy = Fairy.create(Locale.forLanguageTag("fr"));
        Fairy svFairy = Fairy.create(Locale.forLanguageTag("sv"));
        Fairy plFairy = Fairy.create(Locale.forLanguageTag("pl"));*/
        fairy = Fairy.create(Locale.forLanguageTag("fr"));
        Person p=fairy.person();
        System.out.println(p.getFirstName());
    }

    @Test
    public void generateTextData()
    {
        TextProducer text = Fairy.create().textProducer();
        System.out.println(text.loremIpsum());

    }
}
