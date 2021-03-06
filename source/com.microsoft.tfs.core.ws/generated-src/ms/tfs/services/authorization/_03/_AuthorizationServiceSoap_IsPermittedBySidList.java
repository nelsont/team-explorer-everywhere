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

import ms.tfs.services.authorization._03._AuthorizationServiceSoap_IsPermittedBySidList;

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
public class _AuthorizationServiceSoap_IsPermittedBySidList
    implements ElementSerializable
{
    // No attributes    

    // Elements
    protected String objectId;
    protected String actionId;
    protected String[] userSid;

    public _AuthorizationServiceSoap_IsPermittedBySidList()
    {
        super();
    }

    public _AuthorizationServiceSoap_IsPermittedBySidList(
        final String objectId,
        final String actionId,
        final String[] userSid)
    {
        // TODO : Call super() instead of setting all fields directly?
        setObjectId(objectId);
        setActionId(actionId);
        setUserSid(userSid);
    }

    public String getObjectId()
    {
        return this.objectId;
    }

    public void setObjectId(String value)
    {
        this.objectId = value;
    }

    public String getActionId()
    {
        return this.actionId;
    }

    public void setActionId(String value)
    {
        this.actionId = value;
    }

    public String[] getUserSid()
    {
        return this.userSid;
    }

    public void setUserSid(String[] value)
    {
        this.userSid = value;
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
        XMLStreamWriterHelper.writeElement(
            writer,
            "actionId",
            this.actionId);

        if (this.userSid != null)
        {
            /*
             * The element type is an array.
             */
            writer.writeStartElement("userSid");

            for (int iterator0 = 0; iterator0 < this.userSid.length; iterator0++)
            {
                XMLStreamWriterHelper.writeElement(
                    writer,
                    "string",
                    this.userSid[iterator0]);
            }

            writer.writeEndElement();
        }

        writer.writeEndElement();
    }
}
