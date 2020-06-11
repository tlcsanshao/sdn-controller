package com.sino.sdn.dci.application.config;

import com.google.common.collect.ImmutableSet;
import org.opendaylight.yangtools.yang.binding.YangModuleInfo;

import java.util.Set;

public class NetConfConfig {

    public static final Set<YangModuleInfo> NETCONF_OTN_MODELS = ImmutableSet.of(

            org.opendaylight.yang.gen.v1.urn.ccsa.yang.acc._enum.norev.$YangModuleInfoImpl.getInstance(),
            org.opendaylight.yang.gen.v1.urn.ccsa.yang.acc.alarms.rev190213.$YangModuleInfoImpl.getInstance(),
            org.opendaylight.yang.gen.v1.urn.ccsa.yang.acc.connection.rev200209.$YangModuleInfoImpl.getInstance(),
            org.opendaylight.yang.gen.v1.urn.ccsa.yang.acc.devm.rev190213.$YangModuleInfoImpl.getInstance(),
            org.opendaylight.yang.gen.v1.urn.ccsa.yang.acc.eos.rev190213.$YangModuleInfoImpl.getInstance(),
            org.opendaylight.yang.gen.v1.urn.ccsa.yang.acc.eth.rev200209.$YangModuleInfoImpl.getInstance(),
            org.opendaylight.yang.gen.v1.urn.ccsa.yang.acc.notifications.norev.$YangModuleInfoImpl.getInstance(),
            org.opendaylight.yang.gen.v1.urn.ccsa.yang.acc.otn.rev190213.$YangModuleInfoImpl.getInstance(),
            org.opendaylight.yang.gen.v1.urn.ccsa.yang.acc.performance.rev190213.$YangModuleInfoImpl.getInstance(),

            org.opendaylight.yang.gen.v1.urn.ccsa.yang.acc.protection.group.norev.$YangModuleInfoImpl.getInstance(),
            org.opendaylight.yang.gen.v1.urn.ccsa.yang.acc.sdh.norev.$YangModuleInfoImpl.getInstance(),
            org.opendaylight.yang.gen.v1.urn.ccsa.yang.acc.yang.types.rev190213.$YangModuleInfoImpl.getInstance()
    );

}
