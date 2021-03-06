// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /complexType.vm template.
 */
package ms.tfs.build.buildservice._04;

import com.microsoft.tfs.core.ws.runtime.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;
import com.microsoft.tfs.core.ws.runtime.util.*;
import com.microsoft.tfs.core.ws.runtime.xml.*;

import ms.tfs.build.buildservice._04._BuildDefinitionSpec;
import ms.tfs.build.buildservice._04._BuildDetailSpec;
import ms.tfs.build.buildservice._04._BuildQueryOrder;
import ms.tfs.build.buildservice._04._BuildReason;
import ms.tfs.build.buildservice._04._BuildStatus;
import ms.tfs.build.buildservice._04._DefinitionTriggerType;
import ms.tfs.build.buildservice._04._QueryDeletedOption;
import ms.tfs.build.buildservice._04._QueryOptions;

import java.lang.String;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;

/**
 * Automatically generated complex type class.
 */
public class _BuildDetailSpec
    implements ElementSerializable, ElementDeserializable
{
    // Attributes
    protected String buildNumber;
    protected Calendar minFinishTime;
    protected Calendar maxFinishTime;
    protected Calendar minChangedTime;
    protected _BuildStatus status;
    protected _BuildReason reason = new _BuildReason(
                new _BuildReason._BuildReason_Flag[] { _BuildReason._BuildReason_Flag.All });
    protected String quality;
    protected _QueryOptions queryOptions = new _QueryOptions(
                new _QueryOptions._QueryOptions_Flag[] { _QueryOptions._QueryOptions_Flag.None });
    protected _BuildQueryOrder queryOrder = _BuildQueryOrder.StartTimeAscending;
    protected String requestedFor;
    protected int maxBuildsPerDefinition = 2147483647;
    protected _QueryDeletedOption queryDeletedOption = _QueryDeletedOption.ExcludeDeleted;

    // Elements
    /**
     * <p><em>XML Schema Choice Warning</em></p>
     * <p>Only one of these elements may be non-null when this object is serialized:<p>
     * <ul>
     * <li><code>DefinitionSpec</code></li>
     * <li><code>DefinitionUris</code></li>
     * </ul>
     * </p>
     */
    protected _BuildDefinitionSpec definitionSpec;

    /**
     * <p><em>XML Schema Choice Warning</em></p>
     * <p>Only one of these elements may be non-null when this object is serialized:<p>
     * <ul>
     * <li><code>DefinitionSpec</code></li>
     * <li><code>DefinitionUris</code></li>
     * </ul>
     * </p>
     */
    protected String[] definitionUris;
    protected String[] informationTypes;

    public _BuildDetailSpec()
    {
        super();
    }

    public _BuildDetailSpec(
        final String buildNumber,
        final Calendar minFinishTime,
        final Calendar maxFinishTime,
        final Calendar minChangedTime,
        final _BuildStatus status,
        final _BuildReason reason,
        final String quality,
        final _QueryOptions queryOptions,
        final _BuildQueryOrder queryOrder,
        final String requestedFor,
        final int maxBuildsPerDefinition,
        final _QueryDeletedOption queryDeletedOption,
        final _BuildDefinitionSpec definitionSpec,
        final String[] definitionUris,
        final String[] informationTypes)
    {
        // TODO : Call super() instead of setting all fields directly?
        setBuildNumber(buildNumber);
        setMinFinishTime(minFinishTime);
        setMaxFinishTime(maxFinishTime);
        setMinChangedTime(minChangedTime);
        setStatus(status);
        setReason(reason);
        setQuality(quality);
        setQueryOptions(queryOptions);
        setQueryOrder(queryOrder);
        setRequestedFor(requestedFor);
        setMaxBuildsPerDefinition(maxBuildsPerDefinition);
        setQueryDeletedOption(queryDeletedOption);
        setDefinitionSpec(definitionSpec);
        setDefinitionUris(definitionUris);
        setInformationTypes(informationTypes);
    }

    public String getBuildNumber()
    {
        return this.buildNumber;
    }

    public void setBuildNumber(final String value)
    {
        this.buildNumber = value;
    }

    public Calendar getMinFinishTime()
    {
        return this.minFinishTime;
    }

    public void setMinFinishTime(final Calendar value)
    {
        if (value == null)
        {
            throw new IllegalArgumentException("'MinFinishTime' is a required attribute, its value cannot be null");
        }

        this.minFinishTime = value;
    }

    public Calendar getMaxFinishTime()
    {
        return this.maxFinishTime;
    }

    public void setMaxFinishTime(final Calendar value)
    {
        if (value == null)
        {
            throw new IllegalArgumentException("'MaxFinishTime' is a required attribute, its value cannot be null");
        }

        this.maxFinishTime = value;
    }

    public Calendar getMinChangedTime()
    {
        return this.minChangedTime;
    }

    public void setMinChangedTime(final Calendar value)
    {
        if (value == null)
        {
            throw new IllegalArgumentException("'MinChangedTime' is a required attribute, its value cannot be null");
        }

        this.minChangedTime = value;
    }

    public _BuildStatus getStatus()
    {
        return this.status;
    }

    public void setStatus(final _BuildStatus value)
    {
        if (value == null)
        {
            throw new IllegalArgumentException("'Status' is a required attribute, its value cannot be null");
        }

        this.status = value;
    }

    public _BuildReason getReason()
    {
        return this.reason;
    }

    public void setReason(final _BuildReason value)
    {
        this.reason = value;
    }

    public String getQuality()
    {
        return this.quality;
    }

    public void setQuality(final String value)
    {
        this.quality = value;
    }

    public _QueryOptions getQueryOptions()
    {
        return this.queryOptions;
    }

    public void setQueryOptions(final _QueryOptions value)
    {
        this.queryOptions = value;
    }

    public _BuildQueryOrder getQueryOrder()
    {
        return this.queryOrder;
    }

    public void setQueryOrder(final _BuildQueryOrder value)
    {
        this.queryOrder = value;
    }

    public String getRequestedFor()
    {
        return this.requestedFor;
    }

    public void setRequestedFor(final String value)
    {
        this.requestedFor = value;
    }

    public int getMaxBuildsPerDefinition()
    {
        return this.maxBuildsPerDefinition;
    }

    public void setMaxBuildsPerDefinition(final int value)
    {
        this.maxBuildsPerDefinition = value;
    }

    public _QueryDeletedOption getQueryDeletedOption()
    {
        return this.queryDeletedOption;
    }

    public void setQueryDeletedOption(final _QueryDeletedOption value)
    {
        this.queryDeletedOption = value;
    }

    public _BuildDefinitionSpec getDefinitionSpec()
    {
        return this.definitionSpec;
    }

    /**
     * <p><em>XML Schema Choice Warning</em></p>
     * <p>Only one of these elements may be non-null when this object is serialized:<p>
     * <ul>
     * <li><code>DefinitionSpec</code></li>
     * <li><code>DefinitionUris</code></li>
     * </ul>
     * </p>
     */
    public void setDefinitionSpec(_BuildDefinitionSpec value)
    {
        this.definitionSpec = value;
    }

    public String[] getDefinitionUris()
    {
        return this.definitionUris;
    }

    /**
     * <p><em>XML Schema Choice Warning</em></p>
     * <p>Only one of these elements may be non-null when this object is serialized:<p>
     * <ul>
     * <li><code>DefinitionSpec</code></li>
     * <li><code>DefinitionUris</code></li>
     * </ul>
     * </p>
     */
    public void setDefinitionUris(String[] value)
    {
        this.definitionUris = value;
    }

    public String[] getInformationTypes()
    {
        return this.informationTypes;
    }

    public void setInformationTypes(String[] value)
    {
        this.informationTypes = value;
    }

    public void writeAsElement(
        final XMLStreamWriter writer,
        final String name)
        throws XMLStreamException
    {
        writer.writeStartElement(name);

        // Attributes
        XMLStreamWriterHelper.writeAttribute(
            writer,
            "BuildNumber",
            this.buildNumber);
        XMLStreamWriterHelper.writeAttribute(
            writer,
            "MinFinishTime",
            this.minFinishTime,
            true);
        XMLStreamWriterHelper.writeAttribute(
            writer,
            "MaxFinishTime",
            this.maxFinishTime,
            true);
        XMLStreamWriterHelper.writeAttribute(
            writer,
            "MinChangedTime",
            this.minChangedTime,
            true);
        this.status.writeAsAttribute(
            writer,
            "Status");

        if (this.reason != null)
        {
            this.reason.writeAsAttribute(
                writer,
                "Reason");
        }

        XMLStreamWriterHelper.writeAttribute(
            writer,
            "Quality",
            this.quality);

        if (this.queryOptions != null)
        {
            this.queryOptions.writeAsAttribute(
                writer,
                "QueryOptions");
        }

        if (this.queryOrder != null)
        {
            this.queryOrder.writeAsAttribute(
                writer,
                "QueryOrder");
        }

        XMLStreamWriterHelper.writeAttribute(
            writer,
            "RequestedFor",
            this.requestedFor);
        XMLStreamWriterHelper.writeAttribute(
            writer,
            "MaxBuildsPerDefinition",
            this.maxBuildsPerDefinition);

        if (this.queryDeletedOption != null)
        {
            this.queryDeletedOption.writeAsAttribute(
                writer,
                "QueryDeletedOption");
        }

        // Elements
        if (this.definitionSpec != null)
        {
            this.definitionSpec.writeAsElement(
                writer,
                "DefinitionSpec");
        }

        if (this.definitionUris != null)
        {
            /*
             * The element type is an array.
             */
            writer.writeStartElement("DefinitionUris");

            for (int iterator0 = 0; iterator0 < this.definitionUris.length; iterator0++)
            {
                XMLStreamWriterHelper.writeElement(
                    writer,
                    "string",
                    this.definitionUris[iterator0]);
            }

            writer.writeEndElement();
        }

        if (this.informationTypes != null)
        {
            /*
             * The element type is an array.
             */
            writer.writeStartElement("InformationTypes");

            for (int iterator0 = 0; iterator0 < this.informationTypes.length; iterator0++)
            {
                XMLStreamWriterHelper.writeElement(
                    writer,
                    "string",
                    this.informationTypes[iterator0]);
            }

            writer.writeEndElement();
        }

        writer.writeEndElement();
    }

    public void readFromElement(final XMLStreamReader reader)
        throws XMLStreamException
    {
        String localName;

        // Attributes
        final int attributeCount = reader.getAttributeCount();
        String attributeValue;

        for (int i = 0; i < attributeCount; i++)
        {
            localName = reader.getAttributeLocalName(i);
            attributeValue = reader.getAttributeValue(i);

            if (localName.equalsIgnoreCase("BuildNumber"))
            {
                this.buildNumber = attributeValue;
            }
            else if (localName.equalsIgnoreCase("MinFinishTime"))
            {
                this.minFinishTime = XMLConvert.toCalendar(
                        attributeValue,
                        true);
            }
            else if (localName.equalsIgnoreCase("MaxFinishTime"))
            {
                this.maxFinishTime = XMLConvert.toCalendar(
                        attributeValue,
                        true);
            }
            else if (localName.equalsIgnoreCase("MinChangedTime"))
            {
                this.minChangedTime = XMLConvert.toCalendar(
                        attributeValue,
                        true);
            }
            else if (localName.equalsIgnoreCase("Status"))
            {
                this.status = new _BuildStatus();
                this.status.readFromAttribute(attributeValue);
            }
            else if (localName.equalsIgnoreCase("Reason"))
            {
                this.reason = new _BuildReason();
                this.reason.readFromAttribute(attributeValue);
            }
            else if (localName.equalsIgnoreCase("Quality"))
            {
                this.quality = attributeValue;
            }
            else if (localName.equalsIgnoreCase("QueryOptions"))
            {
                this.queryOptions = new _QueryOptions();
                this.queryOptions.readFromAttribute(attributeValue);
            }
            else if (localName.equalsIgnoreCase("QueryOrder"))
            {
                this.queryOrder = _BuildQueryOrder.fromString(attributeValue);
            }
            else if (localName.equalsIgnoreCase("RequestedFor"))
            {
                this.requestedFor = attributeValue;
            }
            else if (localName.equalsIgnoreCase("MaxBuildsPerDefinition"))
            {
                this.maxBuildsPerDefinition = XMLConvert.toInt(attributeValue);
            }
            else if (localName.equalsIgnoreCase("QueryDeletedOption"))
            {
                this.queryDeletedOption = _QueryDeletedOption.fromString(attributeValue);
            }

            // Ignore unknown attributes.
        }

        // Elements
        int event;

        do
        {
            event = reader.next();

            if (event == XMLStreamConstants.START_ELEMENT)
            {
                localName = reader.getLocalName();

                if (localName.equalsIgnoreCase("DefinitionSpec"))
                {
                    this.definitionSpec = new _BuildDefinitionSpec();
                    this.definitionSpec.readFromElement(reader);
                }
                else if (localName.equalsIgnoreCase("DefinitionUris"))
                {
                    /*
                     * The element type is an array.
                     */
                    int event0;
                    final List list0 = new ArrayList();

                    do
                    {
                        event0 = reader.nextTag();

                        if (event0 == XMLStreamConstants.START_ELEMENT)
                        {
                            list0.add(reader.getElementText());
                        }
                    }
                    while (event0 != XMLStreamConstants.END_ELEMENT);

                    this.definitionUris = (String[]) list0.toArray(new String[list0.size()]);
                }
                else if (localName.equalsIgnoreCase("InformationTypes"))
                {
                    /*
                     * The element type is an array.
                     */
                    int event0;
                    final List list0 = new ArrayList();

                    do
                    {
                        event0 = reader.nextTag();

                        if (event0 == XMLStreamConstants.START_ELEMENT)
                        {
                            list0.add(reader.getElementText());
                        }
                    }
                    while (event0 != XMLStreamConstants.END_ELEMENT);

                    this.informationTypes = (String[]) list0.toArray(new String[list0.size()]);
                }
                else
                {
                    // Read the unknown child element until its end
                    XMLStreamReaderHelper.readUntilElementEnd(reader);
                }
            }
        }
        while (event != XMLStreamConstants.END_ELEMENT);
    }
}
