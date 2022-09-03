package com.example;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.46.0)",
    comments = "Source: demoGrpc.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class DemoGrpcServiceGrpc {

  private DemoGrpcServiceGrpc() {}

  public static final String SERVICE_NAME = "com.example.DemoGrpcService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.DemoGrpcRequest,
      com.example.DemoGrpcReply> getSendMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "send",
      requestType = com.example.DemoGrpcRequest.class,
      responseType = com.example.DemoGrpcReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.DemoGrpcRequest,
      com.example.DemoGrpcReply> getSendMethod() {
    io.grpc.MethodDescriptor<com.example.DemoGrpcRequest, com.example.DemoGrpcReply> getSendMethod;
    if ((getSendMethod = DemoGrpcServiceGrpc.getSendMethod) == null) {
      synchronized (DemoGrpcServiceGrpc.class) {
        if ((getSendMethod = DemoGrpcServiceGrpc.getSendMethod) == null) {
          DemoGrpcServiceGrpc.getSendMethod = getSendMethod =
              io.grpc.MethodDescriptor.<com.example.DemoGrpcRequest, com.example.DemoGrpcReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "send"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.DemoGrpcRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.DemoGrpcReply.getDefaultInstance()))
              .setSchemaDescriptor(new DemoGrpcServiceMethodDescriptorSupplier("send"))
              .build();
        }
      }
    }
    return getSendMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DemoGrpcServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DemoGrpcServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DemoGrpcServiceStub>() {
        @java.lang.Override
        public DemoGrpcServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DemoGrpcServiceStub(channel, callOptions);
        }
      };
    return DemoGrpcServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DemoGrpcServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DemoGrpcServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DemoGrpcServiceBlockingStub>() {
        @java.lang.Override
        public DemoGrpcServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DemoGrpcServiceBlockingStub(channel, callOptions);
        }
      };
    return DemoGrpcServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DemoGrpcServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DemoGrpcServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DemoGrpcServiceFutureStub>() {
        @java.lang.Override
        public DemoGrpcServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DemoGrpcServiceFutureStub(channel, callOptions);
        }
      };
    return DemoGrpcServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class DemoGrpcServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void send(com.example.DemoGrpcRequest request,
        io.grpc.stub.StreamObserver<com.example.DemoGrpcReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSendMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSendMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.DemoGrpcRequest,
                com.example.DemoGrpcReply>(
                  this, METHODID_SEND)))
          .build();
    }
  }

  /**
   */
  public static final class DemoGrpcServiceStub extends io.grpc.stub.AbstractAsyncStub<DemoGrpcServiceStub> {
    private DemoGrpcServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DemoGrpcServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DemoGrpcServiceStub(channel, callOptions);
    }

    /**
     */
    public void send(com.example.DemoGrpcRequest request,
        io.grpc.stub.StreamObserver<com.example.DemoGrpcReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSendMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class DemoGrpcServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<DemoGrpcServiceBlockingStub> {
    private DemoGrpcServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DemoGrpcServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DemoGrpcServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.DemoGrpcReply send(com.example.DemoGrpcRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSendMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class DemoGrpcServiceFutureStub extends io.grpc.stub.AbstractFutureStub<DemoGrpcServiceFutureStub> {
    private DemoGrpcServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DemoGrpcServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DemoGrpcServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.DemoGrpcReply> send(
        com.example.DemoGrpcRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSendMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEND = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DemoGrpcServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DemoGrpcServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEND:
          serviceImpl.send((com.example.DemoGrpcRequest) request,
              (io.grpc.stub.StreamObserver<com.example.DemoGrpcReply>) responseObserver);
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

  private static abstract class DemoGrpcServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DemoGrpcServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.DemoGrpc.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DemoGrpcService");
    }
  }

  private static final class DemoGrpcServiceFileDescriptorSupplier
      extends DemoGrpcServiceBaseDescriptorSupplier {
    DemoGrpcServiceFileDescriptorSupplier() {}
  }

  private static final class DemoGrpcServiceMethodDescriptorSupplier
      extends DemoGrpcServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DemoGrpcServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (DemoGrpcServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DemoGrpcServiceFileDescriptorSupplier())
              .addMethod(getSendMethod())
              .build();
        }
      }
    }
    return result;
  }
}
