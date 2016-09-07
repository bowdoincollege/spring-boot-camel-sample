/**
 * 
 */
package edu.bowdoin.spring.boot.sample;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

/**
 * Sample Camel Route
 * 
 * @author epearson
 *
 */
@Component
public class MyRoute extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        from("timer:foo").to("log:bar");
    }
}
