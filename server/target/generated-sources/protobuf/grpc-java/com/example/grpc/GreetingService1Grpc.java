package com.example.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * Defining a Service, a Service can have multiple RPC operations
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.24.0)",
    comments = "Source: GreetingService1.proto")
public final class GreetingService1Grpc {

  private GreetingService1Grpc() {}

  public static final String SERVICE_NAME = "com.example.grpc.GreetingService1";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.grpc.HelloRequest1,
      com.example.grpc.HelloResponse1> getGreeting1Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "greeting1",
      requestType = com.example.grpc.HelloRequest1.class,
      responseType = com.example.grpc.HelloResponse1.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.HelloRequest1,
      com.example.grpc.HelloResponse1> getGreeting1Method() {
    io.grpc.MethodDescriptor<com.example.grpc.HelloRequest1, com.example.grpc.HelloResponse1> getGreeting1Method;
    if ((getGreeting1Method = GreetingService1Grpc.getGreeting1Method) == null) {
      synchronized (GreetingService1Grpc.class) {
        if ((getGreeting1Method = GreetingService1Grpc.getGreeting1Method) == null) {
          GreetingService1Grpc.getGreeting1Method = getGreeting1Method =
              io.grpc.MethodDescriptor.<com.example.grpc.HelloRequest1, com.example.grpc.HelloResponse1>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "greeting1"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.HelloRequest1.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.HelloResponse1.getDefaultInstance()))
              .setSchemaDescriptor(new GreetingService1MethodDescriptorSupplier("greeting1"))
              .build();
        }
      }
    }
    return getGreeting1Method;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GreetingService1Stub newStub(io.grpc.Channel channel) {
    return new GreetingService1Stub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GreetingService1BlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new GreetingService1BlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GreetingService1FutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new GreetingService1FutureStub(channel);
  }

  /**
   * <pre>
   * Defining a Service, a Service can have multiple RPC operations
   * </pre>
   */
  public static abstract class GreetingService1ImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Define a RPC operation
     * </pre>
     */
    public void greeting1(com.example.grpc.HelloRequest1 request,
        io.grpc.stub.StreamObserver<com.example.grpc.HelloResponse1> responseObserver) {
      asyncUnimplementedUnaryCall(getGreeting1Method(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGreeting1Method(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.grpc.HelloRequest1,
                com.example.grpc.HelloResponse1>(
                  this, METHODID_GREETING1)))
          .build();
    }
  }

  /**
   * <pre>
   * Defining a Service, a Service can have multiple RPC operations
   * </pre>
   */
  public static final class GreetingService1Stub extends io.grpc.stub.AbstractStub<GreetingService1Stub> {
    private GreetingService1Stub(io.grpc.Channel channel) {
      super(channel);
    }

    private GreetingService1Stub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreetingService1Stub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GreetingService1Stub(channel, callOptions);
    }

    /**
     * <pre>
     * Define a RPC operation
     * </pre>
     */
    public void greeting1(com.example.grpc.HelloRequest1 request,
        io.grpc.stub.StreamObserver<com.example.grpc.HelloResponse1> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGreeting1Method(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Defining a Service, a Service can have multiple RPC operations
   * </pre>
   */
  public static final class GreetingService1BlockingStub extends io.grpc.stub.AbstractStub<GreetingService1BlockingStub> {
    private GreetingService1BlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GreetingService1BlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreetingService1BlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GreetingService1BlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Define a RPC operation
     * </pre>
     */
    public com.example.grpc.HelloResponse1 greeting1(com.example.grpc.HelloRequest1 request) {
      return blockingUnaryCall(
          getChannel(), getGreeting1Method(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Defining a Service, a Service can have multiple RPC operations
   * </pre>
   */
  public static final class GreetingService1FutureStub extends io.grpc.stub.AbstractStub<GreetingService1FutureStub> {
    private GreetingService1FutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GreetingService1FutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreetingService1FutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GreetingService1FutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Define a RPC operation
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.HelloResponse1> greeting1(
        com.example.grpc.HelloRequest1 request) {
      return futureUnaryCall(
          getChannel().newCall(getGreeting1Method(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GREETING1 = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GreetingService1ImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GreetingService1ImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GREETING1:
          serviceImpl.greeting1((com.example.grpc.HelloRequest1) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.HelloResponse1>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class GreetingService1BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GreetingService1BaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.grpc.GreetingServiceClass1.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("GreetingService1");
    }
  }

  private static final class GreetingService1FileDescriptorSupplier
      extends GreetingService1BaseDescriptorSupplier {
    GreetingService1FileDescriptorSupplier() {}
  }

  private static final class GreetingService1MethodDescriptorSupplier
      extends GreetingService1BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    GreetingService1MethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (GreetingService1Grpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GreetingService1FileDescriptorSupplier())
              .addMethod(getGreeting1Method())
              .build();
        }
      }
    }
    return result;
  }
}
