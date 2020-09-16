package com.redhat.gpte.training.camel;

import org.apache.camel.Exchange;
import org.apache.camel.impl.DefaultProducer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The MyComponent producer.
 */
public class MyComponentProducer extends DefaultProducer {

    private static final transient Logger LOG = LoggerFactory.getLogger(MyComponentProducer.class);

    private MyComponentEndpoint endpoint;

    public MyComponentProducer(MyComponentEndpoint endpoint) {
        super(endpoint);
        this.endpoint = endpoint;
    }

    @Override
    public void process(Exchange exchange) throws Exception {
     /*
      Enrich the exchange with the header ("MyHeader = foo")
      and append to the body the message " What a crazy exercise !"
     */
    }

}