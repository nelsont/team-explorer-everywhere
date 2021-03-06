// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /complexType.vm template.
 */
package ms.tfs.services.authorization._03;

import com.microsoft.tfs.core.ws.runtime.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;
import com.microsoft.tfs.core.ws.runtime.util.*;
import com.microsoft.tfs.core.ws.runtime.xml.*;

import ms.tfs.services.authorization._03._AuthorizationServiceSoap_ReadAccessControlList;

import java.lang.String;

import java.util.ArrayList;
import java.util.List;

import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;

/**
 * Automatically generated complex type class.
 */
public class _AuthorizationServiceSoap_ReadAccessControlList
    implements ElementSerializable
{
    // No attributes    

    // Elements
    protected String objectId;

    public _AuthorizationServiceSoap_ReadAccessControlList()
    {
        super();
    }

    public _AuthorizationServiceSoap_ReadAccessControlList(final String objectId)
    {
        // TODO : Call super() instead of setting all fields directly?
        setObjectId(objectId);
    }

    public String getObjectId()
    {
        return this.objectId;
    }

    public void setObjectId(String value)
    {
        this.objectId = value;
    }

    public void writeAsElement(
        final XMLStreamWriter writer,
        final String name)
        throws XMLStreamException
    {
        writer.writeStartElement(name);

        // Elements
        XMLStreamWriterHelper.writeElement(
            writer,
            "objectId",
            this.objectId);

        writer.writeEndElement();
    }
}
