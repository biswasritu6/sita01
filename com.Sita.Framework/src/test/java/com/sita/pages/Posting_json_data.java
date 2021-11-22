package com.sita.pages;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.io.File;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Posting_json_data {

	public static void main(String[] args) {
	
		Response postResponse=given()
		.auth().none()
		.header("Content-Type","application/json")
		.contentType(ContentType.JSON)
		.when()
		.body(new File("/com.Sita.Framework/TestData/Payload.json")).log().all()
		.post("http://dev-placement-backend.ap-south-1.elasticbeanstalk.com/sns/publish/itinerary");
		System.out.println("Post Response is "+postResponse.asString());
		System.out.println("Post Response status code is "+postResponse.statusCode());
		

	}

}
