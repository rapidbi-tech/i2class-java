// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) 

package com.ibm.etools.dds.dom;

import java.util.Iterator;

// Referenced classes of package com.ibm.etools.dds.dom:
//            IDdsElement, IKeywordContainer, ICommentContainer

public interface IDdsRecord
    extends IDdsElement, IKeywordContainer, ICommentContainer
{

    public abstract int getRecordType();

    public abstract Iterator getFieldIterator();
}
