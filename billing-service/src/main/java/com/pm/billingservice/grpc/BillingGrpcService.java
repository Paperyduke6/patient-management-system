package com.pm.billingservice.grpc;

import billing.BilliingServiceGrpc.BilliingServiceImplBase ;
import billing.BillingRequest;
import billing.BillingResponse;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@GrpcService
public class BillingGrpcService extends BilliingServiceImplBase{
    private static final Logger log = LoggerFactory.getLogger(BillingGrpcService.class);

//    @Override
    public void createBillingAccount(BillingRequest request, StreamObserver<BillingResponse> responseObserver) {
        log.info("createBillingAccount request received {}", request.toString());

//        Business Logic e.g. database updates or performing calculations
//        should be used instead of the following dummy code

        BillingResponse response = BillingResponse.newBuilder()
                .setAccountId("12345")
                .setStatus("ACTIVE")
                .build() ;

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
