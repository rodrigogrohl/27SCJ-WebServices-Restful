package br.com.fiap.ws;

import javax.xml.ws.Endpoint;

public class PublishService {

	public static void main(String[] args) {
		HelloWeb web = new HelloWeb();
		Endpoint endpoint = Endpoint.publish("http://localhost:8080/Hello", web);
	}

}
