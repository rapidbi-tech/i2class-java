// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) 

package com.ibm.etools.dds.dom.update;


// Referenced classes of package com.ibm.etools.dds.dom.update:
//            ILinePosition

public interface ISourceLocation
{

    public abstract int getLength();

    public abstract ILinePosition getLinePosition();

    public abstract int getStartingOffset();
}
