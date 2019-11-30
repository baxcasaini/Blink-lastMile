package com.aws.codestar.projecttemplates.handler;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import com.aws.codestar.projecttemplates.GatewayResponse;
import com.aws.codestar.projecttemplates.config.MongoConfig;
import com.aws.codestar.projecttemplates.controller.DeliveryController;
import com.aws.codestar.projecttemplates.model.Delivery;
import com.mongodb.MongoClient;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Handler for requests to Lambda function.
 */
public class AllRequestHandler implements RequestHandler<Object, Object> {

    public Object handleRequest(final Object input, final Context context) {
        Map<String, String> headers = new HashMap<>();
        headers.put("Content-Type", "application/json");
        headers.put("Access-Control-Allow-Origin", "*");
        headers.put("Access-Control-Allow-Credentials", "true");
        headers.put("Access-Control-Allow-Headers", "origin, content-type, accept, authorization");
        headers.put("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD");

        Exception ex = null;
        try {

            MongoConfig config = new MongoConfig();
            config.mongoClient();

            DeliveryController deliveryController = new DeliveryController();
            Delivery delivery = new Delivery();
            delivery.setId("3");
            deliveryController.create(delivery);  // test
        }catch(Exception e){
            ex = e;
        }

        if ( ex != null ){
            return  new GatewayResponse(new JSONObject().put("Output", ex.getStackTrace()).toString(), headers, 500);
        }

        return new GatewayResponse(new JSONObject().put("Output", "Blink Service is running").toString(), headers, 200);
    }
}
