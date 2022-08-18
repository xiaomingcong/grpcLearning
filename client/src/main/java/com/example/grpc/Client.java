package com.example.grpc;

import io.grpc.*;

public class Client
{
    public static void main( String[] args ) throws Exception
    {
        // Channel is the abstraction to connect to a service endpoint
        // Let's use plaintext communication because we don't have certs
        final ManagedChannel channel = ManagedChannelBuilder.forTarget("localhost:8080")
                .usePlaintext(true)
                .build();

        // It is up to the client to determine whether to block the call
        // Here we create a blocking stub, but an async stub,
        // or an async stub with Future are always possible.
        com.example.grpc.GreetingServiceGrpc.GreetingServiceBlockingStub stub = com.example.grpc.GreetingServiceGrpc.newBlockingStub(channel);
        com.example.grpc.HelloRequest request =
                com.example.grpc.HelloRequest.newBuilder()
                        .setName("Ray")
                        .build();

        // Finally, make the call using the stub
        com.example.grpc.HelloResponse response =
                stub.greeting(request);

        System.out.println(response);

        // A Channel should be shutdown before stopping the process.
        channel.shutdownNow();
    }
}