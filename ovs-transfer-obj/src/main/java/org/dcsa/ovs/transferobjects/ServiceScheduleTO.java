package org.dcsa.ovs.transferobjects;

import lombok.Builder;

import java.util.List;

public record ServiceScheduleTO (
  String carrierServiceName,
  String carrierServiceCode,
  String universalServiceReference,
  List<VesselScheduleTO> vesselSchedules
){
  @Builder(toBuilder = true) // workaround for intellij issue
  public ServiceScheduleTO {}
}
