package com.ife.sap;

import com.ife.sap.SapMod.Procedure;

public interface BlockBehaviourAccessor {
    void sap$initCaches();

    Procedure sap$getProcedure();
}
