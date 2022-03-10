package com.rim.logistics.service.impl.bluedart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.rim.logistics.repository.LogisticsPartnerAccountRepo;
import com.rim.logistics.service.LogisticsPartnerService;

@Service("blue-dart")
public class BlueDartLogisticsPartnerService implements LogisticsPartnerService {

  private final static String SERVICE_FINDER = "/Finder/ServiceFinderQuery.svc?wsdl";

  @Autowired
  private LogisticsPartnerAccountRepo partnerAccountRepo;

  @Autowired
  private RestTemplate restTemplate;


  @Override
  public void createOrder() {
    //Create a @com.rim.logistics.entity.Orders object
    //Persist with status as INITIATED
    //Call the blue dart API
  }
}
