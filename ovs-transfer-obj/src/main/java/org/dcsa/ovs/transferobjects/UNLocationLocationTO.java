package org.dcsa.ovs.transferobjects;

import lombok.Builder;

public record UNLocationLocationTO(
  String locationName,
  String UNLocationCode
) implements PortTerminalLocation {
  @Builder // workaround for intellij issue
  public UNLocationLocationTO { }
}
