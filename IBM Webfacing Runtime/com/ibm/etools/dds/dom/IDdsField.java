// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) 

package com.ibm.etools.dds.dom;

import com.ibm.as400ad.code400.dom.constants.FieldType;

// Referenced classes of package com.ibm.etools.dds.dom:
//            IDdsElement, IKeywordContainer, ICommentContainer

public interface IDdsField
    extends IDdsElement, IKeywordContainer, ICommentContainer
{

    public abstract FieldType getFieldType();

    public abstract int getLength();
}
