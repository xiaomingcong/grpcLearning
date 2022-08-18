package com.example.grpc;

import io.grpc.stub.StreamObserver;

public class GreetingServiceImpl extends com.example.grpc.GreetingServiceGrpc.GreetingServiceImplBase {
    @Override
    public void greeting(com.example.grpc.HelloRequest request,
                         StreamObserver<com.example.grpc.HelloResponse> responseObserver) {
        // HelloRequest has toString auto-generated.
        System.out.println(request);

        // You must use a builder to construct a new Protobuffer object
        com.example.grpc.HelloResponse response = com.example.grpc.HelloResponse.newBuilder()
                .setGreeting("Hello there, " + request.getName())
                .build();

        // Use responseObserver to send a single response back
        responseObserver.onNext(response);

        // When you are done, you must call onCompleted.
        responseObserver.onCompleted();
    }
}
