package com.rim.logistics.service.factory;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rim.logistics.entity.Partner;
import com.rim.logistics.service.LogisticsPartnerService;

@Component
public class LogisticsPartnerServiceFactory {

  @Autowired
  private Map<String, LogisticsPartnerService> services;

  public LogisticsPartnerService get(Partner partner) {
    return services.get(partner.getName());
  }
}
