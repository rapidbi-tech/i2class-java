// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) 

package com.ibm.etools.dds.dom.update;

import com.ibm.etools.dds.dom.IDdsKeywordParmExpr;

// Referenced classes of package com.ibm.etools.dds.dom.update:
//            IDdsUnresolvedParm

public interface IUpdatableParmContainer
{

    public abstract void addUnresolvedParm(IDdsUnresolvedParm iddsunresolvedparm);

    public abstract void addUnresolvedParmExpr(IDdsKeywordParmExpr iddskeywordparmexpr);
}
