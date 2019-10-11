package pnt.camel.rutasEnCamel;

import static org.apache.camel.Exchange.HTTP_METHOD;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class RutaRestAXml extends RouteBuilder{

 @Override
 public void configure() throws Exception {
//        from("direct:test").setHeader(HTTP_METHOD, simple("GET")).to("http://www.mocky.io/v2/5d8500be3000003eea22dcbf")
//        .log(body().toString());
    from("file:C://inputFolder?noop=true").to("log:Exchange").log("==============================");//.to("file:C://outputFolder");
    
    }
    
}

