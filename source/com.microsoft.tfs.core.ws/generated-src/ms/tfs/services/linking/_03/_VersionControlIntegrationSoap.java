// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /serviceInterface.vm template.
 */
package ms.tfs.services.linking._03;

import com.microsoft.tfs.core.ws.runtime.exceptions.*;
import com.microsoft.tfs.core.ws.runtime.types.*;

import ms.tfs.services.linking._03._Artifact;
import ms.tfs.services.linking._03._ExtendedAttribute;
import ms.tfs.services.linking._03._OutboundLink;
import ms.tfs.services.linking._03._VersionControlIntegrationSoap_GetArtifacts;
import ms.tfs.services.linking._03._VersionControlIntegrationSoap_GetArtifactsResponse;

import java.lang.String;

/**
 * Automatically generated service interface.
 *
 * {http://schemas.microsoft.com/TeamFoundation/2005/06/Services/Linking/03}VersionControlIntegrationSoap
 */
public interface _VersionControlIntegrationSoap
{
    public _Artifact[] getArtifacts(final String[] artifactUris)
        throws TransportException, SOAPFault;
}
