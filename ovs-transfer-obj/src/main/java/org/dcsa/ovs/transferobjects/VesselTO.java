package org.dcsa.ovs.transferobjects;

import lombok.Builder;
import org.dcsa.ovs.transferobjects.enums.DimensionUnit;

import java.util.List;

@Builder
public record VesselTO(
  String vesselOperatorCarrierSMDGCode,
  String vesselIMONumber,
  String vesselName,
  String vesselCallSign,
  Float vesselLength,
  Float vesselWidth,
  DimensionUnit dimensionUnit,
  Boolean isDummyVessel,
  List<PortCallTO> portCalls
){}
