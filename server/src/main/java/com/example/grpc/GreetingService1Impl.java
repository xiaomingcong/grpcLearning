package com.example.grpc;

import io.grpc.stub.StreamObserver;

public class GreetingService1Impl extends com.example.grpc.GreetingService1Grpc.GreetingService1ImplBase {

    @Override
    public void greeting1(HelloRequest1 request, StreamObserver<HelloResponse1> responseObserver) {
        System.out.println(request);

        // You must use a builder to construct a new Protobuffer object
        com.example.grpc.HelloResponse1 response = com.example.grpc.HelloResponse1.newBuilder()
                .setGreeting("Hello there, " + request.getName())
                .build();

        // Use responseObserver to send a single response back
        responseObserver.onNext(response);

        // When you are done, you must call onCompleted.
        responseObserver.onCompleted();
//        super.greeting1(request, responseObserver);
    }
}
